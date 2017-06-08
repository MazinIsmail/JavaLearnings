package mazin.certification.classes;

public class XMLMessage extends mazin.certification.support.Message {
	String getText() { return "<msg>text</msg>";}
	public static void main(String[] args) {
	System.out.println(new XMLMessage().getText());
	}
}