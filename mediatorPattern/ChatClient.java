package mediatorPattern;
public class ChatClient {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1=new UserImpl(mediator,"Vivek");
		User user2=new UserImpl(mediator,"Virat");
		User user3=new UserImpl(mediator,"Dhoni");
		User user4=new UserImpl(mediator,"Sachin");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Happy MahaShivRatri!");
	}
}
