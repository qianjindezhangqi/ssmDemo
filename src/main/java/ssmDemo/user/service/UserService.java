package ssmDemo.user.service;

import java.util.List;

import ssmDemo.user.entity.User;

public interface UserService {
	List<User> queryUser(User user);
}
