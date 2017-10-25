package com.tma.sale.service;

import com.tma.sale.entity.User;

public interface UserService {
	void saveUser(User user);

	User findByUserName(String userName);
}
