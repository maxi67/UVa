import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.valueOf(sc.nextLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.valueOf(sc.nextLine());
			int num = 0;
			
			String f = sc.nextLine();	
			for (int j = 0; j < N; j++) {
				if (f.charAt(j) == '.') {	
					num++;
					j += 2;
				}
			}
			
			System.out.println("Case " + i + ": " + num);
		}
	}
}
