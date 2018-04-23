import java.util.*;

public class Main {
	public static int GCD(int i, int j) {
		return (j == 0) ? i : GCD(j, i%j);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int G = 0;
			int N = sc.nextInt();
			if (N == 0)
				break;
			
			for (int i = 1; i < N; i++)
				for (int j = i + 1; j <= N; j++)
					G += GCD(i, j);
				
			System.out.println(G);
		}
	}
}
