import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int edge[] = new int[3];
			edge[0] = sc.nextInt();
			edge[1] = sc.nextInt();
			edge[2] = sc.nextInt();
			
			if (edge[0] == 0 && edge[1] == 0 && edge[2] == 0)
				break;
			
			Arrays.sort(edge);
				
			if (edge[0]*edge[0] + edge[1]*edge[1] == edge[2]*edge[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
