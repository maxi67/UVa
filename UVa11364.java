import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int max = -1, min = 100;
			while (n-- > 0) {
				int x = sc.nextInt();
				if (x > max)
					max = x;
				if (x < min)
					min = x;
			}
			System.out.println("" + 2*(max - min));
		}
	}
}
