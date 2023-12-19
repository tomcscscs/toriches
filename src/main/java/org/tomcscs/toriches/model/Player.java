package org.tomcscs.toriches.model;

import javax.validation.constraints.Size;

public class Player {
	@Size(min = 4, message = "4글자 이상으로 작성해주세요.")
	String id;
	@Size(min=6, message = "6글자 이상입니다.")
	String password;
	int balance;

	
	public Player(String id, String password, int balance) {
		this.id = id;
		this.password = password;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
