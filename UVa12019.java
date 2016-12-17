import java.lang.*;
import java.util.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String[] data = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n = input.nextInt();
    
		while(n-- > 0)
		{	
			int m = input.nextInt();
			int d = input.nextInt();
			int total = d;
			for(int i = 0; i < m - 1 ; i++)
				total += days[i];
			
			System.out.println(data[(total+ 4) % 7]);
		}
	}
}
