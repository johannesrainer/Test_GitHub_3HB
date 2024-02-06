package socialNetwork;

import java.time.LocalDate;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
	public void createComment(String user, String message) {
		Comment c = new Comment(user, message);
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
	 * calculates the timespan
	 */
	public static String calculateTimeSpan(LocalDate startDate, LocalDate endDate) {

	    // Datumsdifferenz in Tagen berechnen
	    long daysDiff = ChronoUnit.DAYS.between(startDate, endDate);

	    // Differenz in Stunden berechnen
	    long hoursDiff = ChronoUnit.HOURS.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Differenz in Minuten berechnen
	    long minutesDiff = ChronoUnit.MINUTES.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Differenz in Sekunden berechnen
	    long secondsDiff = ChronoUnit.SECONDS.between(startDate.atStartOfDay(), endDate.atStartOfDay());

	    // Hilfsvariable zur Zeitspanne in Millisekunden
	    long totalMilliseconds = Math.abs(endDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - startDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());

	    // Ausgabe der Zeitspanne in entsprechender Einheit
	    if (daysDiff > 0) {
	    	if(daysDiff == 1) {
	    		 return daysDiff + " Tag, " + formatTime(hoursDiff, minutesDiff, secondsDiff);
	    	}else {
	    		 return daysDiff + " Tage, " + formatTime(hoursDiff, minutesDiff, secondsDiff);
	    	}
	    } else if (hoursDiff > 0) {
	        return formatTime(hoursDiff, minutesDiff, secondsDiff);
	    } else if (minutesDiff > 0) {
	        return minutesDiff + " Minuten und " + secondsDiff + " Sekunden";
	    } else {
	        return totalMilliseconds + " Millisekunden";
	    }
	}

	// Hilfsmethode zur Formatierung der Zeitspanne in Stunden, Minuten und Sekunden
	private static String formatTime(long hours, long minutes, long seconds) {
	    return hours + " Stunden, " + minutes + " Minuten und " + seconds + " Sekunden";
	}


	
	@Override
	public String toString() {
		return "MessageTypes [authorUsername=" + authorUsername + ", timestamp=" + timestamp + ", amountOfLikes="
				+ amountOfLikes + ", comments=" + comments + "]";
	}
	

}
