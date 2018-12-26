import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int k = 0;
			String in = sc.nextLine();
			Stack<Character> st = new Stack<Character>();
			
			while (k != in.length()) {

				if (in.charAt(k) == ' ') {
					while (!st.isEmpty()) 
						System.out.print(st.pop());
					
					System.out.print(' ');
				}
				
				else
					st.push(in.charAt(k));
				
				k++;
			}
			
			while (!st.isEmpty()) 
				System.out.print(st.pop());
			System.out.println();
		}
	}
}
