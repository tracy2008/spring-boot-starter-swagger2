package com.tracy.swagger;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置文件
 * @author tracy
 * 2017年9月13日
 */
@ConfigurationProperties(prefix = "swagger2")
public class Swagger2Properties {

	private String title;

	private String description;

	private String scanPackage;

	private String version;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getScanPackage() {
		return scanPackage;
	}

	public void setScanPackage(String scanPackage) {
		this.scanPackage = scanPackage;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	
}
