import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		while (T-- > 0) {
			int sum = 0;
			String str = sc.nextLine();
			
			if (str.length() == 2)
				System.out.println("NO LOOP");
			
			else {
				for (int i = 0; i < str.length(); i++) 
					sum = str.charAt(i) == 'M' ? sum+1 : (str.charAt(i) == 'F' ? sum-1: sum);

				if (sum == 0)
					System.out.println("LOOP");
				else
					System.out.println("NO LOOP");
			}
		}
	}
}
