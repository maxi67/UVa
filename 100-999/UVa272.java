import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			for (int i = 0; i < s.length(); i++)
				if (s.charAt(i) == '"') {
					if (first) {
						System.out.print("``");
						first = false;
					}
					else {
						System.out.print("''");
						first = true;
					}			
				}
				else
					System.out.print(s.charAt(i));
			System.out.println();
		}
	}
}
