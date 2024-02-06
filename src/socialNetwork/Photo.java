package socialNetwork;


public class Photo extends MessageTypes {
	
	private String fileName;
	private String headline;
	
	public Photo(String authorUsername, String fileName, String headline) {
		super(authorUsername);
		this.fileName = fileName;
		this.headline = headline;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	@Override
	public String toString() {
		return "Photo [fileName=" + fileName + ", headline=" + headline + "]";
	}
	
	
}
