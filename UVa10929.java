import java.util.*;
import java.lang.*;

class Main{
	
    public static void main(String args[]){
		
        Scanner input = new Scanner(System.in);
		
        while (input.hasNext()){
            int sum = 0;
            String S = input.next();
            if (S.charAt(0) == 48)
                break;
			
            for (int i = 0; i < S.length(); i+=2)
                sum += (S.charAt(i) - 48);
            for (int j = 1; j < S.length(); j+=2)
                sum -= (S.charAt(j) - 48);

            System.out.print(S);
            if (sum % 11 == 0)
                System.out.println(" is a multiple of 11.");
            else
                System.out.println(" is not a multiple of 11.");
        }
    }
}
