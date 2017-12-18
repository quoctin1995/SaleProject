package com.tma.sale.service;


import com.tma.sale.entity.Customer;
import com.tma.sale.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
