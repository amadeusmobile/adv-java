package com.demo.struts2;

import java.util.HashMap;
import java.util.Map;

public class UserDAOImpl implements UserDAO {
	Map<String, String> users = new HashMap<String, String>();

	@Override
	public String getPassword(String name) {
		String password = "";
		if (name != null) {
			if (users.containsKey(name)) {
				password = users.get(name);
			}
		}
		return password;
	}

	public UserDAOImpl() {
		users.put("shantanu", "shantanu123");
		users.put("ankur", "ankur123");
		users.put("pavan", "pavan123");
	}
}
