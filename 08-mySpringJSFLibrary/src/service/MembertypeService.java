package service;

import java.util.List;

import entity.Membertype;

public interface MembertypeService 
{

	//public List<Membertype> GetAllMembertypes();
    //public Book Add(Book m, int memtypeid);
    public Membertype Add(Membertype t) throws Exception;
	public void Remove(Membertype t);
	public Membertype Edit(Membertype t);
	
	public List<Membertype> GetAll();
}
