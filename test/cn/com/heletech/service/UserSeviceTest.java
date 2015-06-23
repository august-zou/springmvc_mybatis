package cn.com.heletech.service;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import cn.com.heletech.model.User;


@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration   
({"../../../../config/applicationContext.xml"}) //加载配置文件  
public class UserSeviceTest {
  @Resource
  UserService userService;
  
  @Test
  public void findAllUsers() {
    List<User> users = userService.findAllUsers();
    System.out.print("user count  = "+users.size());
    System.out.print("user name  = "+users.get(0).getUserName());

  }
}
