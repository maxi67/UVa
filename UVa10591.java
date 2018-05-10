import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= t; i++) {	
			boolean happy = true;
			Set<Integer> set = new HashSet<Integer>();
			
			int N = Integer.parseInt(sc.nextLine());
			set.add(N);
			int sum = N;
			
			while (sum != 1) {		
				int N1 = sum;
				sum = 0;
				
				while ( N1 > 0 ){
					sum += (N1 % 10) * (N1 % 10);
					N1 /= 10;
				}

				if (set.contains(sum)){
			          happy = false;
			          break;
			    }		
				set.add(sum);
			}
			
			if (happy)
				System.out.println("Case #" + i + ": " + N + " is a Happy number.");
			else
				System.out.println("Case #" + i + ": " + N + " is an Unhappy number.");
		}
	}
}
