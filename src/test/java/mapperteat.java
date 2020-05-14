//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
//public class mapperteat {
//    @Autowired
//    DepartmentMapper departmentMapper;
//    @Autowired
//    EmployeeMapper employeeMapper;
//    @Autowired
//    SqlSession sqlSession;
//    @Test
//    public void crud(){
////       // employeeMapper.insertSelective(new Employee(null,"李四","1","1212@qq.com",1));
////        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
////        for (int i = 0; i <1000 ; i++) {
////           String uid= UUID.randomUUID().toString().substring(0,5)+i;
////           mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",1));
////        }
//        Employee employee = employeeMapper.selectByPrimaryKey(1);
//        System.out.println(employee);
//        System.out.println("查询完成");
//    }
//}
