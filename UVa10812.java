import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = Integer.valueOf(input.nextLine().trim());
    
		for(int t = 1; t <= n; t++)
		{	
			int s = input.nextInt();
			int d = input.nextInt();
				
			if((s + d) % 2 != 0){
				System.out.println("impossible");
				continue;
			}
			
			int a = (s + d)/ 2;
			int b = s - a;
			
			if(b < 0)
				System.out.println("impossible");
			else
				System.out.println(a + " " + b);	
		}
	}
}
