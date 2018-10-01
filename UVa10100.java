import java.util.*;

public class Main {
	
	public static boolean isLetter(char c) {
		return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cases = 1;
		
		while (sc.hasNext()) {
			System.out.printf("%2d. ",cases++);
			String S1 = sc.nextLine();
			String S2 = sc.nextLine();
			
			if (S1.length() == 0 || S2.length() == 0) {
				System.out.printf("Blank!\n");
			} else {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < S1.length(); i++) {
					if (!isLetter(S1.charAt(i))) 
						sb.append(" ");		
					else
						sb.append(S1.charAt(i));
				}
				String s1[] = sb.toString().split(" ");
				
				sb = new StringBuilder();
				for (int i = 0; i < S2.length(); i++) {
					if (!isLetter(S2.charAt(i))) 
						sb.append(" ");		
					else
						sb.append(S2.charAt(i));
				}
				String s2[] = sb.toString().split(" ");

				int ff[][] = new int[s1.length+1][s2.length+1];
				for (int i = 1; i <= s1.length; i++)
					for (int j = 1; j <= s2.length; j++) {
						ff[i][j] = ff[i-1][j];
						if (ff[i][j] < ff[i][j-1])
							ff[i][j] = ff[i][j-1];
						if (s1[i-1].equals(s2[j-1]))
							ff[i][j] = ff[i-1][j-1] + 1;
					}
				
				System.out.printf("Length of longest match: %d\n", ff[s1.length][s2.length]);	
			}
		}
	}
}
