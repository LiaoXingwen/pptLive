package com.lxw.pptLive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.lxw"})
@EnableTransactionManagement
@EnableConfigurationProperties
@EntityScan(basePackages="com.lxw.domain")
@EnableJpaRepositories(basePackages="com.lxw.dao")
public class PptLiveApplication {

	@RequestMapping("test")
	@ResponseBody
	public String test(){
		return "test" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(PptLiveApplication.class, args);
	}
}
