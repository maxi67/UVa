import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.valueOf(sc.next());
		
		for (int i = 1; i <= T; i++) {
			HashMap<String, Integer> com = new HashMap<String, Integer>();
			int N = Integer.valueOf(sc.next());
			while (N-- > 0) 
				com.put(sc.next(), Integer.valueOf(sc.next()));
			
			int D = Integer.valueOf(sc.next());
			String work = sc.next();
		
			System.out.print("Case " + i + ": ");
			if (com.get(work) == null)
				System.out.println("Do your own homework!");
			else if (D >= com.get(work))
				System.out.println("Yesss");
			else if (D + 5 >= com.get(work))
				System.out.println("Late");
			else
				System.out.println("Do your own homework!");
		}
	}
	
}
