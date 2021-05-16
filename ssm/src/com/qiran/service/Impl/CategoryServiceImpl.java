package com.qiran.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiran.mapper.CategoryMapper;
import com.qiran.pojo.Category;
import com.qiran.service.CategoryService;
import com.qiran.util.Page;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryMapper categoryMapper;

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryMapper.list();
	}

	public List<Category> list(Page page) {
		// TODO Auto-generated method stub
		return categoryMapper.list(page);
	}

	public void add(Category category) {

		categoryMapper.add(category);
	}

	public void delete(Category category) {

		categoryMapper.delete(category.getId());
	}

	public void update(Category category) {

		categoryMapper.update(category);
	}

	public int total() {
		// TODO Auto-generated method stub
		return categoryMapper.total();
	}

	public Category get(Integer id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	}

}
