import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int B = sc.nextInt();
			BigInteger sum = BigInteger.ZERO;
			while (B-- > 0) {
				int K = sc.nextInt();
				BigInteger box = BigInteger.ONE;
				
				while (K-- > 0) {
					box = box.multiply(BigInteger.valueOf(sc.nextInt()));
				}
				sum = sum.add(box);
			}
			System.out.println(sum.remainder(BigInteger.valueOf(N)));
		}
	}
}
