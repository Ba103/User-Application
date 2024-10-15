package in.balaji.service;

import java.util.List;

import in.balaji.entity.User;

public interface UserService {

	public User upsert(User user);

	public User getById(Integer id);

	public List<User> getAllUsers();

	public String deleteById(Integer id);
	
	public User updateUser(User user);

}
