package cn.itcast.javaee.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.itcast.javaee.mybatis.entity.Emp;

/**
 * 持久层
 * 实现类
 * @author AdminTC
 */
public class EmpDao {
	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	/**
	 * 增加员工
	 */
	public void add(Emp emp) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("empNamespace.add",emp);
		sqlSession.close();
	}
	
}





