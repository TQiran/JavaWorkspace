package com.qiran.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.qiran.pojo.Category;
import com.qiran.service.CategoryService;
import com.qiran.util.Page;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/list")
	public ModelAndView listCategory(Page page) {
		ModelAndView mv = new ModelAndView();
		List<Category> cs = categoryService.list(page);
		int total = categoryService.total();
		page.calculateLast(total);
		mv.addObject("cs", cs);
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView addCategory(Category c) {
		ModelAndView mv = new ModelAndView();
		categoryService.add(c);
		mv.setViewName("redirect:/list");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteCategory(Category c) {
		ModelAndView mv = new ModelAndView();
		categoryService.delete(c);
		mv.setViewName("redirect:/list");
		return mv;
	}
	
	@RequestMapping("/edit")
	public ModelAndView editCategory(Category c) {
		ModelAndView mv = new ModelAndView();
		c = categoryService.get(c.getId());
		System.out.println(c);
		mv.addObject("c", c);
		mv.setViewName("edit");
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateCategory(Category c) {
		ModelAndView mv = new ModelAndView();
		categoryService.update(c);
		System.out.println("update--->" + c);
		mv.setViewName("redirect:/list");
		return mv;
	}
	
}
