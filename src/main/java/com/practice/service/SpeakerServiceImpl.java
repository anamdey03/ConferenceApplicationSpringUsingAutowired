package com.practice.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.practice.model.Speaker;
import com.practice.repository.SpeakerRepository;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired //Autowired on Properties
	private SpeakerRepository speakerRepository;

	public SpeakerServiceImpl() {
		System.out.println("Inside default constructor of SpeakerServiceImpl");
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("We're called after the constructor");
	}
	
	// Construction which is used for Constructor Injection
	// @Autowired // ---- Autowired on Constructors
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		System.out.println("Inside parametrized constructor of SpeakerServiceImpl");
		this.speakerRepository = speakerRepository;
	}

	// Setter method which is used for Setter Injection
	//@Autowired //---- Autowired on Setters
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		System.out.println("Inside setter of SpeakerServiceImpl");
		this.speakerRepository = speakerRepository;
	}

	public List<Speaker> findAll() {
		return speakerRepository.finalAll();
	}
}
