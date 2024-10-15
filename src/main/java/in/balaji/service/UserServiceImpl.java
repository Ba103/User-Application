package in.balaji.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.balaji.entity.User;
import in.balaji.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User upsert(User user) {
		return userRepo.save(user);

	}

	@Override
	public User getById(Integer id) {
		Optional<User> userById = userRepo.findById(id);
		if (userById.isPresent()) {
			return userById.get();
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();

	}

	@Override
	public String deleteById(Integer id) {
		if (userRepo.existsById(id)) {
			userRepo.deleteById(id);
			;
			return "User Role deleted Successfull";
		} else {
			return "User role not present";
		}

	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
