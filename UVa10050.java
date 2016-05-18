import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		for(int i = 0;i < A; i++)
		{
			int count = 0;
			int B = input.nextInt();
			int[] state= new int[4000];
			int C = input.nextInt();
			
			for(int j = 0;j < C; j++)
			{
				int cost = input.nextInt();
				for(int k = cost;k <= B;k += cost)
					state[k] = 1;	
			}
			
			for(int l = 6;l <= B; l += 6)
			{
				state[l] = 0;
				l++;
				state[l] = 0;	
			}
			
			for(int m = 1;m <= B; m++)
			{
				if(state[m] == 1)
					count++;
			}

			System.out.println(count);
		}
	}
}
