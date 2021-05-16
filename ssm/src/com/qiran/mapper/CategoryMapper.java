package com.qiran.mapper;

import java.util.List;

import com.qiran.pojo.Category;
import com.qiran.util.Page;

public interface CategoryMapper {
	
	public List<Category> list();
	
	public List<Category> list(Page page);
	
	public void add(Category category);
	
	public void delete(Integer id);
	
	public void update(Category category);
	
	public int total();
	
	public Category get(Integer id);
}
