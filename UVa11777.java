import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int sum = sc.nextInt();
			sum += sc.nextInt();
			sum += sc.nextInt();
			sum += sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			sum += ((a+b+c-Math.min(a,Math.min(b, c)))/2);
			System.out.print("Case " + t);
			if (sum >= 90)
				System.out.println(": A");
			else if (sum >= 80)
				System.out.println(": B");
			else if (sum >= 70)
				System.out.println(": C");
			else if (sum >= 60)
				System.out.println(": D");
			else 
				System.out.println(": F");
		}
	}
}
