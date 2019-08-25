package ssmDemo.user.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssmDemo.user.dao.UserDao;
import ssmDemo.user.entity.User;
import ssmDemo.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	

	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> queryUser(User user) {
		List<User> userList=new ArrayList<>();
		userList=userDao.queryUser(user);
		return userList;
	}

}
