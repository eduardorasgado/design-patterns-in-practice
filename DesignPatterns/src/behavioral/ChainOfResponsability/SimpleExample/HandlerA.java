package behavioral.ChainOfResponsability.SimpleExample;

import static java.util.Objects.nonNull;

public class HandlerA extends BaseHandler {

	public HandlerA(String identifier) {
		super(identifier);
	}

	@Override
	public void handle(Request request) {
		if (canHandle(request)) {
			System.out.println("[ " + getIdentifier() + " is handling the request]");

			request.updateParamByKey("password", reverse(request.getParamByKey("password")));
		}
		super.handle(request);
	}

	@Override
	protected boolean canHandle(Request request) {
		return super.canHandle(request);
	}

	private String reverse(String word) {
		String[] tempReq = word.split("");

		StringBuffer buff = new StringBuffer();
		for (int i = tempReq.length - 1; i >= 0; i--) {
			buff.append(tempReq[i]);
		}
		return buff.toString();
	}
}
