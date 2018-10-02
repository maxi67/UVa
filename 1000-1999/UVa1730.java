import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long N = sc.nextLong();
			if (N == 0)
				break;
			
			long sum = 0;
			long ans = 0, times, R, L = 1;
			long count = 0;
			
			while (L <= N) {
				times = N / L;
				R = N / times;
				ans += times * ((L + R) * (R - L + 1) / 2);
				L = R + 1;
				count++;
			}
			System.out.println(ans - 1);
		}
	}
}
