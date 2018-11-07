package gamingchair;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import gamingchair;

public class GamingChairManagerTest {
	
	
	GamingChairManagerJDBC gamingChairManager = new GamingChairManagerJDBC();
	
	private final static String NAME_1 = "ChairA";
	private final static Boolean IS_COMFORTABLE_1 = true;
	
	private final static String NAME_2 = "ChairB";
	private final static Boolean IS_COMFORTABLE_2 = false;
	
	private final static String NAME_3 = "ChairC";
	private final static Boolean IS_COMFORTABLE_3 = true;
	
	private final static String NAME_4 = "ChairD";
	private final static Boolean IS_COMFORTABLE_4 = false;
		
	GamingChair ChairA = new GamingChair(NAME_1, IS_COMFORTABLE_1);
	GamingChair ChairB = new GamingChair(NAME_2, IS_COMFORTABLE_2);
	GamingChair ChairC = new GamingChair(NAME_3, IS_COMFORTABLE_3);
	GamingChair ChairD = new GamingChair(NAME_4, IS_COMFORTABLE_4);
	
	@Test
	public void checkConnection(){
		assertNotNull(gamingChairManager.getConnection());
	}
	
	//@Test
	public void checkAdding(){
		
		GamingChair gamingChair = new GamingChair(NAME_1, );
		
		gamingChairManager.clearGamingChairs();
		assertEquals(1,gamingChairManager.addGamingChair(gamingChair));
		
		List<GamingChair> gamingChairs = gamingChairManager.getAllGamingChairs();
		GamingChair gamingChairRetrieved = gamingChairs.get(0);
		
		assertEquals(NAME_1, gamingChairRetrieved.getName());
		assertEquals(IS_COMFORTABLE_1, gamingChairRetrieved.getIsComfortable());
		
	}
	
	@Test
	public void checkAddAll(){
		gamingChairManager.clearGamingChairs();		
		
		List<GamingChair> gamingChairs = new ArrayList<>();
		gamingChairs.add(ChairA);
		gamingChairs.add(ChairB);
		//persons.add(person2);
		gamingChairs.add(ChairC);
		gamingChairs.add(ChairD);
		
		gamingChairManager.addAllGamingChairs(gamingChairs);
		int size = gamingChairManager.getAllGamingChairs().size();
		
		//assertTrue(size == 0 || size == 4);
		
		assertThat(size, either(is(4)).or(is(0)));
		
	}

}