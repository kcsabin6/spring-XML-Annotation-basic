package com.profile.dao;

import java.util.List;

import com.profile.ProfileDTO;

public interface ProfileDao {

	void show();

	ProfileDTO findByEmail(String pemail);

	List<ProfileDTO> sortProfiles(String sort);

	List<ProfileDTO> searchProfiles(String search);

	List<ProfileDTO> findAll();

	List<ProfileDTO> filterProfiles(String filterText);

	List<String> findAllQualification();

	ProfileDTO findByUsername(String pusername);

	String createSignup(ProfileDTO profileDTO);

	String updateSignup(ProfileDTO profileDTO);

	void deleteByUsername(String pusername);

	ProfileDTO authUser(String pusername, String ppassword);

	

}
