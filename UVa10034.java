import java.util.*;

public class Main {
	public static class point{
		double x, y;
	}
	
	public static double getDis(point p1, point p2) {
		return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
	} 
	
	public static double prim(point[] p) {
		double ans = 0.0; //total distance of MST
		int n = p.length;
		
		double w[][] = new double[n][n]; // weight of any two points
		double dis[] =  new double[n]; // distance between MST and other points
		boolean MST[] = new boolean[n]; // already add into MST or not

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				w[i][j] = w[j][i] = getDis(p[i], p[j]);
		
		MST[0] = true;
		for (int i = 0; i < n; i++) 
			dis[i] = w[0][i];
			
		for (int i = 1; i < n; i++) {
			int index = 0;
			double min = Double.MAX_VALUE;
			
			// get Minimal distance to visit
			for (int j = 0; j < n; j++) 
				if (dis[j] < min && !MST[j]) {
					min = dis[j];
					index = j;
				}
			
			// no more minimal
			if (index == 0)
				break;
			
			MST[index] = true;
			ans += min;
			
			// update distance between new MST and other points 
			for (int j = 0; j < n; j++)
				dis[j] = w[index][j] < dis[j] ? w[index][j] : dis[j];
		}
			
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Case = Integer.valueOf(sc.nextLine());
		for (int c = 1; c <= Case; c++) {
			if (c != 1)
				System.out.println();
			
			sc.nextLine();
			int n = Integer.valueOf(sc.nextLine());
			point p[] = new point[n];
			
			for (int i = 0; i < n; i++) {
				String str[] = sc.nextLine().split(" ");
				p[i] = new point();
				p[i].x = Double.valueOf(str[0]);
				p[i].y = Double.valueOf(str[1]);
			}
			
			System.out.printf("%.2f\n", prim(p));
		}
	}
}
