package creational.Singleton.MultiThread.ConnectionExample;

import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;

public class OracleConnection extends Connection {
	
	private static volatile OracleConnection instance;
	
	private OracleConnection() {
		super(ConnectionType.ORACLE);
	}
	
	public static OracleConnection getInstance() {
		OracleConnection result = instance;
		
		if(nonNull(result)) {
			return result;
		}
		
		synchronized(OracleConnection.class) {
			if(isNull(instance)) {
				instance = new OracleConnection();
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

