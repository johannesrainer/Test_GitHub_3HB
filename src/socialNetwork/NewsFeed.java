package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	ArrayList<MessageTypes> newsfeed = new ArrayList<MessageTypes>();
	
	public void addSubmission(MessageTypes s) {
		this.newsfeed.add(s);
	}
	
	public void removeSubmission(MessageTypes s) {
		this.newsfeed.remove(s);
	}
	
	public void printSubmissionsFromUser(String author) {
		for(MessageTypes s : this.newsfeed) {
			if(s.getAuthorUsername().equals(author)) {
				System.out.println(s);
			}
		}
	}
	
	public void printAllSubmissions() {
		for(MessageTypes s : this.newsfeed) {
			System.out.println(s);
		}
	}

	
}
