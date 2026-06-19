package de.lubowiecki.utils;

public class Config {

    private String user = "";
    private String password = "";
    private String host = "";
    private String port = "";
    private String driver = "";

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Config{");
        sb.append("user='").append(user).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", host='").append(host).append('\'');
        sb.append(", port='").append(port).append('\'');
        sb.append(", driver='").append(driver).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
