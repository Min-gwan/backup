package kr.co.plantlibrary.login;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.Setter;

@Repository
public class LoginDAOimpl implements LoginDAO {

	@Setter(onMethod_ = @Autowired )
	private SqlSession  sqlSession;
	
	private static final String nameSpace = "kr.co.plantlibrary.plant_login";
	
//	로그인
	@Override
	public Map<String, String> login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(nameSpace + ".login", map);
	}
	
//	회원가입
	@Override
	public int register(LoginEntity loginEntity) {
		// TODO Auto-generated method stub
		return sqlSession.insert(nameSpace + ".register", loginEntity);
	}

	

}