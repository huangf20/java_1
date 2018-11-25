
import java.util.Scanner;


import com.sun.xml.internal.ws.api.pipe.NextAction;



public class _4 {
	 
		public static void main(String[] args) {
			        System.out.println("请输入三个整数：");
			        Scanner input=new Scanner(System.in);
			         int []num =new int[3];
			         num[0]=input.nextInt();
			         num[1]=input.nextInt();
			         num[2]=input.nextInt();
			         Arrays.sort(num);
			         for (int i = 0; i < num.length; i++) {
			             System.out.println(num[i]);
			        }
			         
			    }
}
