import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N-- >0) {
			int sum1 = 0, sum2 = 0;
			for (int i = 1; i <= 4; i++) {
				int num = sc.nextInt();
				sum2 += num % 10;
				
				num /= 10;
				int a1 = 2*(num % 10);
				sum1 += (a1>=10) ? (a1%10 + a1/10) : a1;
				
				num /= 10;
				sum2 += num % 10;
				
				num /= 10;
				a1 = 2 * (num % 10);
				sum1 += (a1>=10) ? (a1%10 + a1/10) : a1;
			}
			
			if ((sum1 + sum2) % 10 == 0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");		
		}
	}
}
