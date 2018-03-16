import java.util.*;

public class UVa11764 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int N = sc.nextInt();

			int arr[] = new int[N];
			int h = 0;
			int l = 0;
			
			for (int j = 0; j < N; j++)
				arr[j] = sc.nextInt();
			
			int current = arr[0];
			for (int j = 1; j < N; j++) {
				if (current < arr[j])
					h++;
				else if(current > arr[j])
				l++;
				current = arr[j];
			}
			System.out.println("Case " + i + ": " + h + " " + l);
		}
	}
}
