import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		for (int i = 0; i < T; i++){
			int[] state = new int[4000];
			int count = 0;
			int N = input.nextInt();
			int P = input.nextInt();
			
			for (int j = 0; j < P; j++){
				int cost = input.nextInt();
				for (int k = cost; k <= N; k += cost)
					state[k] = 1;	
			}
			
			//Friday & Saturday
			for (int j = 6; j <= N; j += 6){
				state[j++] = 0;
				state[j] = 0;	
			}
			
			for (int m = 1; m <= N; m++)
				if (state[m] == 1)
					count++;
			
			System.out.println(count);
		}
	}
}
