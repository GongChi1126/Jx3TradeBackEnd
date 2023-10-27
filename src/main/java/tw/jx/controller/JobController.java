package tw.jx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.jx.bean.Job;
import tw.jx.service.JobService;

@RestController
public class JobController {

	@Autowired
	private JobService jService;

	@PostMapping("/findJob")
	@ResponseBody
	public List<Job> findJob() {
		List<Job> result = jService.findJob();
		if (result != null) {
			return result;
		}
		return null;
	}

}
