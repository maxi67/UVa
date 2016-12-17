//無窮等比級數公式...
//(1-p)^(i-1)*p+(1-p)^(n+i-1)*p+...
//=[(1-p)^(i-1)*p]*[1+(1-p)^n+(1-p)^2n+...]
//=[(1-p)^(i-1)*p]*1/[1-(1-p)^n]

import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		while(t-- > 0)
		{	
			int n = input.nextInt();
			double p = input.nextDouble();
			int i = input.nextInt();
			
			if(p == 0.0) //0不能當指數的底數，丟到pow放進%.4f會error
				System.out.println("0.0000");
			else{
				double answer = p * Math.pow((1 - p), (i - 1)) / (1 - Math.pow(1 - p, n));
				System.out.println(String.format("%.4f", answer));
			}
		}
	}
}
