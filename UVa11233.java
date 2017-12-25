import java.util.*;

public Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int L, N;
		String str[] = sc.nextLine().split(" ");
		L = Integer.valueOf(str[0]);
		N = Integer.valueOf(str[1]);
		HashMap<String, String> list = new HashMap<>();
		
		for (int i = 0; i < L; i++) {
			String str2[] = sc.nextLine().split(" ");
			list.put(str2[0], str2[1]);
		}
		
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			
			if (list.containsKey(s))
				System.out.println(list.get(s));
			
			else if (s.charAt(s.length() - 1) == 'y' && s.charAt(s.length() - 2) != 'a'
						&& s.charAt(s.length() - 2) != 'e'
						&& s.charAt(s.length() - 2) != 'i'
						&& s.charAt(s.length() - 2) != 'o'
						&& s.charAt(s.length() - 2) != 'u')
				System.out.println(s.substring(0, s.length() - 1) + "ies");
			
			else if (s.charAt(s.length() - 1) == 'o' ||
						s.charAt(s.length() - 1) == 's' ||
						(s.charAt(s.length() - 2) == 'c' && s.charAt(s.length() - 1) == 'h') ||
						(s.charAt(s.length() - 2) == 's' && s.charAt(s.length() - 1) == 'h') ||
						s.charAt(s.length() - 1) == 'x')
				System.out.println(s + "es");
			
			else
				System.out.println(s + "s");
		}
	}
}
