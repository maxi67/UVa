import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			for (int i = 1; i <= N; i++) {
				int tmp = sc.nextInt();
				if (i == N/2+1)
					System.out.println("Case " + t + ": " + tmp);
			}
		}
	}
}
