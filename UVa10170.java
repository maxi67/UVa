import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
		
			int s = input.nextInt();
			long d = input.nextLong();
			
			if(d < s)
				System.out.println(s);
				
			else{
				for(; d > 0; s++)		
					d = d - s;
				
				//跳出迴圈前有多+1要扣掉
				System.out.println(--s);
			}
		}
	}
}
