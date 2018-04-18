import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while (T-- > 0) {
			String s = sc.nextLine();
			double root = Math.sqrt((double)s.length());
			
			if (root %1 != 0.0)
				System.out.println("INVALID");
			
			else {
				char matrix[][] = new char[(int)root][(int)root];
				for (int i = 0, z = 0; i < root; i++)
					for (int j = 0; j < root; j++, z++) {
						matrix[i][j] = s.charAt(z); 
					}
				
				for (int i = 0; i < root; i++)
					for (int j = 0; j < root; j++) {
						System.out.print(matrix[j][i]);
					}
				System.out.println();		
			}
		}
	}
}
