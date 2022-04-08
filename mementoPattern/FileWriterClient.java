package mementoPattern;
public class FileWriterClient {
	public static void main(String[] args) {
		FileWriterCareTaker caretaker = new FileWriterCareTaker();
		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("My name is Vivek Pandey\n");
		
		System.out.println(fileWriter+"\n\n");
		caretaker.save(fileWriter);
		fileWriter.write("I am a Full time Software Engineer at Epam Systems.\n");
		System.out.println(fileWriter+"\n\n");
		caretaker.undo(fileWriter);
		System.out.println(fileWriter+"\n\n");
	}

}
