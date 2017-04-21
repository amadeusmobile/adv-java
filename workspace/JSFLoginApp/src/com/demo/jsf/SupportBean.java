package com.demo.jsf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;

public class SupportBean {
	String name;
	String email;
	Phone phone;
	Date dop;
	String warranty;
	String problem;
	String item;
	List<SelectItem> items = new ArrayList<SelectItem>();

	public List<SelectItem> getItems() {
		return items;
	}

	public void setItems(List<SelectItem> items) {
		this.items = items;
	}

	public SupportBean() {
		items.add(new SelectItem("tv", "TV"));
		items.add(new SelectItem("Camera", "Camera"));
		items.add(new SelectItem("Watch", "watch"));
		items.add(new SelectItem("CPU", "CPU"));
		items.add(new SelectItem("Music System", "Music System"));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void validateEMail(FacesContext ctx, UIComponent comp, Object value)
			throws ValidatorException {
		String email = (String) value;
		if (email.indexOf('@') == -1) {
			FacesMessage message = new FacesMessage("The Email is not valid");
			throw new ValidatorException(message);
		}

	}
}
