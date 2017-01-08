package com.tonyganchev.blog.karaf.wab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DummyController {
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public @ResponseBody String hello() {
		return "<h1>God dag!</h1>";
	}
}
