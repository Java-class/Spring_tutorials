package dao;

import java.util.List;

import entity.Amanat;

public interface AmanatDao
{
	public Amanat Insert(Amanat t);
	public Amanat Update(Amanat t);
	public void Delete(Amanat t);
	public List<Amanat> SelectAll();
	public Amanat SelectById(int Id);
	
}
