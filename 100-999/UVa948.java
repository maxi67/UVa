import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		int A, B, flag = 0;
		String bin = "";
		
		//建費氏數列表		
		int arr[] = new int[50];
		arr[0] = 1;
		arr[1] = 2;
		for(int i = 2; i < 43; i++)
			arr[i] = arr[i - 1] + arr[i - 2];

		while(times-- > 0)
		{
			flag = 0;
			A = input.nextInt();
			B = A;
			bin = B + " = ";
			
			for(int i = 42; i >= 0; i--)
			{
				if(B >= arr[i])
					{
						B -= arr[i];
						bin = bin.concat("1");
						flag = 1;
					}
					
					else
					{
						if(flag == 1)
							bin = bin.concat("0");
					}	
			}
			bin = bin.concat("(fib)");
			System.out.println(bin);
		}
	}
}
