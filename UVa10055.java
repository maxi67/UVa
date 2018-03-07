import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			BigInteger A = input.nextBigInteger();
			BigInteger B = input.nextBigInteger();
			System.out.println(A.subtract(B).abs());
			
			//這題範圍還在long內，也可以這樣寫
			//long A = input.nextLong();
			//long B = input.nextLong();
			//System.out.println(Math.abs(A-B));
			
			//或是如下
			//long A = sc.nextLong();
			//long B = sc.nextLong();
			//long ans = A>B ? A-B : B-A;
			//System.out.println(ans + "");
		}
	}
}
