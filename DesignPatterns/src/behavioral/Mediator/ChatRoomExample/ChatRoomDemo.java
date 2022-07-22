package behavioral.Mediator.ChatRoomExample;

public class ChatRoomDemo {
	public static void main(String[] args) {
		ChatRoomMediator chatRoom = new ChatRoom("ITI graduates 2020 Mechatronics Engineering");
		
		User joe = new User("Joe", chatRoom);
		User billie = new User("Billie", chatRoom);
		User sanders = new User("Sanders", chatRoom);
		
		System.out.println(((ChatRoom) chatRoom).getName());
		joe.send("Hey there!");
		sanders.send("Hey buddy, how are you?!");
		billie.send("Good morning y'all");
	}
}
