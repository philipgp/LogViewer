package logparser;

import java.util.List;

public class LogConfig {
	private String configName;
	private LogSourceType logSourceType;
	private List<LogServer> servers;
	
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public LogSourceType getLogSourceType() {
		return logSourceType;
	}
	public void setLogSourceType(LogSourceType logSourceType) {
		this.logSourceType = logSourceType;
	}
	public List<LogServer> getServers() {
		return servers;
	}
	public void setServers(List<LogServer> servers) {
		this.servers = servers;
	}
	@Override
	public String toString() {
		return "LogConfig [configName=" + configName + ", logSourceType="
				+ logSourceType + ", servers=" + servers + "]";
	}
}
