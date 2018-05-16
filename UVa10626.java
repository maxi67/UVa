import java.util.*;

public class Main {
	// 500, 100, 50
	static int dp[][][];
	
	public static int buy(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		
		if (dp[a][b][c] != 0)
			return dp[a][b][c];
		
		dp[a][b][c] = Integer.MAX_VALUE;
		if (c >= 1)
			dp[a][b][c] = Math.min(dp[a][b][c], buy(n-1, a+2, b, c-1) + 1);
		if (a >= 3 && c >= 1)
			dp[a][b][c] = Math.min(dp[a][b][c], buy(n-1, a-3, b+1, c-1) + 4);
		if (b >= 2)
			dp[a][b][c] = Math.min(dp[a][b][c], buy(n-1, a+2, b-2, c) + 2);
		if (b >= 1 && a >= 3)
			dp[a][b][c] = Math.min(dp[a][b][c], buy(n-1, a-3, b-1, c) + 4);
		if (a >= 8)
			dp[a][b][c] = Math.min(dp[a][b][c], buy(n-1, a-8, b, c) + 8);
		
		return dp[a][b][c];
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			dp = new int[800][200][100];
			
			int num = sc.nextInt();
			int n1 = sc.nextInt();
			int n5 = sc.nextInt();
			int n10 = sc.nextInt();
			System.out.println(buy(num, n1, n5, n10));
		}
	}
}
