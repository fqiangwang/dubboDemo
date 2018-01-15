package demoWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demoApi.Iservice.ItestService;
import com.demoApi.domain.Tuser;

@Controller
@RequestMapping("/")
public class testController {

	@Autowired
	private ItestService testService;
	
	@RequestMapping("test")
	public String sayHello(ModelMap model){
		String say="123";
		say=testService.sayHelloy("baby");
		
		Tuser user=new Tuser();
		user.setId(101);
		user.setName("abc");
		testService.insert(user);
		
		model.addAttribute("say", say);
		System.out.println(say);
		return "test";
	}
}
