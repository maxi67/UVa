import java.util.*;
import java.lang.*;
import java.math.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			BigInteger A = input.nextBigInteger();
			BigInteger B = input.nextBigInteger();
			System.out.println(A.subtract(B).abs());
			
			//這題範圍還在long內，也可以這樣寫
			
			//long A = input.nextLong();
			//long B = input.nextLong();
			//System.out.println(Math.abs(A-B));
		}
	}
}
