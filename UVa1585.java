import java.util.*;
import java.lang.*;
class main{
    public static void main(String[] args) {
       
       		Scanner in=new Scanner(System.in);
           	int a=Integer.valueOf(in.nextLine().charAt(0));
			for(int q=0;q<a;q++)
            {
            	boolean state = true;
            	int o=0,sum=0;
            	String S=in.nextLine();
            	for(int i =0;i<S.length();i++)
            	{
            		if(state == true)
            			o=0;
            		if(S.charAt(i)==79) //o
            		{
            			o++;
            			sum+=o;
            			state=false;
            		}
            		else //x
            			state = true;
            	}
            	System.out.println(sum);
            }
      
    }
};
