package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.practice.repository.Foramtter;

@Service("formatterService")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class FormatterServiceImpl implements FormatterService {

	@Autowired
	//@Qualifier("textFormatter")  -- Selecting the particular bean
	private Foramtter foramtter;
	
	public String format() {
		return foramtter.format();
	}
	
}
