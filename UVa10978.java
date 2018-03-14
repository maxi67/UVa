import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = Integer.valueOf(sc.next());
			if (N == 0)
				break;
			
			boolean left[] = new boolean[N];
			String list[] = new String[N];
			int index = -1;
			for(int n = 0; n < N; n++) {
				String card = sc.next();
				int order = sc.next().length();
				for (int i = 0; i < order; i++) {
					do {
						index = (index == N-1) ? 0 : (index + 1);
					}while (left[index]);
				}
				left[index] = true;
				list[index] = card;
			}
      
			System.out.print(list[0]);
			for(int s = 1; s < N; s++)
				System.out.print(" " + list[s]);
			System.out.println();
		}
		
	}
}
