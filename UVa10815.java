import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> word = new ArrayList<String>();
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			if (s.length() > 0) {
				s = s.toLowerCase();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
						sb.append(s.charAt(i));
					else
						sb.append(' ');
				}
				s = sb.toString();
					
				String str[] = s.split(" ");
				for (int i = 0; i < str.length; i++) {
					if (!word.contains(str[i]))
						word.add(str[i]);
				}
			}
		}
		Collections.sort(word);
		for (int i = 1; i < word.size(); i++)
			System.out.println(word.get(i));
	}
}
