package behavioral.ChainOfResponsability.SimpleExample;

import java.util.Map;

public interface Request {
	Map<String, Boolean> getFilters();
	Boolean getFilterByKey(String key);
	Map<String, String> getParams();
	String getParamByKey(String key);
	void updateParamByKey(String key, String newValue);
}
