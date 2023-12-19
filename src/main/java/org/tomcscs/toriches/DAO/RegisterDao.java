package org.tomcscs.toriches.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tomcscs.toriches.model.Player;

@Repository

public class RegisterDao {
	@Autowired
	SqlSession sqlSession;

	public int save(Player one) {
		return sqlSession.insert("players.save", one);

	}

}
