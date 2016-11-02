package cn.itcast.javaee.mybatis.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.itcast.javaee.mybatis.entity.Emp;
import cn.itcast.javaee.mybatis.service.EmpService;

/**
 * 单例
 * 控制器
 * @author AdminTC
 */
@Controller
@RequestMapping(value="/emp")
public class EmpAction {
	private EmpService empService;
	@Resource(name="empServiceID")
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	/**
	 * 注册员工
	 */
	@RequestMapping(value="/register")
	public String registerMethod(Emp emp) throws Exception{
		//调用业务层
		empService.register(emp);
		return "success";
	}
}







