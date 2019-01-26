import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String tmp[] = sc.nextLine().split("\\s+");
		int m = Integer.valueOf(tmp[0]);
		int n = Integer.valueOf(tmp[1]);

		for (int i = 0; i < m; i++) {
			String tmp2[] = sc.nextLine().split("\\s+");
			hm.put(tmp2[0], Integer.valueOf(tmp2[1]));
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			String s = sc.nextLine();
			while (!s.equals(".")) {
				String str[] = s.split("\\s+");
				for (String t: str) {
					if (hm.containsKey(t))
						sum += hm.get(t);
				}
				s = sc.nextLine();
			}

			System.out.println(sum);
		}
	}
}
