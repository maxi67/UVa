//找中位數，算距離和
import java.util.*;
import java.lang.*;

class main{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b, sum;
		while (a-- > 0){
			sum = 0;
			b = input.nextInt();
			int[] mem = new int[b];
			int c = b;
			while (b-- > 0){
				mem[b] = input.nextInt();
			}
			Arrays.sort(mem);
			for(int i = 0; i < c; ++i)
				sum += Math.abs(mem[c/2] - mem[i]);
			System.out.println(sum);
		}
	}
}
