package com.demo.struts2.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class PasswordLengthValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object arg0) throws ValidationException {
		String fieldname = getFieldName();
		String value = (String) getFieldValue(fieldname, arg0);
		if (value.length() < 8 || value.length() > 12) {
			addFieldError(fieldname,arg0);
		}

	}

}
