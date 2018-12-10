import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("PERFECTION OUTPUT\n");
		
		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num == 0)
				break;

			int sum = 1;
			for (int i = 2; i <= num/2; i++)
				if (num % i == 0) 
					sum += i;
				
			String s;
			if (sum == num && num != 1)
				s = "PERFECT";
			else if (sum > num)
				s = "ABUNDANT";
			else
				s = "DEFICIENT";
					
			sb.append(String.format("%5d  %s\n", num, s));
		}
		sb.append("END OF OUTPUT\n");
		System.out.print(sb.toString());
	}
}
