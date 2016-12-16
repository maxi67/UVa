//用String會TL

import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long s = input.nextInt();
			
			//結束
			if(s == 0)
				break;
			
			while(s >= 10){
				long sum = 0;
				while(s > 0){
					sum += s%10;
					s /= 10;
				}
				s = sum;
			}
			System.out.println(s);
		}
	}
}
