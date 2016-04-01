import java.math.*;
import java.lang.*;
import java.util.*;

class main{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext())
		{
			BigInteger BigA = new BigInteger(input.nextLine());
			BigInteger BigB = new BigInteger(input.nextLine());
			
			System.out.println(BigA.multiply(BigB));
		}
	}
}
