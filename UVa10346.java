import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans = n;
			while (n >= k) {
				int tmp = n % k;
				n /= k;
				ans += n;
				n += tmp;
			}
			System.out.println(ans);
		}
	}
}
