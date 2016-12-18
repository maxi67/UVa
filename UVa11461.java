import java.lang.*;
import java.util.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		long square[] = new long[1001];
		for(int i = 1; i <= 1000; i++)
			square[i] = i * i;
		
		while(input.hasNextLine()){	
			int a = input.nextInt();
			int b = input.nextInt();
			int count = 0;
			int in = 1;
			int in2 = 1000;
				
			if(a == 0 & b == 0)
				break;
				
			for(; in < 1001; in++)
				if(a <= square[in]){
					in--;
					break;
				}
						
			for(; in2 > 0; in2--)
				if(b >= square[in2])
					break;	
			count = in2 - in;
					
			/*	本來的寫法 -> TL
				for(int i = a; i <= b; i++)
					for(int index = 1; index < 1001; index++){
						if(i == square[index]){
							count++;
							index = 1001;
						}
					}
					*/
			System.out.println(count);
		}
	}
}
