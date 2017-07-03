package com.blizzard.heatstone.api.qiniu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QiNiuConfig {
	
	@Value("${com.qiniu.storage.accessKey}")
	private String accessKey;
	
	@Value("${com.qiniu.storage.secretKey}")
	private String secretKey;
	
	@Value("${com.qiniu.storage.domain}")
	private String domain;

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "QiNiuConfig [accessKey=" + accessKey + ", secretKey=" + secretKey + ", domain=" + domain + "]";
	}
	
	

}
