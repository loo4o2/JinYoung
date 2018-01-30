package com.test.springtest.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<Book> selectBookList() {
		return sqlSessionTemplate.selectList(
				"com.test.springtest.service.BookMapper.selectBookList");
	}
}
