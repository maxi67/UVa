import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num[] = {0, 128, 64, 32, 16, 8, 0, 4, 2, 1};
		
		sc.nextLine();
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equals("___________"))
				break;
			int sum = 0;
			for (int i = 1; i < s.length(); i++)
				if (s.charAt(i) == 'o')
					sum += num[i];
			System.out.print((char)sum);
		}
	}
}
