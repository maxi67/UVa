import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.valueOf(sc.nextLine());
		while (t-- > 0) {
			String s = sc.nextLine();
			if (s.length() == 5) 
					System.out.println(3);
			else {
				String one = "oneXXXXX";
				int score = 0;
				for (int i = 0; i < s.length(); i++)
					if (s.charAt(i) == one.charAt(i))
						score++;
				if (score >= 2)
					System.out.println(1);
				else
					System.out.println(2);
			}
		}
	}
}
