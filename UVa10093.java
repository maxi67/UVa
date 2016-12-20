import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextLine()){
			String s = input.nextLine();
			
			char Ctemp[] = s.toCharArray();
			int sum = 0;
			int max = 1;
			for(char temp: Ctemp){
				int num = 0;
				if(temp >= 48 && temp <= 57){ //0 ~ 9
					num = temp - 48;
				}else if(temp >= 65 && temp <= 90){ //A ~ Z -> 11 ~ 36
					num = temp - 55;
				}else if(temp >= 97 && temp <= 122){ //a ~ z -> 37 ~ 62
					num = temp - 61;
				}
				sum += num;
				max = num > max ? num : max;
			}
			
			//對於N進位的數字sum，各位數字和若為N-1，則可被N-1整除
			for(int i = max; i <= 62; i++){
				if(sum % i == 0){ //i = N - 1 ,i + 1 = N
					System.out.println(i + 1);
					break;
				}
				
				if(i == 62)
					System.out.println("such number is impossible!");
			}
		}
	}
}
