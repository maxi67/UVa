import java.util.*;

public class Main {
	public static int getValue(int v) {
		if (v < 10)
			return v;
		int sum = 0;
		
		while (v >= 10) {
			sum += v%10;
			v /= 10;
		}
		
		return sum + v;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int v1 = 0, v2 = 0;
			String s1 = sc.nextLine();
			s1 = s1.toLowerCase();

			for (int i = 0; i < s1.length(); i++) 
				if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
					v1 += (s1.charAt(i) - 'a' + 1);
			
			while (v1 >= 10) {
				v1 = getValue(v1);
			}
			
			String s2 = sc.nextLine();
			s2 = s2.toLowerCase();

			for (int i = 0; i < s2.length(); i++) 
				if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
					v2 += (s2.charAt(i) - 'a' + 1);
			
			while (v2 >= 10) {
				v2 = getValue(v2);
			}
			
			float ratio = ((v1 > v2) ? ((float)v2/(float)v1) : ((float)v1/(float)v2)) * 100;
			System.out.printf("%.2f %%\n", ratio);
		}
	}
}
