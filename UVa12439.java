import java.util.*;

public class Main {
	public static int getleap(String s, boolean front) {
		String str[] = s.split(" ");
		
		String Month = str[0];
		int day = Integer.valueOf(str[1].substring(0, str[1].length() - 1));
		int year = Integer.valueOf(str[2]);
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
	        if (!Month.equals("January") && !Month.equals("February")) 
	            year++;
	        
	        else if (Month.equals("February") && day == 29) {
	            if (front)
	            	year--;
	            else
	            	year++;
	        }
	        
	        else 
	        	year--;
	    }
		
	    return year/4 - year/100 + year/400;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.valueOf(sc.nextLine());
		for (int t = 1; t <= T; t++) {
			int leap1 = getleap(sc.nextLine(), true);
			int leap2 = getleap(sc.nextLine(), false);
			
			System.out.println("Case " + t + ": " + (leap2-leap1));
		}
	}
}
