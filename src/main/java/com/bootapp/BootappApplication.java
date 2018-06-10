package com.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
@EnableAutoConfiguration
//@EntityScan(value = "com.bootapp.persistence.model")
//@EnableJpaRepositories(basePackages = "com.bootapp.persistence.repo")
@EnableAsync
//@ComponentScan(basePackages = {"com.bootapp", "com.bootapp.web"})
public class BootappApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}

	@Bean
	public ViewResolver configureViewResolvers() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
		//System.out.println("view resolver class");
	}

}



