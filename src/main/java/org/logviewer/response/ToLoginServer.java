package org.logviewer.response;

/**
 * Created by philip on 27/5/17.
 */
public class ToLoginServer {

    private String loggerName,hostName;
    private String userName,password;

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

    public ToLoginServer() {
    }
    public String getLoggerName() {
        return loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToLoginServer{");
        sb.append("loggerName='").append(loggerName).append('\'');
        sb.append(", hostName='").append(hostName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
