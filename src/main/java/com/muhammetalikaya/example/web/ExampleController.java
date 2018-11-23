package com.muhammetalikaya.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.muhammetalikaya.example.service.ExampleService;

@Controller
public class ExampleController {

	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping("/owners")
	public ModelAndView getOwners() {
		ModelAndView model = new ModelAndView();
		System.out.println(exampleService.tumYoneticileriBul().toString());
		model.addObject("owners", exampleService.tumYoneticileriBul());
		model.addObject("ornek", "Gönderilen Değer");
		model.setViewName("owners");
		return model;
		
	}
	
	@RequestMapping("/main")
	@ResponseBody
	public String mainPage() {
		return "İlk Web MVC Ekranına Hoş Geldiniz....";		
	}
	
	
}
