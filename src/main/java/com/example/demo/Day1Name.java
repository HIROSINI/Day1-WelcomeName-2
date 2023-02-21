package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller

public class Day1Name
{
	@GetMapping("/hello")
	public String hello(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		HttpSession session=req.getSession();
		session.setAttribute("disn", name);
		return "NewFile.jsp";
	}
}