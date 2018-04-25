import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while (T-- > 0) {
			int len[] = new int[4];
			for (int i = 0; i < 4; i++)
				len[i] = sc.nextInt();
			
			Arrays.sort(len);
			if (len[0] == len[3])
				System.out.println("square");
			else if (len[0] == len[1] && len[2] == len[3])
				System.out.println("rectangle");
			else if (len[0]+len[1]+len[2] >= len[3])
				System.out.println("quadrangle");
			else
				System.out.println("banana");
		}
	}
}
