package behavioral.ChainOfResponsability.SimpleExample;

public class HandlerC extends BaseHandler {

	public HandlerC(String identifier) {
		super(identifier);
	}

	@Override
	public void handle(Request request) {
		if (canHandle(request)) {
			System.out.println("[ " + getIdentifier() + " is handling the request]");
			request.updateParamByKey("password", addCrosses(request.getParamByKey("password")));
		}
		super.handle(request);
	}

	@Override
	protected boolean canHandle(Request request) {
		return super.canHandle(request);
	}

	private String addCrosses(String word) {
		return "xX" + word + "Xx";
	}
}
