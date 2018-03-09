import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		while (sc.hasNext()) {
			boolean use[] = new boolean[125];
			int maxlen = 0;
			PriorityQueue<String> pq = new PriorityQueue<String>();
			
			int F = sc.nextInt();
			int N = sc.nextInt();
			
			while (F-- > 0) {
				int f = sc.nextInt();
				switch(f) {
					case 1:
						use[(int)'q'] = true;
						use[(int)'a'] = true;
						use[(int)'z'] = true;
						break;
					case 2:
						use[(int)'w'] = true;
						use[(int)'s'] = true;
						use[(int)'x'] = true;
						break;
					case 3:
						use[(int)'e'] = true;
						use[(int)'d'] = true;
						use[(int)'c'] = true;
						break;
					case 4:
						use[(int)'r'] = true;
						use[(int)'f'] = true;
						use[(int)'v'] = true;
						use[(int)'t'] = true;
						use[(int)'g'] = true;
						use[(int)'b'] = true;
						break;
					case 7:
						use[(int)'y'] = true;
						use[(int)'h'] = true;
						use[(int)'n'] = true;
						use[(int)'u'] = true;
						use[(int)'j'] = true;
						use[(int)'m'] = true;
						break;
					case 8:
						use[(int)'i'] = true;
						use[(int)'k'] = true;
						use[(int)'c'] = true;
						break;
					case 9:
						use[(int)'o'] = true;
						use[(int)'l'] = true;
						break;
					case 10:
						use[(int)'p'] = true;
						break;
				}
			}
			sc.nextLine();
			while (N-- > 0) {
				String str = sc.nextLine();
				boolean broken = false;
				for (int i = 0; i < str.length(); i++)
					if (use[(int)str.charAt(i)]) {
						broken = true;
						break;
					}
				if (!broken) {
					if (str.length() > maxlen) {
						maxlen = str.length();
						pq.clear();
						pq.add(str);
					}
					else if (str.length() == maxlen) {
						if (!pq.contains(str))
							pq.add(str);
					}
						
				}
					
			}
			System.out.println(pq.size());
			while (!pq.isEmpty())
				System.out.println(pq.poll());
		}
	}
}
