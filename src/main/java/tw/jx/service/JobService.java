package tw.jx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.jx.bean.Job;
import tw.jx.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository jDAO;

	public List<Job> findJob() {
		return jDAO.findAll();
	}
}
