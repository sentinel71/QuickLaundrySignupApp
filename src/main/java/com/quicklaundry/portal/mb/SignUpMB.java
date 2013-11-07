package com.quicklaundry.portal.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quicklaundry.portal.model.Signup;
import com.quicklaundry.portal.service.SignUpService;

@Component
@ViewScoped
@ManagedBean(name="signUp")
public class SignUpMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email=""; 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Autowired
	private SignUpService signUpService;
	

	public void setSignUpService(SignUpService signUpService) {
		this.signUpService = signUpService;
	}
	
	public String signup(){
		Signup signup = new Signup();
		signup.setEmail(email);
		try {
			signUpService.signup(signup);	
//			System.out.println("hi");
//			FacesContext.getCurrentInstance().getExternalContext().redirect("signupComplete");
			FacesContext.getCurrentInstance().getExternalContext().redirect("signupComplete.xhtml");
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
//		return "pretty:signupComplete";
	}
	
}
