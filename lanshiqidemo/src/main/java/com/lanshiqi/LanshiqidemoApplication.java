package com.lanshiqi;

import com.lanshiqi.domain.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "com.lanshiqi")
public class LanshiqidemoApplication {

	@Autowired
	private BookBean bookBean;


	public static void main(String[] args) {
		SpringApplication.run(LanshiqidemoApplication.class, args);
	}

	@GetMapping(value = "/index")
	public String index(){
		System.out.println("index");
		return "index";
	}

	@RequestMapping(value = "/index/book",method = RequestMethod.GET)
	public BookBean indexBook(){
		System.out.println(bookBean.getName());
		return bookBean;
	}
}
