import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			long n = sc.nextLong();
			if (n == 0)
				break;

			if (Math.sqrt(n) % 1 == 0.0)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
