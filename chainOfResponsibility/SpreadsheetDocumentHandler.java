package chainOfResponsibility;
public class SpreadsheetDocumentHandler extends DocumentHandler {

	public SpreadsheetDocumentHandler(DocumentHandler next) {
		super(next);
	}
	
	void openDocument(String fileExtension) {
		if(fileExtension.equals("xlsx")) {
			System.out.println("Opening spreadsheet.");
		}else {
			super.openDocument(fileExtension);
		}
	}

}
