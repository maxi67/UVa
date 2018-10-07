import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int s = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (s+a+b+c == 0 && s*a*b*c == 0)
				break;
			
			int sum = 720;
			sum += ((40+s-a) % 40) * 9;
			sum += 360;
			sum += ((40+b-a) % 40) * 9;
			sum += ((40+b-c) % 40) * 9;
			System.out.println(sum);
		}
	}
}
