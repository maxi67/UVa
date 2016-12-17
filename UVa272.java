import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char[][] data = new char[101][101];
		int lines = 0, max = 0;
		boolean firstflag = true;
		
		while(input.hasNextLine()){
			
			String s1 = input.nextLine();	
			
			for(int i = 0; i < s1.length(); i++)
			
				if(s1.charAt(i) == '\"' && firstflag)
				{ //First
					System.out.print("``");
					firstflag = !firstflag;
				}
				else if(s1.charAt(i) == '\"' && !firstflag)
				{ //Second
					System.out.print("\'\'");
					firstflag = !firstflag;
				}
				else
					System.out.print(s1.charAt(i));
					
				System.out.println();
		}
	}
}
