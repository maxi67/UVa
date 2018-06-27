import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c[] = new int[300];
		int len = 0;
		int n = Integer.valueOf(sc.nextLine());
		
		while (n-- > 0) {
			String s = sc.nextLine();
			len += s.length();
			s = s.toUpperCase();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					c[(int)s.charAt(i)]++;
			}
		}
		
		while (len-- > 1) {
			for (int i = 'A'; i <= 'Z'; i++)
				if (c[i] == len)
					System.out.println((char)i + " " + len);
		}
	}
}
/*
3
This is a test.
Count me 1 2 3 4 5.
Wow!!!! Is this question easy?
*/
