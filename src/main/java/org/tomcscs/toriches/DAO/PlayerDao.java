package org.tomcscs.toriches.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tomcscs.toriches.model.Player;

@Repository
public class PlayerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int save(Player one) {
		return jdbcTemplate.update("insert into players values (?,?,?)", one.getId(), one.getPassword(),
				one.getBalance());
	}

}
