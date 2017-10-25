package com.tma.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tma.sale.entity.Role;
import com.tma.sale.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
	}

	@Override
	public Role findByName(String nameRole) {
		return roleRepository.findByroleNameContaining(nameRole);
	}

}
