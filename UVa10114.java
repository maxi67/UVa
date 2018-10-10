import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int mon = sc.nextInt();
			double down = sc.nextDouble();
			double loan = sc.nextDouble();
			int d = sc.nextInt();
			if (mon < 0)
				break;
			
			double dep[] = new double[101];
			for (int i = 0; i < d; i++) {
				int tmp = sc.nextInt();
				dep[tmp] = sc.nextDouble();
			}
			
			//car initial value
			double car = down + loan;
			
			//payment each month
			double pay = loan / mon; 
			
			//depreciation rate
			double rate = dep[0];
			
			int ans = 0;
			
			for (; ans < mon; ans++) {
				rate = ((dep[ans] > 0) ? dep[ans] : rate);
				car *= (1 - rate);
				if (car > loan)
					break;
				loan -= pay;  //payment each month
			}
			if (ans == 1)
				System.out.println("1 month");
			else
				System.out.println(ans + " months");
		}
	}
}
