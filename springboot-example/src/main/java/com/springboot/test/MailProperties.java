package com.springboot.test;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="myapp.mail")
public class MailProperties {

	  private String to;
	  private String host;
	  private int port;
	  
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	  
	  
	  
	  
}
