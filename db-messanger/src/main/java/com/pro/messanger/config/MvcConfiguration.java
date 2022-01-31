package com.pro.messanger.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiguration implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		//https://bottom-to-top.tistory.com/38
		registry.addResourceHandler("/**")
		.addResourceLocations("classpath:/templates/" , "classpath:/static/")
		.setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
	}
}
