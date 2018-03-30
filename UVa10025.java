import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = Math.abs(Integer.valueOf(sc.nextLine()));
		
		for (int i = 0; i < T; i++) {
			sc.nextLine();
			int k = Math.abs(Integer.valueOf(sc.nextLine()));
			int n = (-1 + (int)Math.sqrt(1 + 8*k))/2;
        
			int sum = (n + 1) * n / 2;
			while (sum < k || (sum - k) % 2 != 0) {
				n++;
				sum += n;
			}
			
			if (i != 0)
				System.out.println();
			
			if (k == 0)
				System.out.println("3");
			else
				System.out.println(n);
		}
	}
}
