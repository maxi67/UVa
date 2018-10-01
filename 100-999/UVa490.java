import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[][] data = new char[101][101];
		int lines = 0, max = 0;
		
		while (sc.hasNext()){
			String s1 = sc.nextLine();	
			max = (s1.length() > max) ? s1.length() : max;
            
			for (int i = 0; i < s1.length(); i++)
				data[lines][i] = s1.charAt(i);
			lines++;
		}
		
		for (int j = 0; j < max; j++) {
			for (int k = lines - 1; k >= 0; k--) {
				if (data[k][j] == '\0') { 
						if (k != 0)
							System.out.print(" ");
				} else
					System.out.print(data[k][j]);
			}
			System.out.println();
		}
	}
}
