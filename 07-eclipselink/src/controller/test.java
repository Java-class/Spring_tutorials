package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.JPAconfig;
import model.Book;
import service.BookService;


public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 ApplicationContext applicationContext = 
		            new AnnotationConfigApplicationContext(JPAconfig.class);
		        
		        BookService bs = applicationContext.getBean(BookService.class);
		        Book b=new Book();
		        b.setTitle("Spring Programming");
		        b.setAuther("Mostafa Anbarmoo");
		        b.setPage("300");
		        bs.add(b);
	
	}

}
