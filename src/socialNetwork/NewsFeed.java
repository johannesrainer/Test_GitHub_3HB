package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {
	
	ArrayList<MessageTypes> newsfeed = new ArrayList<MessageTypes>();
	/**
	 * adds a Submisssion to the ArrayList newsfeed
	 * @param s
	 */
	public void addSubmission(MessageTypes s) {
		this.newsfeed.add(s);
	}
	/**
	 * removes a Submission from the ArrayList newsfedd
	 * @param s
	 */
	public void removeSubmission(MessageTypes s) {
		this.newsfeed.remove(s);
	}
	/**
	 * prints every Submission from an specific user
	 * @param author
	 */
	public void printSubmissionsFromUser(String author) {
		for(MessageTypes s : this.newsfeed) {
			if(s.getAuthorUsername().equals(author)) {
				System.out.println(s);
			}
		}
	}
	
	/**
	 * prints all Submissions
	 */
	public void printAllSubmissions() {
		for(MessageTypes s : this.newsfeed) {
			System.out.println(s);
		}
	}
	
	/**
	 * removes all Subbmissions specific for an user
	 * @param author
	 */
	public void removeSubmissionFromUser(String author) {
		for(MessageTypes s : this.newsfeed) {
			if(s.getAuthorUsername().equals(author)) {
				this.newsfeed.remove(s);
			}
		}
	}

	
}
