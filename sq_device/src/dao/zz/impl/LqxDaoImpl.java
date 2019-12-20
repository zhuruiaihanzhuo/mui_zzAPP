package dao.zz.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bean.zz.Lqx;
import dao.zz.LqxDao;
import db.DBA;

public class LqxDaoImpl implements LqxDao {

	@Override
	public boolean creatF(Lqx lqx) {
		
		DBA dba=new DBA();
		
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		
		//通过sqlSession执行sql语句；
		sqlSession.insert("Lqx.add",lqx);
		
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
	public List<Lqx> queryB(String stateL) {
		DBA dba=new DBA();
		List <Lqx> lList=new ArrayList<Lqx>();
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		lList= sqlSession.selectList("Lqx.queryB", stateL);
		//通过sqlSession执行sql语句；
		
		System.out.println(lList);
		sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (sqlSession !=null) {
				sqlSession.close();
			}
			
		}
	return lList;
	}

	@Override
	public boolean updateL(Lqx lqx) {
		String stateL=lqx.getStateL();
		System.out.println(stateL+"咋样啦");
		if (stateL.equals("巡检审批")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updatePrin",lqx);
			
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
			
			
		}else if (stateL.equals("未通过(班长驳回)")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			System.out.println(stateL+"咋样啦3");
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updatePrin",lqx);
			
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
			
		}else if (stateL.equals("未通过(巡检驳回)")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updateQc",lqx);
			
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
		}else if (stateL.equals("质控审批")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updateQc",lqx);
			
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
		}else if (stateL.equals("未通过(质控驳回)")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updateQr",lqx);
			
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
		}else if (stateL.equals("完结(巡检)")) {
			DBA dba=new DBA();
			System.out.println(stateL+"咋样啦2");
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updateQc", lqx);
			
			
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
		}else if (stateL.equals("完结(质控)")) {
			DBA dba=new DBA();
			
			SqlSession sqlSession=null;
			try {
			
			sqlSession=	dba.getSqlSession();
			
			//通过sqlSession执行sql语句；
			sqlSession.update("Lqx.updateQr",lqx);
			
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
		}else {
			return false;
		}			
	}

	@Override
	public List<Lqx> queryA(String user) {
		DBA dba=new DBA();
		List <Lqx> lList=new ArrayList<Lqx>();
		SqlSession sqlSession=null;
		try {
		
		sqlSession=	dba.getSqlSession();
		lList= sqlSession.selectList("Lqx.queryH", user);
		//通过sqlSession执行sql语句；
		
		System.out.println(lList);
		sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if (sqlSession !=null) {
				sqlSession.close();
			}
			
		}
	return lList;
	}

}
