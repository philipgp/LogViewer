package common.config;

import java.util.List;

public class LogApplicationConfig {
	private String applicationName;
	private List<String> metadataKeys;
	private List<LogEnvironment> environments;
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public List<String> getMetadataKeys() {
		return metadataKeys;
	}
	public void setMetadataKeys(List<String> metadataKeys) {
		this.metadataKeys = metadataKeys;
	}
	public List<LogEnvironment> getEnvironments() {
		return environments;
	}
	public void setEnvironments(List<LogEnvironment> environments) {
		this.environments = environments;
	}
	@Override
	public String toString() {
		return "LogApplicationConfig [applicationName=" + applicationName
				+ ", metadataKeys=" + metadataKeys + ", environments="
				+ environments + "]";
	}
}
