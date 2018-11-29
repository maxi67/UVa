import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		boolean prime[] = new boolean[32770];
		Arrays.fill(prime, true);
		
		prime[1] = false;
		for (int i = 3; i <= 32768; i+=2) {
			if (prime[i])
				for (int j = i; i*j <= 32768; j+=2) 
					prime[i * j] = false;	
		}

		while (sc.hasNext()) {
			int ans = 0;
			int n = sc.nextInt();
			if (n == 0)
				break;
			
			if (n == 4) 
				System.out.println(1);
			
			else {
				for (int i = 3; i <= n/2; i+=2) {
					if (prime[i] && prime[n - i]) 
						ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
