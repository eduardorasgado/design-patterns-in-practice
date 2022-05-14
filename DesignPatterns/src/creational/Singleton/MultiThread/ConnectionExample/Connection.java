package creational.Singleton.MultiThread.ConnectionExample;

public abstract class Connection {
	private String name;
	private String dbQuery;
	
	protected Connection(ConnectionType connectionType) {
		this.name = connectionType.getName();
		this.dbQuery = connectionType.getQuery();
	}
	
	protected abstract void connect();
	protected abstract void disconnect();
	
	public String getName() {
		return name;
	}
	
	public String getDbQuery() {
		return dbQuery;
	}
}
