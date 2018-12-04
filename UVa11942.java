import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		System.out.println("Lumberjacks:");
		
		while (N-- > 0) {
			int arr[] = new int[10];
			for (int i = 0; i < 10; i++)
				arr[i] = sc.nextInt();

			int in = (arr[0] < arr[1]) ? 1 : ((arr[0] > arr[1]) ? 2 : 0);
			boolean ordered = true;
			
			if (in == 1) {
				for (int i = 1; i < 9; i++)
					if (arr[i] > arr[i+1]) {
						ordered = false;
						break;
					}
			}
			
			if (in == 2) {
				for (int i = 1; i < 9; i++)
					if (arr[i] < arr[i+1]) {
						ordered = false;
						break;
					}
			}
			
			if (ordered)
				System.out.println("Ordered");
			else
				System.out.println("Unordered");	
		}
	}
}
