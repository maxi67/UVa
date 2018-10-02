import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.valueOf(sc.nextLine());
		
		while (T-- > 0) {
			int score = 0;
			String s= sc.nextLine();
			for (int i = 0, j = 1; i < s.length(); i++) {
				if (s.charAt(i) == 'O') 
					score += (j++);
				
				else 
					j = 1;
				
			}
			System.out.println(score);
		}
	}
}
