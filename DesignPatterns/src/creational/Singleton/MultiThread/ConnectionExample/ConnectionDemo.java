package creational.Singleton.MultiThread.ConnectionExample;

public class ConnectionDemo {
	public static void main(String[] args) {
		Thread threadOracle = new Thread(new ThreadOracle());
		Thread threadPostgres = new Thread(new ThreadPostgres());
		
		// will initialize the method who start first and then this will be reused
		threadOracle.start();
		threadPostgres.start();
	}
			
	
	public static class ThreadOracle implements Runnable {

		@Override
		public void run() {
			OracleConnectionThreadDemo connection = OracleConnectionThreadDemo.getInstance(ConnectionType.ORACLE);
			connection.connect();
			// ignored param value
			OracleConnectionThreadDemo connection2 = OracleConnectionThreadDemo.getInstance(ConnectionType.POSTGRESQL);
			connection2.connect();
		}
	}
	
	public static class ThreadPostgres implements Runnable {

		@Override
		public void run() {
			OracleConnectionThreadDemo connection = OracleConnectionThreadDemo.getInstance(ConnectionType.POSTGRESQL);
			connection.connect();
			// ignored param value			
			OracleConnectionThreadDemo connection2 = OracleConnectionThreadDemo.getInstance(ConnectionType.ORACLE);
			connection2.connect();
		}
	}
}
