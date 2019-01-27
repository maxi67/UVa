import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			double L = sc.nextDouble();
			double W = sc.nextDouble();
			
			double a = 12;
			double b = -4*(L + W);
			double c = L * W;
			
			double max = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
			double min = (W < L ? W : L)/2;
			System.out.printf("%.3f 0.000 %.3f\n", max, min);
		}
	}
}
