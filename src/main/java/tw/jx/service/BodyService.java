package tw.jx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.jx.bean.Body;
import tw.jx.repository.BodyRepository;

@Service
public class BodyService {
	
	@Autowired
	private BodyRepository bDAO;
	
	public List<Body> findBody(){
		return bDAO.findAll();
	}

}
