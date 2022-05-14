package creational.Singleton.MultiThread.ConnectionExample;

public enum ConnectionType {
	ORACLE("Oracle", "DBHOST=exampleConnection; USERNAME=exampleOracle"),
	POSTGRESQL("Postgre SQL", "PSQLDB=psqExample, HOST=hostname");
	
	private String name;
	private String query;
	
	private ConnectionType(String name, String query) {
		this.name = name;
		this.query = query;
	}
	
	public String getName() {
		return name;
	}

	public String getQuery() {
		return query;
	}
}
