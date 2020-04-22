package com.practice.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.practice.model.Speaker;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

	@Autowired
	private Calendar calendar;
	
	@Value("#{ T(java.lang.Math).random() * 100}") // Spring Expression Language
	private double seedNum;
	
	public List<Speaker> finalAll() {
		List<Speaker> speakers = new ArrayList<Speaker>(10);

		Speaker speaker = new Speaker();
		speaker.setFirstName("Anamitra");
		speaker.setLastName("Dey");
		speaker.setSeedNum(seedNum);

		speakers.add(speaker);

		System.out.println("Calender: "+calendar.getTime());
		
		return speakers;
	}
}
