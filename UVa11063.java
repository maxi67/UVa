import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int times = 1;
		while (input.hasNext()){
			boolean flag = false; //true = not B2
			int A = input.nextInt(); //How many numbers
			
			int B[] = new int[A];
			boolean Sum[] = new boolean[20001]; //兩數的上限都是10000
      
			int current = 0;
			for (int i = 0; i < A; i++){
				B[i] = input.nextInt();
				if (B[i] <= current || B[i] < 1) //not positive or increasing
					flag = true;
				current = B[i];
			}
			
			if (!flag){
				for (int i = 0; !flag && i < A; i++)
					for (int j = i; !flag && j < A; j++){
						int add = B[i] + B[j];
						if (!Sum[add])
							Sum[add] = true;
						else
							flag = true;
					}	
			}
				
			if (flag)
				System.out.println("Case #" + times + ": It is not a B2-Sequence.");
			else
				System.out.println("Case #" + times + ": It is a B2-Sequence.");
			times++;
			System.out.println();
		}
	}
}
