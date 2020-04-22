package com.practice.main;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.util.CalendarFactory;

@Configuration
@ComponentScan({"com.practice"})
public class AppConfig {

	@Bean
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(5);
		return factory;
	}
	
	@Bean Calendar calendar() throws Exception {
		return calFactory().getObject();
	}
}
