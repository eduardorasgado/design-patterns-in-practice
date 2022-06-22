package behavioral.ChainOfResponsability.SimpleExample;

import java.util.HashMap;

public class SimpleDemo {
	public static void main(String[] args) {
		Handler handle1 = new HandlerA(HandlerA.class.getSimpleName());
		Handler handle2 = new HandlerB(HandlerB.class.getSimpleName());
		Handler handle3 = new HandlerC(HandlerC.class.getSimpleName());
		
		handle1.setNext(handle2);
		handle2.setNext(handle3);
		
		HashMap<String, Boolean> filters = new HashMap<>();
		
		filters.put(HandlerA.class.getSimpleName(), true);
		filters.put(HandlerB.class.getSimpleName(), true);
		filters.put(HandlerC.class.getSimpleName(), true);
		
		HashMap<String, String> params = new HashMap<>();
		params.put("password", "password");
		Request request = new SimpleRequest(filters, params);
		
		handle1.handle(request);
		
		System.out.println(params.get("password"));
	}
}
