package chainOfResponsibility;
public class SlideshowHandler extends DocumentHandler{

	public SlideshowHandler(DocumentHandler next) {
		super(next);
	}
	
	void openDocument(String fileExtension) {
		if(fileExtension.equals("ppt")) {
			System.out.println("Opening slide show document"); 
		}else {
			super.openDocument(fileExtension);
		}
	}

}
