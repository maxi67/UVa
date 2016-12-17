import java.lang.*;
import java.util.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			int[] c1 = new int[123];
			int[] c2 = new int[123];
			
			//計算個別個數
			for(int i = 0; i < s1.length(); i++)
				c1[s1.charAt(i)]++;
			for(int j = 0; j < s2.length(); j++)
				c2[s2.charAt(j)]++;
				
			//相同字元時，輸出較少數量那方的個數
			for(int	k = 97; k < 123; k++)
					for(int num = 0; num < Math.min(c1[k],c2[k]); num++)
						System.out.print((char)k);		
				
			System.out.println();
		}
	}
}
