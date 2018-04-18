import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= t; i++) {
			System.out.print("Case " + i + ": ");
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			
			if (s1.equals(s2))
				System.out.println("Yes");

			else {			
				s1 = s1.trim();
				s2 = s2.trim();
				
				boolean wrong = false;
				int in1 = 0, in2 = 0;
				
				while (in1 != s1.length() || in2 != s2.length()) {
					in1 = (in1 == s1.length()) ? in1-1 : in1;
					in2 = (in2 == s2.length()) ? in2-1 : in2;
					
					if (s1.charAt(in1) == ' ')
						in1++;
					else if (s2.charAt(in2) == ' ')
						in2++;
					else if (s1.charAt(in1) != s2.charAt(in2)) {
						wrong = true;
						break;
					}
					
					else {
						in1++;
						in2++;
					}
				}
				
				if (wrong)
					System.out.println("Wrong Answer");
				else
					System.out.println("Output Format Error");
			}			
		}
	}
}
