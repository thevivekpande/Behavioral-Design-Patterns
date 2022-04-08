package chainOfResponsibility;
public class TextDocumentHandler extends DocumentHandler {

	public TextDocumentHandler(DocumentHandler next) {
		super(next);
	}
	
	void openDocument(String fileExtension) {
		if(fileExtension.equalsIgnoreCase("txt")) {
			System.out.println("Opening text document");
		}else {
			super.openDocument(fileExtension);
		}
	}
	
}
