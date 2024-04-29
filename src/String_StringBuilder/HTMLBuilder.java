package String_StringBuilder;

public class HTMLBuilder {

	public static String htmlElement(String tag, String body) {
		if((tag.isBlank() || tag == null) && body == null) {
			return "";
		} else if(tag == null || tag.isBlank()) {
			return body;
		} else if(body == null) {
			return "<"+tag+">"+"</"+tag+">";
		} else {
			return "<"+tag+">"+body+"</"+tag+">";
		}
	}
	
	public static String strong(String str) {
		return htmlElement("strong", str);
	}
	
	public static String emphasized(String str) {
		return htmlElement("em", str);
	}

	public static void main(String[] args) {
		System.out.println(htmlElement("strong", ""));
		System.out.println(strong("test"));
		System.out.println(strong(emphasized("test2")));
	}

}
