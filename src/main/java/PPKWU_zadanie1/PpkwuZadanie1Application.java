package PPKWU_zadanie1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PpkwuZadanie1Application {

	public static void main(String[] args) {
		SpringApplication.run(PpkwuZadanie1Application.class, args);
	}

}

@RestController
class InputReverser{
	@RequestMapping(path = "/rev/{var}")
	public String reverseInput( @PathVariable String var){
		return new String(new StringBuilder(var).reverse());
	}
}