import java.util.*;

public class Main {
	public static boolean[] visit = new boolean[101];
	public static int[] times = new int[101];
	public static boolean[][] map = new boolean[101][101];
	
	public static void DFS(int m, int s, int N) {
		for (int i = 1 ; i <= N; i++) {
			if (map[s][i] && !visit[i]) {
				visit[i] = true;
				times[m]++;
				DFS(m, i, N);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N == 0)
				break;
			
			Arrays.fill(visit, false);
			Arrays.fill(times, 0);
			for (int i = 0; i < 101; i++)
				Arrays.fill(map[i], false);
			
			for (int i = 1; i <= N; i++) {
				int T = sc.nextInt();
				while (T-- > 0) {
					int dir = sc.nextInt();
					map[i][dir] = true;
				}
			}
			
			int Max = 0;
			int index = 0;
			for (int i = 1; i <= N; i++) {
				Arrays.fill(visit, false);
				visit[i] = true;
				DFS(i, i, N);
				if (times[i] > Max) {
					Max = times[i];
					index = i;
				}
			}
			System.out.println(index);
		}
	}
}
