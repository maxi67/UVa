import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		
		while (sc.hasNext()) {
			t++;
			long N = sc.nextLong();
			long sq = (long)Math.sqrt(N+0.5);
			long sum = 0;
			int count = 0;
			
			if (N == 0)
				break;
			
			if (N == 1)
				sum = 2;
			
			else {
				for (long i = 2; i <= sq; i++) {
					if (N % i == 0) { //prime factor
						long factor = 1;
				        while (N % i == 0 && N > 1){
				        	factor *= i;
				        	N /= i;
				        }
				        sum += factor;
				        count++;
					}
				}
				
				if (N > 1) { //prime
					count++;
					sum += N;
				}
				
				//number of prime factor = 1
				if (count == 1)
					sum++;
			}
			
			System.out.println("Case " + t + ": " + sum);
		}
	}
}
