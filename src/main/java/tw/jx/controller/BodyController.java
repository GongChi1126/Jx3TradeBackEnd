package tw.jx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.jx.bean.Body;
import tw.jx.service.BodyService;

@RestController
public class BodyController {

	@Autowired
	private BodyService bService;

	@PostMapping("/findBody")
	@ResponseBody
	public List<Body> findBody() {
		if (bService.findBody() != null) {
			return bService.findBody();
		}
		return null;
	}
}
