import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N-- > 0) {
			int e = sc.nextInt();
			int f = sc.nextInt();
			int c = sc.nextInt();
			int own = e + f;
			int ans = 0;
			while (own >= c) {
				ans += (own / c);
				if (own % c == 0)
					own /= c;
				else
					own -= (own/c)*(c-1); 
			}
			System.out.println(ans);
		}
	}
}
