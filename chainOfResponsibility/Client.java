package chainOfResponsibility;
public class Client {
	public static void main(String[] args) {
		DocumentHandler chain = new SlideshowHandler(new TextDocumentHandler(new SpreadsheetDocumentHandler(null)));
		chain.openDocument("txt");
		chain.openDocument("xlsx");
		chain.openDocument("ppt");
	}
}
