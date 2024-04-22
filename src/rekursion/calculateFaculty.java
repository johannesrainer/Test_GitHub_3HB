package rekursion;

public class calculateFaculty {
	
	public static int calculateFaculty(int n) {
		if(n==0) {
			return 1;
		} else {
			return n * calculateFaculty(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateFaculty(5));
	}

}
