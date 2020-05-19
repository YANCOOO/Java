package DG;

public class dgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a(5));
	}
	
	
	public static int a(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		return n * a(n-1);
	
}
}
