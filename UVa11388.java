import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int G = sc.nextInt();
			int L = sc.nextInt();
			if(L % G != 0)
				System.out.println("-1");
			else
				System.out.println(G + " " + L);
		}
	}
}
