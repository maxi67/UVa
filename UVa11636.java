import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int pow[] = new int[20];
		pow[0] = 1;
		
		for (int n = 1, i = 1; i < 20; i++) {
			n *= 2;
			pow[i] = n;
		}
		
		while (sc.hasNext()) {
			c++;
			int N = sc.nextInt();
			if (N < 0)
				break;
			
			int ans = 0;
			while (pow[ans] < N)
				ans++;
			System.out.println("Case " + c + ": " +ans);	
		}
	}
}
