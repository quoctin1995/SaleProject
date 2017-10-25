package com.tma.sale.service;

import com.tma.sale.entity.Role;

public interface RoleService {
	void saveRole(Role role);

	Role findByName(String nameRole);
}
