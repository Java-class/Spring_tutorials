package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.ProjectConfig;
import entity.Book;
import service.BookService;

public class Testing 
{
	public static void main(String[]args) throws Exception
	{
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		BookService bs=ctx.getBean(BookService.class);
		
		Book b=new Book();
		b.setAuthor("Mostafa");
		b.setTitle("java Programming");
		bs.Add(b);
		
	}
	
	
}
