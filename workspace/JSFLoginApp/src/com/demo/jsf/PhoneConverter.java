package com.demo.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

//@FacesConverter("phoneConverter")
public class PhoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent comp, String value) {
		Phone phone = null;
		if (value.indexOf('-') != -1) {
			String[] parts = value.split("-");
			phone = new Phone();
			phone.setCountryCode(parts[0]);
			phone.setRegionCode(parts[1]);
			phone.setPhoneNumber(parts[2]);
		} else {
			throw new ConverterException(new FacesMessage(
					"Please provide a correct format"));
		}
		return phone;
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent comp, Object obj) {
		Phone phone = (Phone) obj;
		return phone.getCountryCode() + "-" + phone.getRegionCode() + "-"
				+ phone.getPhoneNumber();
	}

}
