package com.qiran.service;

import java.util.List;

import com.qiran.pojo.Category;
import com.qiran.util.Page;

public interface CategoryService {
	
public List<Category> list();
	
	public List<Category> list(Page page);
	
	public void add(Category category);
	
	public void delete(Category category);
	
	public void update(Category category);
	
	public int total();
	
	public Category get(Integer id);

}
