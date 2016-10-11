package com.mtt.beans;

import com.liferay.portal.kernel.captcha.CaptchaUtil;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class CaptchaBacking {
	 
	private String captchaText;
 
	public String getCaptchaImpl() {
		return CaptchaUtil.getCaptcha().getClass().getName();
	}
 
	public String getCaptchaText() {
		return captchaText;
	}
 
	public void setCaptchaText(String captchaText) {
		this.captchaText = captchaText;
	}
 
	public void submit() {
 
		FacesContext facesContext = FacesContext.getCurrentInstance();
		FacesMessage facesMessage = new FacesMessage("You entered the correct text verification code.");
		facesContext.addMessage(null, facesMessage);
	}
}