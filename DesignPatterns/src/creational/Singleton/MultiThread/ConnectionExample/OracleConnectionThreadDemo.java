package creational.Singleton.MultiThread.ConnectionExample;

import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;

public class OracleConnectionThreadDemo extends Connection {
	
	private static volatile OracleConnectionThreadDemo instance;
	private String oracleVersion ="12c";
	
	private OracleConnectionThreadDemo(ConnectionType connectionType) {
		super(connectionType);
	}
	
	// this method comes with param just to be able to test the double checked lock in demo class
	// OracleConnection class is the functional class
	public static OracleConnectionThreadDemo getInstance(ConnectionType connectionType) {
		OracleConnectionThreadDemo result = instance;
		
		if(nonNull(result)) {
			return result;
		}
		
		synchronized(OracleConnectionThreadDemo.class) {
			if(isNull(instance)) {
				instance = new OracleConnectionThreadDemo(connectionType);
			}
			return instance;
		}
	}

	@Override
	protected void connect() {
		System.out.println("Connected from..." + getName());
		System.out.println(getDbQuery());
	}

	@Override
	protected void disconnect() {
		System.out.println("Disconnected from..." + getName());
	}
}
