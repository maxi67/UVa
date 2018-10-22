import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long N = sc.nextLong();
			if (N == 0)
				break;
			
			long dou = Math.round(Math.pow(N, (float)1/6));
			if (dou*dou*dou*dou*dou*dou == N)
				System.out.println("Special");
			else
				System.out.println("Ordinary");
		}
	}
}
