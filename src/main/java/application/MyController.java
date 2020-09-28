package application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sample")
public class MyController {

	@GetMapping
	public @ResponseBody MyObject getMyObject() {
		return new MyObject("Hello from git app in the new repo! 27.09.2020. Last try!!");
	}
}
