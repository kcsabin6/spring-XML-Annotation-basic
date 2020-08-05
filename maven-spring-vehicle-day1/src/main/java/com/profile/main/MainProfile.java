package com.profile.main;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.profile.ProfileDTO;
import com.profile.dao.ProfileDao;

public class MainProfile {

	public static void main(String[] args) {
		
		//create container with xml
		ApplicationContext context = new ClassPathXmlApplicationContext("profile.xml");
		
		//create beans with id
		ProfileDao profileDao=(ProfileDao)context.getBean("profileDaoImpl");
		//System.out.println(profileDao);
		//profileDao.show();
		
		ProfileDTO profileDTO = new ProfileDTO();
		
		profileDTO.setEmail("e@123@yahoo.com");
		profileDTO.setGender("male");
		profileDTO.setMobile("1112");
		profileDTO.setName("Gha");
		profileDTO.setPassword("jfdkjf");
		profileDTO.setQualification("hsed");
		profileDTO.setUsername("k@err");
		profileDTO.setCreatedate(new Timestamp(new Date().getTime()));
		
		String status=profileDao.createSignup(profileDTO);
		System.out.println("Status is "+status);
		
		List<ProfileDTO> profileDTOs = profileDao.findAll();
		for(ProfileDTO dto:profileDTOs) {
			System.out.println(dto);
		}
		
		
		
		
		
	
		
		
		

	}

}
