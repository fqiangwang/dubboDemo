package demoProvider;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demoApi.Iservice.ItestService;
import com.demoApi.domain.Tuser;

import demoProvider.base.baseTest;


public class test extends baseTest {

	@Autowired 
	private ItestService  testService;
	
	@Test
	public void aa(){
		Tuser user=new Tuser();
		user.setId(7);
		user.setName("abc");
		testService.insert(user);
		
	}
}
