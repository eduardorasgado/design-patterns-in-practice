package behavioral.Mediator.ChatRoomExample;

import java.time.LocalDateTime;

public class ChatRoom implements ChatRoomMediator {
	String name;

	public ChatRoom(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void showMessage(User user, String message) {
		LocalDateTime now = LocalDateTime.now();
		String userName = user.getName();

		System.out
				.println(now.toString().substring(0, now.toString().length() - 10) + " [" + userName + "]:" + message);
	}
}
