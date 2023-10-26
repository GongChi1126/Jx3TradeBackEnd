package tw.jx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.jx.bean.Account;
import tw.jx.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository aDAO;

	public List<Account> findAllAccount() {
		return aDAO.findAll();
	}

}
