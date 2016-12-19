import java.util.*;
import java.lang.*;

class main{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		String S = "";
		int[] count = new int[130];
		int sum = 0;
		
		while(input.hasNext())
		{
			S = input.nextLine();
			for(int i = 0; i < S.length(); i++)
			{
				sum++;
				count[S.charAt(i)]++;
			}
			
			for(int k = 1; k <= sum; k++)
				for(int j = 128; j >= 0; j--)
				{
					if(k == count[j])
						{
							System.out.println(j + " " + count[j]);
							count[j] = 0;
						}
				}
			if(input.hasNext()) //每筆測資之間要空行，但最後一筆後不空
				System.out.println();
		}
	}
}
