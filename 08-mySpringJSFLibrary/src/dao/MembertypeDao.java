package dao;

import java.util.List;

import entity.Membertype;

public interface MembertypeDao
{

	 public Membertype Insert(Membertype t);
	 public Membertype Update(Membertype t);
	 public void Delete(Membertype t);
	 public List<Membertype> SelectAll();
	 public Membertype SelectById(int Id);
}
