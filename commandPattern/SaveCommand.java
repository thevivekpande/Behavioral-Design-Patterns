package commandPattern;
public class SaveCommand implements Command{
	private Document document;
	
	public SaveCommand(Document document) {
		this.document=document;
	}
	
	public void execute() {
		document.save();
	}
}
