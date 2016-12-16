import java.lang.*;
import java.util.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String table = "1234567890-=qwertyuiop[]\\asdfghjkl;\'zxcvbnm,./";
		
		while(input.hasNext()){
			String s = input.nextLine();
			s =s.toLowerCase();
			for(int i = 0;i<s.length();i++)
			{
				for(int j=2;j<table.length();j++)
				{
					if(s.charAt(i) == ' '){
						System.out.print(" ");
						break;
					}
					if(s.charAt(i)==table.charAt(j))
						System.out.print(table.charAt(j-2));
				}
			}
			System.out.println("");
		}
	}
}
