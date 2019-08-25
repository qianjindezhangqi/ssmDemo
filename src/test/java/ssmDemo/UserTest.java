package ssmDemo;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssmDemo.user.entity.User;
import ssmDemo.user.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml"})
public class UserTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void queryUser(){
		User user=new User();
		user.setId(null);
		List<User> list=userService.queryUser(user);
		System.out.println(list.toString());
	}
}
