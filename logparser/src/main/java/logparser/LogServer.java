package logparser;

public class LogServer {
	private String name,hostNameOrIp,logFileLocation,archiveFolderLocation;
	private Integer port  = 22;
	private String userName,password;
	private boolean promptPassword = true;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHostNameOrIp() {
		return hostNameOrIp;
	}
	public void setHostNameOrIp(String hostNameOrIp) {
		this.hostNameOrIp = hostNameOrIp;
	}
	public String getLogFileLocation() {
		return logFileLocation;
	}
	public void setLogFileLocation(String logFileLocation) {
		this.logFileLocation = logFileLocation;
	}
	public String getArchiveFolderLocation() {
		return archiveFolderLocation;
	}
	public void setArchiveFolderLocation(String archiveFolderLocation) {
		this.archiveFolderLocation = archiveFolderLocation;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isPromptPassword() {
		return promptPassword;
	}
	public void setPromptPassword(boolean promptPassword) {
		this.promptPassword = promptPassword;
	}
}
