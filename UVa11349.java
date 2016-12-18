import java.lang.*;
import java.util.*;

class main{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int tt = Integer.parseInt(input.nextLine().trim());
		for(int t = 1; t <= tt; t++)
		{
			input.next();
			input.next();
			int n = Integer.parseInt(input.next().trim());
			
			boolean nonflag = false;
			long[][] data = new long[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					data[i][j] = input.nextInt();
					
					if(data[i][j] < 0){
						nonflag = true;
					}
				}
			}
				
			if(nonflag){
				System.out.println("Test #" + t + ": Non-symmetric.");
				continue;
			}
			
			//大小為偶數
			if(n % 2 == 0){
				for(int i = 0; i < n/2; i++)
					for(int j = 0; j < n; j++)
						if(data[i][j] != data[n - 1 - i][n - 1 - j]){
							nonflag = true;
						}			
			}
			
			//大小為奇數
			else{
				for(int i = 0; i < n; i++)
					for(int j = 0; j < n; j++){
						if(data[i][j] != data[n - 1 - i][n - 1 - j] && i != j)
							nonflag = true;
            }
			}
			
			if(nonflag)
				System.out.println("Test #" + t + ": Non-symmetric.");
			else
				System.out.println("Test #" + t + ": Symmetric.");
		}
	}
}
