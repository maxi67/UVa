import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String S;
		String Str="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		
		while(input.hasNext())
		{
			S = input.nextLine();
			for(int i = 0 ; i < S.length() ; i++ )
			{
				if(S.charAt(i) == ' ')
					System.out.print(" ");
					
				for(int j = 0; j < Str.length(); j++)
					if(S.charAt(i) == Str.charAt(j))
						System.out.print( Str.charAt(j-1));
			}
			System.out.println();

		}
	}
}
