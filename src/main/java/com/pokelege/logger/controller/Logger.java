package com.pokelege.logger.controller;

import com.pokelege.logger.entity.LogString;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import java.util.List;

@Controller
public class Logger {
	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	@RequestMapping("/logString")
	public ResponseEntity<String> logString(
			@RequestParam() String instanceId,
	        @RequestParam String message
	){
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		LogString log = new LogString(instanceId, message);
		session.save(log);

		session.getTransaction().commit();
		session.close();
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@RequestMapping("/logString")
	public ModelAndView logString(){
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("select * from LogString");
		List<LogString> list = query.list();
		session.close();
		ModelAndView mv = new ModelAndView("logstring");
		mv.addObject("messages", list);
		return mv;
	}
}