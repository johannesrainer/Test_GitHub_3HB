package socialNetwork;

import java.time.LocalDate;
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

}
