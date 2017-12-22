import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		while (input.hasNext()){
			int v = input.nextInt(); //-100 ~ 100
			int t = input.nextInt(); //   0 ~ 200
			System.out.println(2 * t * v);
		}
	}
}
