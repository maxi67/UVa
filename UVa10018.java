import java.util.*;

public class Main {
	public static long getReverse(long x) {
		
		if (x < 10)
			return x;
		else {
			long x1 = x, y = 0;
			while (x1 > 0) {
				y = (y * 10) + (x1 % 10);
				x1 /= 10;
			}
			return y;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		
		for (int i = 0;i < N; i++) {
			long P = sc.nextInt();
		
			long count = 1;
			P = P + getReverse(P);
			
			while (getReverse(P) != P) {
				P = P + getReverse(P);
				count++;
			}
			
			System.out.println(count + " " + P);
		}
	}
}
