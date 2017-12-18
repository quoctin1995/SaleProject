package com.tma.sale.controller;

import com.tma.sale.entity.Customer;
import com.tma.sale.entityDTO.CustomerDTO;
import com.tma.sale.exception.NoHandlerFoundException;
import com.tma.sale.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<CustomerDTO>> getAllCustomers()  {
        List<Customer> listCustomer = (List<Customer>) customerService.getAllCustomer();

        if(listCustomer.size() == 0) {
            throw new NoHandlerFoundException("NOT FOUND DATA");
        }

        List<CustomerDTO> listCustomerDTO = new ArrayList<>();
        for (Customer customer : listCustomer) {
            listCustomerDTO.add(new CustomerDTO(customer));
        }
        return new ResponseEntity<>(listCustomerDTO, HttpStatus.OK);
    }
}
