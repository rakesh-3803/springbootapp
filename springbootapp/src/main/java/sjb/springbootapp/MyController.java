package sjb.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@GetMapping("/hello")
	public String getRequest()
	{
		return "hello from  spring boot";
	}
	@GetMapping("/add")
	public int getrequest() {
		return 10+20;
		
	}
	

}
