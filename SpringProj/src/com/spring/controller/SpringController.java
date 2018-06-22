package com.spring.controller;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringController implements Controller  {

	public ModelAndView welcome(HttpServletRequest req, HttpServletResponse res) throws Exception {
		SpringDAO je = new SpringDAO();
		int login = je.select(req.getParameter("username"),req.getParameter("password"));
		if (login>0) {
			ModelAndView mv= new ModelAndView("welcome");

			//ModelAndView mv=new ModelAndView("login");
			//System.out.println("*****"+req.getParameter("username"));
			//System.out.println("*****"+req.getParameter("password"));
			//System.out.println("fffhgjghj");
			return mv;
		}
		else {
			ModelAndView mv = new ModelAndView("login");
			return mv;
		}
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return null;
	}
}
