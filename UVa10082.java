import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String L = "ZXCVBNM,./ASDFGHJKL;\'QWERTYUIOP[]\\`1234567890-=";
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				switch (s.charAt(i)) {
					case ' ':
						System.out.print(" ");
						continue;
					default:
						System.out.print(L.charAt(L.indexOf(s.charAt(i))-1));
				}
			}
			System.out.println();
		}
	}
}
