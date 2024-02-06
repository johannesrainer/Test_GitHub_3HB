package socialNetwork;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class MessageTypes {
	
	private String authorUsername;
	private LocalDate timestamp;
	private int amountOfLikes;
	private ArrayList<Comment> comments;
	
	
	public MessageTypes(String authorUsername) {
		this.authorUsername = authorUsername;
		this.timestamp = LocalDate.now();
		this.amountOfLikes = 0;
		this.comments = new ArrayList<>();
	}


	public String getAuthorUsername() {
		return authorUsername;
	}


	public void setAuthorUsername(String authorUsername) {
		this.authorUsername = authorUsername;
	}


	public LocalDate getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}


	public int getAmountOfLikes() {
		return amountOfLikes;
	}


	public void setAmountOfLikes(int amountOfLikes) {
		this.amountOfLikes = amountOfLikes;
	}
	

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	/**
	 * adds one like to a Submission
	 */
	public void addLike() {
		this.amountOfLikes +=1;
	}
	
	/**
	 * removes one like from a Submission
	 */
	public void removeLike() {
		this.amountOfLikes -=1;
	}
	
	/**
	 * creates a Comment
	 * @param c
	 */
	public void createComment(Comment c) {
		this.comments.add(c);
	}
	
	/**
	 * removes a comment
	 * @param c
	 */
	public void removeComment(Comment c) {
		this.comments.remove(c);
	}
	
	/**
	 * calculates the Timespan
	 */
	public void calculateTimeSpan() {
		Period timeSpan = Period.between(timestamp, LocalDate.now());
		System.out.println(timeSpan);
	}
	
	@Override
	public String toString() {
		return "MessageTypes [authorUsername=" + authorUsername + ", timestamp=" + timestamp + ", amountOfLikes="
				+ amountOfLikes + ", comments=" + comments + "]";
	}
	

}
