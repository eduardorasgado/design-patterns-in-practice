package behavioral.Command.TextEditorExample;

public class Button {
	String title;
	private Runnable executableHistoricalCommand;
	

	public Button(String title) {
		this.title = title;
	}

	public void setCommand(Runnable executableHistoricalCommand) {
		this.executableHistoricalCommand = executableHistoricalCommand;
	}
	
	public void onClick() {
		executableHistoricalCommand.run();
	}
}
