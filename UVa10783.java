import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
    
		for(int t = 1; t <= n; t++)
		{	
			int a = input.nextInt();
			int b = input.nextInt();
			int total = 0;
			for(int i = a; i <= b ; i += 2)
				if(i % 2 == 1)
					total += i;
				else if(i + 1 <= b)
					total += (i + 1);
			
			System.out.println("Case " + t + ": " + total);
		}
	}
}
