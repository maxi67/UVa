import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int max = 0;
			while (N-- > 0) {
				int c = sc.nextInt();
				max = c > max ? c : max;
			}
			System.out.println("Case " + i + ": " + max);
		}
	}
}
