import java.util.*;

public class Main {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int N = sc.nextInt();
			int P[] = new int[N];
			int W[] = new int[N];
			int value[] = new int[32];
			for (int i = 0; i < N; i++) {
				P[i] = sc.nextInt();
				W[i] = sc.nextInt();
			}
			
			for (int i = 0; i < N; i++)
				for (int j = 31; j >= 0; j--)
					if (W[i] <= j && value[j] < value[j - W[i]] + P[i])
						value[j] = value[j - W[i]] + P[i];
			
			int G = sc.nextInt();
			int knapsack = 0;
			for (int i = 0; i < G; i++) {
				int MW = sc.nextInt();
				knapsack += value[MW];
			}
			System.out.println(knapsack);
		}
	}
}
