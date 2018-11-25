public class _8 {
	  public static void main(String[] args) {
			int i,j; 
			for(i=0;i<8;i++){ 
				for(j=0;j<8;j++) 
					if((i+j)%2==0) 
						System.out.printf("■"); 
					else 
						System.out.printf(" "); 
				System.out.printf("\n"); 

			}
		}
}
