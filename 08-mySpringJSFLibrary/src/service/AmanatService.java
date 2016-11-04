package service;

import java.util.List;

import entity.Amanat;

public interface AmanatService 
{

	  //public Amanat Add(Amanat t) throws Exception;
	  public void Remove(Amanat t);
	  public Amanat Edit(Amanat t);
		
	  public List<Amanat> GetAll();
		
		
	  public Amanat AddNewAmanat(Amanat a, int bookID, int memberID) throws Exception;

	  //public List<Amanat> GetAllAmanat();
		
	

		
		
}
