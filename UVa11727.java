import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[3];
		for (int i = 1; i <= T; i++) {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			Arrays.sort(arr);
			System.out.println("Case " + i + ": " + arr[1]);
		}
	}
}
