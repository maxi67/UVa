import java.util.*;

public class Main {
	public static void main(String args[]) {
		//Input contains characters whose ASCII > 256
		//You will get Runtime Error without ISO-8859-1
		Scanner sc = new Scanner(System.in,"ISO-8859-1");
		
		int N = Integer.valueOf(sc.nextLine());
		while (N-- > 0) {
			double cost = 0.0;
			int K = Integer.valueOf(sc.nextLine());
			int price[] = new int[256];
			
			for (int i = 0; i < K; i++) {
				String str = sc.nextLine();
				price[str.charAt(0)] = Integer.valueOf(str.substring(2));
			}
			
			int M = Integer.valueOf(sc.nextLine());
			for (int i = 0; i < M; i++) {
				String s = sc.nextLine();
				for (char c : s.toCharArray())
					cost += price[c];
			}
			System.out.printf("%.2f$\n", cost/100);
		}
	}
}
