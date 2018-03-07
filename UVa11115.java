import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			
			if (N == 0 && D == 0)
				break;
			
			BigInteger n = new BigInteger(String.valueOf(N));
			System.out.println(n.pow(D));
		}
	}
}
