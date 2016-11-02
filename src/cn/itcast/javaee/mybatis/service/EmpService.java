package cn.itcast.javaee.mybatis.service;

import cn.itcast.javaee.mybatis.dao.EmpDao;
import cn.itcast.javaee.mybatis.entity.Emp;


/**
 * 业务层
 * 实现类
 * @author AdminTC
 */
public class EmpService {
	private EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}
	/**
	 * 注册员工
	 */
	public void register(Emp emp) throws Exception{
		empDao.add(emp);
	}
}







