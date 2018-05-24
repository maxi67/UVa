import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		
		for (int i = 1; i <= t; i++) {
			System.out.print("Case " + i + ": ");
			
			String s = sc.nextLine();
			int index = 0;
			char c; 
			while (index != s.length()) {
				
				c = s.charAt(index++);
				int begin = index;
				while ((s.charAt(index) >= 48) && (s.charAt(index) <= 57)) {
					if (++index == s.length())
						break;
				}
				
				for (int j = 1; j <= Integer.valueOf(s.substring(begin, index)); j++)
					System.out.print(c);
				
			}
			System.out.println();
		}		
	}
} 
