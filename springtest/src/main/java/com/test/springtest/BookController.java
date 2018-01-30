package com.test.springtest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springtest.service.Book;
import com.test.springtest.service.BookDao;

@Controller
public class BookController {
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/bookList.do")
	public String bookList(Model model) {
		List<Book> list = bookDao.selectBookList();
		model.addAttribute("list", list);
		System.out.println(list+" : 김장성 존잘남");
		return "bookList";
		
	}
	
}
