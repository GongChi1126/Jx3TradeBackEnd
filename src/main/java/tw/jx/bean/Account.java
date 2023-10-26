package tw.jx.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="AccountId")
	private Integer accountId ;
	
	@Column(name="GameName")
	private String gameName ;
	
	@Column(name="Job")
	private String job;
	
	@Column(name ="Nevel")
	private Integer nevel;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Body")
	private String body;
	
	
}
