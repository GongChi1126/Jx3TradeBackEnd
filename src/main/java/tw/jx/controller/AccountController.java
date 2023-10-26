package tw.jx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tw.jx.bean.Account;
import tw.jx.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService aService;

	@PostMapping("/all")
	@ResponseBody
	public List<Account> account() {
		 return aService.findAllAccount();
	}

}
