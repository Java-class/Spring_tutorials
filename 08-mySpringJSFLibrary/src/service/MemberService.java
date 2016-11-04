package service;

import java.util.List;

import entity.Member;
import entity.Membertype;

public interface MemberService 
{
    
    public List<Membertype> GetAllMembertypes();
    public Member Add(Member m, int memtypeid);
    public Member Add(Member t) throws Exception;
	public void Remove(Member t);
	public Member Edit(Member t);
	
	public List<Member> GetAll();
    
    
    
}
