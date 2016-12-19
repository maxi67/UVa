import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			
			int v = input.nextInt(); //-100 ~ 100
			int t = input.nextInt(); //   0 ~ 200
			
			if(v == 0)
				System.out.println("0");
			else
				System.out.println(2 * t * v);
		}
	}
}
