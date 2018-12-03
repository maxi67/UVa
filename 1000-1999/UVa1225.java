import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while (T-- > 0) {
			int c[] = new int[10];
			int N = sc.nextInt();
			
			for (int i = 1; i <= N; i++) {
				int tmp = i;
				while (tmp >= 10) {
					c[tmp%10]++;
					tmp /= 10;
				}
				c[tmp]++;
			}
						
			System.out.print(c[0]);
			for (int i = 1; i <= 9; i++)
				System.out.print(" " + c[i]);
			System.out.println();
		}
	}
}
