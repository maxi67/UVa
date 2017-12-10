import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		int I;
		while (sc.hasNext()) {
			int sum = 0;
			I = sc.nextInt();
			if(I == 0)
				break;
   
			String bin = Integer.toBinaryString(I);
			for (int i = 0 ; i < bin.length(); i++)
				if (bin.charAt(i) == '1')
					sum++;
   
			System.out.println("The parity of " + bin + " is " + sum + " (mod 2).");
		}
	}
}
