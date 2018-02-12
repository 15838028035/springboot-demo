package com.demo.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
  * @description: 启动StringBoot
  * @author yt.wei
  * @date 2018/2/11 8:53
  * @version 0.1
  */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	/**
	 * 日志打印
	 */
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	/**
	  * description:
	  * @author yt.wei
	  * @param 
	  * @return 
	  * @date 2018/2/11 8:53
	  */
	public static void main(String[] args) {
		LOG.info("***************************************");
		LOG.info("***** Start Spring Boot Begining *****");
		LOG.info("***************************************");
		SpringApplication.run(Application.class, args);
		LOG.info("***************************************");
		LOG.info("***  Start Spring Boot Sucessfully  ***");
		LOG.info("***************************************");
		LOG.info("启动成功访问swagger2：http://localhost:8080/swagger-ui.html");
		LOG.info("美化后的swagger2：http://localhost:8080/doc.html");
	}
}
