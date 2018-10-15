import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int fib[] = new int[46];
		int index = 2;
		fib[0] = 1;
		fib[1] = 2;
		for (; index < 45; index++) 
			fib[index] = fib[index-1] + fib[index-2];

		int T = sc.nextInt();
		while (T-- > 0) {			
			int n = sc.nextInt();
			StringBuffer sb = new StringBuffer("");
			index = 44;
			
			while (fib[index] > n)
				index--;

			while (index >= 0) {
				if (n >= fib[index]) {
					sb.append("1");
					n -= fib[index];
				}
				else
					sb.append("0");
				index--;
			}
			System.out.println(sb.toString());
		}
	} 
}
