package dao;
import java.util.List;

import entity.*;
public interface MemberDao {
    
    
    public Member Insert(Member t);
	public Member Update(Member t);
	public void Delete(Member t);
	public List<Member> SelectAll();
	public Member SelectById(int Id);
    
}
