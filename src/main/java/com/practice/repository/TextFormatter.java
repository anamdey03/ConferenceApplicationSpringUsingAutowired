package com.practice.repository;

import org.springframework.stereotype.Component;

@Component("textFormatter")
public class TextFormatter implements Foramtter {

	public String format() {
		return "Text Formatter";
	}

}
