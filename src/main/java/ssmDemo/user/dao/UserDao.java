package ssmDemo.user.dao;

import java.util.List;

import ssmDemo.user.entity.User;

public interface UserDao {
	List<User> queryUser(User user);
}
