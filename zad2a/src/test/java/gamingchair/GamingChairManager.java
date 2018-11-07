package gamingchair;

import java.util.List;

import gamingchair.GamingChairManagerJDBC;

public class GamingChairManager {
	public int addGamingChair(GamingChair gamingchair);
	public List<GamingChair> getAllGamingChairs();
	
	//batch insert - transactional 
	public void addAllGamingChairs(List<GamingChair> gamingChairs);
}
