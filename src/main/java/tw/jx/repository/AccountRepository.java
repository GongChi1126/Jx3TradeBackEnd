package tw.jx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.jx.bean.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
