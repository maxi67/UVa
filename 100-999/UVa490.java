//0 1 2 3 4
//5 6 7 8 9

//5 0
//6 1
//7 2
//8 3
//9 4

import java.lang.*;
import java.util.*;

class Main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char[][] data = new char[101][101];
		int lines = 0, max = 0;
		
		while(input.hasNextLine()){
			
			String s1 = input.nextLine();	
			
			//紀錄最長的字串(後續轉的時候其餘要補空格)
			max = s1.length() > max ? s1.length() : max;
            
			for(int i = 0; i < s1.length(); i++)
				data[lines][i] = s1.charAt(i);
			lines++;
		}
		
		for(int j = 0; j < max; j++)
		{
			for(int k = lines - 1; k >= 0; k--)
			{
				if(data[k][j] == '\0')
					{ //最後一列的空格不用補
						if(k != 0)
							System.out.print(" ");
					}
				else
					System.out.print(data[k][j]);
			}
			System.out.println();
		}
	}
}
