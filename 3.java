public class _3 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if ((Math.sqrt(i + 100) - (int) Math.sqrt(i + 100) == 0)
					&& (Math.sqrt(i + 168) - (int) Math.sqrt(i + 168) == 0)) {
				System.out.println(i);
			}
		}
	}
}
