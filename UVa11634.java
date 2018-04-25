import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a0 = sc.nextInt();
			if (a0 == 0)
				break;
			int count = 0;
			boolean check[] = new boolean[10001];
			while (!check[a0]) {
				count++;
				check[a0] = true;
				a0 *= a0;
				a0 /= 100;
				a0 %= 10000;
			}
			System.out.println(count);
		}
	}
}
