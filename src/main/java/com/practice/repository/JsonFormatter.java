package com.practice.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jsonFormatter")
@Primary
public class JsonFormatter implements Foramtter {

	public String format() {
		return "Json Formatter";
	}

}
