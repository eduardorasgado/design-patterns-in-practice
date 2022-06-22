package behavioral.ChainOfResponsability.SimpleExample;

import static java.util.Objects.nonNull;

public class BaseHandler implements Handler {
	private Handler next;
	private String identifier;
	
	public BaseHandler(String identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public void setNext(Handler next) {
		this.next = next;
	}

	@Override
	public void handle(Request request) {
		if(nonNull(next)) {
			next.handle(request);
		}
	}

	protected String getIdentifier() {
		return identifier;
	}
	
	protected boolean canHandle(Request request) {
		return nonNull(request) && request.getFilterByKey(getIdentifier()) == true;
	}
}
