package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.User;
import com.spring.service.PageNationService;

@Controller

public class UserController {

	@Autowired
	public PageNationService service;

	@RequestMapping(value = "/users")
	public ModelAndView listUser(@RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
			@RequestParam(value = "sortedColumn", defaultValue = "id") String sortedColumn,
			@RequestParam(value = "searchBy", defaultValue = "4") int searchBy) {

		ModelAndView mv = null;
		Page<User> pagenation = service.pagenation(pageNo, pageSize, sortedColumn, searchBy);
		
		
		mv = new ModelAndView();
		mv.addObject("users", pagenation.getContent());
		mv.addObject("totalNumberOfPages", pagenation.getTotalPages());
		mv.addObject("pagesize", pagenation.getNumberOfElements());
		mv.addObject("pagenumber", pagenation.getNumber());
		mv.addObject("pageSize", pageSize);
		mv.addObject("totalrecords",pagenation.getTotalPages()*pagenation.getNumberOfElements());
		
		
		mv.setViewName("usersList");
		
		
		
		
		return mv;
	}

}
