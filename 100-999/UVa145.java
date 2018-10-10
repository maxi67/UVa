import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		double[][] rate = { {0.10, 0.06, 0.02}, 
							{0.25, 0.15, 0.05},
							{0.53, 0.33, 0.13},
							{0.87, 0.47, 0.17},
							{1.44, 0.80, 0.30}};
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int D = 0, E = 0, N = 0;
			boolean get[] = new boolean[1440];
			String[] s = sc.nextLine().split(" ");
			if (s[0].equals("#"))
				break;
			
			int index = s[0].charAt(0) - 'A';
			int min1 = Integer.valueOf(s[2]) * 60 + Integer.valueOf(s[3]);
			int min2 = Integer.valueOf(s[4]) * 60 + Integer.valueOf(s[5]);
		
			if (min1 < min2) 
				for (int i = min1; i < min2; i++)
					get[i] = true;
			else {
				for (int i = 0; i < min2; i++)
					get[i] = true;
				for (int i = min1; i < 1440; i++)
					get[i] = true;
			}
			
			for (int i = 0; i < 480; i++)
				N += (get[i] ? 1 : 0);
			for (int i = 480; i < 1080; i++)
				D += (get[i] ? 1 : 0);
			for (int i = 1080; i < 1320; i++)
				E += (get[i] ? 1 : 0);
			for (int i = 1320; i < 1440; i++)
				N += (get[i] ? 1 : 0);
			
			double sum = rate[index][0] * D + rate[index][1] * E + rate[index][2] * N;
				
			System.out.printf("%10s%6d%6d%6d%3s%8.2f\n", s[1], D, E, N, s[0], sum);
		}
	}
}
