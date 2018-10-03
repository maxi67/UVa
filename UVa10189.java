import java.util.*;

public class Main {
	public static int n, m;
	
	public static int checkNum(char f[][], int y, int x) {
		if (f[y][x] == '*')
			return 0;
		
		int sum = 0;
		if (y-1 >= 0 && x-1 >= 0) //leftup
			if (f[y-1][x-1] == '*')
				sum++;
		if (y-1 >= 0) //up
			if (f[y-1][x] == '*')
				sum++;
		if (y-1 >= 0 && x+1 <= m-1) //rightup
			if (f[y-1][x+1] == '*')
				sum++;
		if (x-1 >= 0) //left
			if (f[y][x-1] == '*')
				sum++;
		if (x+1 <= m-1) //right
			if (f[y][x+1] == '*')
				sum++;
		if (y+1 <= n-1 && x-1 >= 0) //leftdown
			if (f[y+1][x-1] == '*')
				sum++;
		if (y+1 <= n-1) //down
			if (f[y+1][x] == '*')
				sum++;
		if (y+1 <= n-1 && x+1 <= m-1) //rightdown
			if (f[y+1][x+1] == '*')
				sum++;
		return sum;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Cases = 1;
		while (sc.hasNext()) {
			n = Integer.valueOf(sc.next());
			m = Integer.valueOf(sc.next());
			if (n == 0 && m == 0)
				break;

			char f[][] = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++)
					f[i][j] = s.charAt(j);
			}
			
			if (Cases != 1)
				System.out.println();
			System.out.println("Field #" + Cases++ + ":");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (f[i][j] == '*')
						System.out.print("*");
					else
						System.out.print(checkNum(f, i, j));
				}
				System.out.println();
			}
		}
	}
}
