package behavioral.ChainOfResponsability.SimpleExample;

import java.util.Map;

public class SimpleRequest implements Request {
	private Map<String, Boolean> filters;
	private Map<String, String> params;

	public SimpleRequest(Map<String, Boolean> filters, Map<String, String> params) {
		this.filters = filters;
		this.params = params;
	}

	@Override
	public Map<String, Boolean> getFilters() {
		return filters;
	}

	@Override
	public Boolean getFilterByKey(String key) {
		if(filters.containsKey(key)) {
			return filters.get(key);
		}
		return null;
	}

	@Override
	public Map<String, String> getParams() {
		return params;
	}

	@Override
	public String getParamByKey(String key) {
		if(params.containsKey(key)) {
			return params.get(key);
		}
		return null;
	}

	@Override
	public void updateParamByKey(String key, String newValue) {
		if(params.containsKey(key) && newValue != null) {
			params.replace(key, newValue);
		} else {
			System.out.println("ERROR: Cannot update non existing param");
		}
	}
	
}
