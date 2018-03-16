import java.util.*;

public class Main {
	public static int getGCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return getGCD(b, a%b);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.valueOf(sc.nextLine());
		while (N-- > 0) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int data[] = new int[st.countTokens()];
			
			for (int i = 0; i < data.length; i++) 
			    data[i] = Integer.parseInt(st.nextToken());
			
			int max = 0;
			for (int i = 0; i < data.length - 1; i++) {
				for (int j = i + 1; j < data.length; j++) {
					max = getGCD(data[i], data[j]) > max ? getGCD(data[i], data[j]) : max;
				}
			}
			System.out.println(max);
		}	
	}
}
