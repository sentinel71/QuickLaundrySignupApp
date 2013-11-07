package com.quicklaundry.portal.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicklaundry.portal.dao.SignUpDao;
import com.quicklaundry.portal.model.Signup;
import com.quicklaundry.portal.service.SignUpService;

@Component
public class SignUpServiceImpl implements SignUpService,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private SignUpDao signUpDao;
	
	public Signup signup(Signup signup) throws Exception {
		return signUpDao.signup(signup);
	}

}
