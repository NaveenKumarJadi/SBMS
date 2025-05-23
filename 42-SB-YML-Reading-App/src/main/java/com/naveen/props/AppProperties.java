package com.naveen.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties		//to read application.properties file
@ConfigurationProperties(prefix = "abcit")		//l
public class AppProperties {

	private Map<String, String> messages = new HashMap<>();
	
}
