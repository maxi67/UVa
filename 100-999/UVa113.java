import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double n = Double.valueOf(sc.nextLine());
			double p = Double.valueOf(sc.nextLine());
			System.out.printf("%.0f\n",Math.pow(p, 1.0f/n));
		}
	}
}
