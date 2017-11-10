package com.cg.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.app.dto.ApplicantBean;
import com.cg.app.service.IApplicationService;

@Controller
public class MyController {

	@Autowired
	private IApplicationService serviceRef;
	
	
	
	public IApplicationService getServiceRef() {
		return serviceRef;
	}

	public void setServiceRef(IApplicationService serviceRef) {
		this.serviceRef = serviceRef;
	}

	
	
	@RequestMapping("/index")
	public String homePage(Model model,HttpServletRequest req)
	{
		model.addAttribute("appTitle", req.getServletContext().getServletContextName());
		model.addAttribute("applDetails", new ApplicantBean());
		
		List<String> listCourse = new ArrayList<String>();
		
		listCourse.add("Java");
		listCourse.add(".Net");
		listCourse.add("C++");
		
		model.addAttribute("courseSet", listCourse);
		
		return("home");
	}
	
	@RequestMapping("/addApplicant")
	public String insertData(@ModelAttribute("applDetails")@Valid ApplicantBean apBean,BindingResult result){
		
		
		System.out.println("before insert"+apBean);

			ApplicantBean bean = serviceRef.insertApplicant(apBean);
			System.out.println("after insertion"+bean);
			return("SuccessPage");
		
		
	}
	
}
