package edu.uc.cech.agrawadv.eventorganizer.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import edu.uc.cech.agrawadv.eventorganizer.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Optional<User> findUser(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public Optional<User> findUserByUsername(String username) {
		User userQuery = new User(username);
		return userRepository.findOne(Example.of(userQuery));
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
