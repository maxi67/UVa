import java.util.*;

public class M {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = Integer.valueOf(sc.nextLine());
			if (N == 0)
				break;
			
			int ans = 0;
			int min = 26;
			int space[] = new int[N];
			
			for (int n = 0; n < N; n++) {
				String s = sc.nextLine();
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == ' ')
						space[n]++;
				}
				min = space[n] < min ? space[n] : min;
			}
			for (int i = 0; i < N; i++)
				ans += (space[i] - min);
			System.out.println(ans);	
		}
	}
}
