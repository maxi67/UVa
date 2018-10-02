import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long N = sc.nextLong();
			if (N == 0)
				break;

			long ans = 0, times, R, L = 1;

			while (L <= N) {
				times = N / L;
				R = N / times;
				ans += times * ((L + R) * (R - L + 1) / 2);
				L = R + 1;
			}
			System.out.println(ans - 1);
		}
	}
}
