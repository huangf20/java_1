public class ee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
        int j = 0;
        int k = 0;
        int t = 0;
        for(i = 1; i <= 4; i++) {
            for(j = 1; j <= 4; j++) {
                for(k = 1; k <= 4; k++) {
                    if(i != j&& j != k && i!= k) {
                        t += 1;
                        System.out.println(i*100 + j*10 + k);
                    }
                }
            }
        }
        System.out.println("总共能够组成" + t + "个数字！");
	}
	
	
}
