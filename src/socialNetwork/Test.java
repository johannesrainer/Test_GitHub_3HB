package socialNetwork;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MessageTypes m1 = new Message("Paul", "Moin!");
		//MessageTypes m2 = new Photo("Luca", "Test_1", "David");
		//NewsFeed n1 = new NewsFeed();
		
		/*m1.addLike();
		m2.createComment("David", "Du S��er");
		n1.addSubmission(m1);
		n1.addSubmission(m2);
		n1.printAllSubmissions();
		n1.printSubmissionsFromUser("Luca");*/
		
		System.out.println(MessageTypes.calculateTimeSpan(LocalDate.of(2024, 2, 5),LocalDate.now()));
		

	}

}
