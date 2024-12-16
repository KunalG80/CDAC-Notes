package example.spring.core.without_xml;

public class Greeting {
	private String to;
	private String from;
	private String content;
	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	public Greeting(String to, String from, String content) {
		System.out.println("Inside parameterized....");
		this.to = to;
		this.from = from;
		this.content = content;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Greeting [to=" + to + ", from=" + from + ", content=" + content + "]";
	}

}
