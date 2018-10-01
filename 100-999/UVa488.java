import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int r = 1; r <= t; r++) {
			if (r != 1)
				System.out.println();
			
			int Am = sc.nextInt();
			int Fre = sc.nextInt();
			
			for (int i = 1; i <= Fre; i++) {
				if (i != 1)
					System.out.println();
				
				for (int j = 1; j <= Am; j++) {
					for (int k = 1; k <= j; k++)
						System.out.print(j);
					System.out.println();
				}
				
				for (int j = Am - 1; j > 0; j--) {
					for (int k = 1; k <= j; k++)
						System.out.print(j);
					System.out.println();
				}
			}
		}
	}
}
