public class _10 {
	public static void main(String args[]) {
		int i,j;
		System.out.printf("\1\1\n"); /*输出两个笑脸*/
		for(i=1;i<11;i++)
		{
			for(j=1;j<=i;j++)
				System.out.printf("%c%c",219,219);
			System.out.printf("\n");
		}
		
	}
}
