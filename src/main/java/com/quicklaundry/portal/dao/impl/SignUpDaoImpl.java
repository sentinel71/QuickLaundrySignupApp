package com.quicklaundry.portal.dao.impl;

import org.springframework.stereotype.Component;

import com.quicklaundry.portal.dao.SignUpDao;
import com.quicklaundry.portal.model.Signup;

@Component
public class SignUpDaoImpl extends GenericDAO<Signup> implements SignUpDao{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SignUpDaoImpl() {
		super(Signup.class);
	}

	public Signup signup(Signup signUp) throws Exception {
		beginTransaction();
		save(signUp);
		commitAndCloseTransaction();
		return null;
	}

}
