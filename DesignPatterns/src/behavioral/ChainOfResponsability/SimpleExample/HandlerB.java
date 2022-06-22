package behavioral.ChainOfResponsability.SimpleExample;

public class HandlerB extends BaseHandler {

	public HandlerB(String identifier) {
		super(identifier);
	}

	@Override
	public void handle(Request request) {
		if (canHandle(request)) {
			System.out.println("[ " + getIdentifier() + " is handling the request]");

			request.updateParamByKey("password", addDashes(request.getParamByKey("password")));
		}
		super.handle(request);
	}

	@Override
	protected boolean canHandle(Request request) {
		return super.canHandle(request);
	}

	private String addDashes(String word) {
		String[] splittedWord = word.split("");

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < splittedWord.length; i++) {
			builder.append(splittedWord[i] + ((i == splittedWord.length - 1) ? "" : "-"));
		}
		return builder.toString();
	}
}
