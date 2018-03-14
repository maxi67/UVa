import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int C = Integer.valueOf(sc.nextLine());
			
			if (C == 0)
				break;
			
			String re[][] = new String[C][2];
			for(int i = 0; i < C; i++) {
				re[i][0] = sc.nextLine();
				re[i][1] = sc.nextLine();
			}

			String ori = sc.nextLine();
			
			for(int i = 0; i < C; i++) {
				while (ori.contains(re[i][0])) {
					ori = ori.replaceFirst(re[i][0], re[i][1]);
				}
			}
			System.out.println(ori);
		}
		
	}
}
