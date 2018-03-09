import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String dic = "";
		HashMap<String, String> hm = new HashMap<String, String>(); 
		dic = sc.nextLine();
		while (sc.hasNextLine()) {
			while (true) {
				if (!dic.contains(" "))
					break;
				String[] arr = dic.split(" ");
				hm.put(arr[1], arr[0]);
				dic = sc.nextLine();
			}
			
			
			while (sc.hasNextLine()) {
				String msg = sc.nextLine();
				
				if (!hm.containsKey(msg))
					System.out.println("eh");
				else
					System.out.println(hm.get(msg));
			}
			
		}
	}
}
