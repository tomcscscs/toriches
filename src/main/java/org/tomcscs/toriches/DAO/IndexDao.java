package org.tomcscs.toriches.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tomcscs.toriches.model.Item;

@Repository

public class IndexDao {

	@Autowired
	SqlSession sqlSession;

	public List<Item> findAll() {

		return sqlSession.selectList("items.findAll");

	}

}
