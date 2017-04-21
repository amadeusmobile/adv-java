package com.demo.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.sun.faces.util.MessageFactory;

public class EmailValidator implements Validator {

	@Override
	public void validate(FacesContext ctx, UIComponent comp, Object value)
			throws ValidatorException {
		String email = (String) value;
		if (email.indexOf('@') == -1) {
			FacesMessage message = MessageFactory.getMessage("invalidMail",
					email, "abc@demo.com");
			throw new ValidatorException(message);
		}

	}
}
