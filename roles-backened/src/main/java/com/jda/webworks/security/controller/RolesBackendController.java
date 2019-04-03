package com.jda.webworks.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jda.webworks.security.beans.RolesBean;
import com.jda.webworks.security.dao.RoleDao;

@Controller
public class RolesBackendController {

	@Autowired
	RoleDao roleDao;
	
	@ResponseBody
	@RequestMapping("/home")
	public String Hello() {
		return "Hello sourav";
	}
	
	@RequestMapping("/allRoles/json")
	@ResponseBody
	public List<RolesBean> getAllRolesJson() {
		System.out.println("In Roles json");
		List<RolesBean> rolesList = roleDao.getAllRoles();
		return rolesList;
	}
}
