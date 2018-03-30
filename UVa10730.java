import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String s[] = sc.nextLine().split(" ");
			if (s[0].length() == 1)
				break;
			
			int num = Integer.parseInt(s[0].substring(0, s[0].indexOf(':')));
			int arr[] = new int[num];
			for (int i = 1; i <= num; i++) 
				arr[Integer.valueOf(s[i])] = i-1;

			boolean anti = true;
			for (int i = 0; i < arr.length && anti; i++) 
				for (int j = 1; i + 2 * j < arr.length && anti; j++) {
					if (arr[i] < arr[i + j] && arr[i + j] < arr[i + 2 * j]) 
						anti = false;
					
					if (arr[i] > arr[i + j] && arr[i + j] > arr[i + 2 * j]) 
						anti = false;
				}
					
			if (anti)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
