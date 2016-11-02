# mybatis_spring_sql
使用Spring将Mybatis的配置文件引入，同时将注解通知Springioc的作用，
Spring初始架构：
控制层：action 或者称 Controller层
在这里调用业务层service（引入@Resource(name="empServiceID")），而在Spring.xml中
<!-- 注册EmpService -->
      <bean id="empServiceID" class="cn.itcast.javaee.mybatis.service.EmpService">
      		<property name="empDao" ref="empDaoID"/>
      </bean>
控制层使用的是扫描包的形式，而注解开发在这里也注入

业务层service再调用持久层的XXXdao
在XXXdao中写增删改查的方法，也即是这里就涉及到数据库的查询，需要对sqlSession进行操作，而此时操作对象为XXX对象的各种属性
找到sqlSession.insert("empNamespace.add",emp); 的"empNamespace"来源为EmpMapper.xml。
此时在EmpMapper.xml中resultMap和insert的某些细节需要对数据库和XXXdao进行映射
