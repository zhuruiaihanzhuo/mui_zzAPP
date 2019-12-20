package dao.uesr_auth.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.user_auth.Permissions;
import bean.user_auth.Auth;
import dao.uesr_auth.AuthDao;
import db.DBA;

public class AuthDaoImpl implements AuthDao {

	@Override
	public boolean addAuth(Auth auth) {
		DBA dba=new DBA();
		
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		
		//通过sqlSession执行sql语句；
		sqlSession.insert("User_auth.AuthAdd",auth);
		
		sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (sqlSession !=null) {
				sqlSession.close();
			}
			
		}
		return true;
	}

	@Override
	public List<Auth> qureyByUser(String user_id) {
		DBA dba=new DBA();
		List <Auth> authList= new ArrayList<Auth>();
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		
		//通过sqlSession执行sql语句；
		authList=sqlSession.selectList("User_auth.selectAuthByUser",user_id);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (sqlSession !=null) {
				sqlSession.close();
			}
			
		}
	
		
		return authList;
	}

	@Override
	public List<Auth> checkAuth(Auth auth) {
		DBA dba=new DBA();
		List <Auth> authList= new ArrayList<Auth>();
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		
		//通过sqlSession执行sql语句；
		authList=sqlSession.selectList("User_auth.checkAuth",auth);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (sqlSession !=null) {
				sqlSession.close();
			}
			
		}
	
		
		return authList;
	}


	

}
