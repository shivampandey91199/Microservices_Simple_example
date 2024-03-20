package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// fake user List

	List<User> list = List.of(

			new User(1312L, "Shivam Pandey", "7434046336"), new User(1313L, "Amit Prajapati", "8160708810"),
			new User(1314L, "Prince Ghetiya", "9228751814"), new User(1315L, "Krunal Makwana", "8460081987")

	);

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

	
}
