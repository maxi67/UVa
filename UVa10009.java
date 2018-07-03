import java.util.*;

public class Main {

	public static String bfs (HashMap<String, ArrayList<String>> list, String s, String d) {
		Queue<String> queue = new ArrayDeque<>();
		HashMap<String,String> prev = new HashMap<>();
		
		queue.offer(s);
		prev.put(s, null); //for tracing back
		
		while (!queue.isEmpty()) {
			String curr = queue.poll();
			if (curr.equals(d))
				break;
			
			else if (list.containsKey(curr)) { //find path from s to next
				for (String nei : list.get(curr)) {
					if (!prev.containsKey(nei)) { 
						queue.offer(nei);
						prev.put(nei, curr); //d, s
					}
				}
			}
		}
		
		if (!prev.containsKey(d)) //never arrive
			return "";
		
		else {
			String ss = "";
			while (d != null) {
				ss = d.charAt(0) + ss;
				d = prev.getOrDefault(d, null); //trace
			}

			StringBuilder sb = new StringBuilder();
			
			return ss;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		for (int k = 0; k < N; k++) {
			sc.nextLine();
			String[] st = sc.nextLine().split(" ");
			
			int m = Integer.parseInt(st[0]);
			int n = Integer.parseInt(st[1]);
			
			HashMap<String, ArrayList<String>>list = new HashMap<>();
			for (int i = 0; i < m; i++) {
				
				st = sc.nextLine().split(" ");
				String d1 = st[0];
				String d2 = st[1];
				
				//Build path
				if (!list.containsKey(d1)) 
					list.put(d1, new ArrayList<>());
				if (!list.containsKey(d2)) 
					list.put(d2, new ArrayList<>());
				
				list.get(d1).add(d2);
				list.get(d2).add(d1);
			}
			
			if (k > 0) 
				System.out.println();
			
			for (int i = 0; i < n; i++) {
				st=sc.nextLine().split(" ");
				System.out.println(bfs(list, st[0], st[1]));
			}
		}
	}
}
