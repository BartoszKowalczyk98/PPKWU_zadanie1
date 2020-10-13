package PPKWU_zadanie1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InputReverser{
	@RequestMapping(path = "/rev/{var}")
	public String reverseInput( @PathVariable String var){
		return new String(new StringBuilder(var).reverse());
	}
}