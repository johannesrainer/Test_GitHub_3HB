package socialNetwork;



public class Message extends MessageTypes {
	
	private String message;

	

	public Message(String authorUsername, String message) {
		super(authorUsername);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
	
	
	

}
