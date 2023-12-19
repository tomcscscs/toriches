package org.tomcscs.toriches.DAO;

import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.tomcscs.toriches.model.Item;

@Repository

public class IndexDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Item> findAll() {
		return jdbcTemplate.query("select * from items order by price desc", new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

				Item one = new Item();

				one.setCode(rs.getInt("code"));
				one.setName(rs.getString("name"));
				one.setPrice(rs.getInt("price"));
				one.setMinRate(rs.getDouble("min_rate"));
				one.setMaxRate(rs.getDouble("max_rate"));

				return one;

			}

		});// end

	}

}
