package socialNetwork;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageTypes m1 = new Message("Paul", "Moin!");
		MessageTypes m2 = new Photo("Paul", "Test_1", "David");
		NewsFeed n1 = new NewsFeed();
		
		m1.addLike();
		m2.createComment("David", "Du Süßer");
		n1.addSubmission(m1);
		n1.addSubmission(m2);
		n1.printAllSubmissions();

	}

}
