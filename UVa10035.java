//計算兩個同位數相加時共有幾個位發生進位
import java.lang.*;
import java.util.*;

class Main{
	
    public static void main(String args[]){
	    
        Scanner input = new Scanner(System.in);
        int A, B;
        int carry = 0, times = 0;
        while (input.hasNext()){
	    times = 0;
	    carry = 0;
	    A = input.nextInt();
	    B = input.nextInt();
			
	    if (A == 0 && B == 0)
	        break;
			
	    while (A!=0 || B!=0){
 	        if (A%10 + B%10 + carry >= 10){
                    times++;
                    carry = 1;
                }
		
	  	else
		    carry = 0;
				
		A /= 10;
		B /= 10;
	    }
		
	    if (times == 0)
	        System.out.println("No carry operation.");
	    else{   
		if (times == 1)
		    System.out.println("1 carry operation.");
		else
		    System.out.println(times + " carry operations.");
	    }
	}
    }
}
