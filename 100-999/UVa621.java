import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while (n-- > 0) {
			String s = sc.nextLine();
			if (s.equals("1") || s.equals("4") || s.equals("78"))
				System.out.println("+");
			else if (s.substring(s.length()-2).equals("35"))
				System.out.println("-");
			else {
				if (s.charAt(0) == '9' && s.charAt(s.length()-1) == '4')
					System.out.println("*");
				else
					System.out.println("?");
			}
				
		}
	}
}
