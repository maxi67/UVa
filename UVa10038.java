import java.util.*;
import java.lang.*;

class Main{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		while (input.hasNextInt()) {
			int A = input.nextInt();
			boolean flag = false;
			int n[] = new int[3000];
			int m[] = new int[A];
			
			for (int j = 1; j < A; j++)
				m[j] = 1;			
			
			for (int i = 0; i < A; i++)
				n[i] = input.nextInt();

			for (int j = 0, h; j < A - 1; j++) { //連續數字之差的絕對值
				h = Math.abs(n[j] - n[j + 1]);
				if (h > A - 1)
					continue;		
				m[h] = 0;
			}
			
			for (int j = 1; j < A; j++)
				if (m[j] == 1)
					flag = true;
			
			if (!flag)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}
