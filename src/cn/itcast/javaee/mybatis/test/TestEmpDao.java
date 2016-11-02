package cn.itcast.javaee.mybatis.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.javaee.mybatis.dao.EmpDao;
import cn.itcast.javaee.mybatis.entity.Emp;

/**
 * 单元测试
 * @author AdminTC
 */
public class TestEmpDao {
	
	//单独测试mybatis
	@Test
	public void test1() throws Exception{
		EmpDao empDao = new EmpDao();
		empDao.add(new Emp(1,"哈哈",7000D,"男"));
	}
	
	//测试spring整合mybatis
	@Test
	public void test2() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		EmpDao empDao = (EmpDao) ac.getBean("empDaoID");
		empDao.add(new Emp(2,"明明",8000D,"男"));
	}
}







