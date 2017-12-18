package com.tma.sale.entityDTO;


import com.tma.sale.entity.Customer;

import java.util.UUID;

public class CustomerDTO {
    private UUID customerId;
    private String customerName;
    private String address;

    public CustomerDTO(Customer customer) {
        this.customerId = customer.getCustomerId();
        this.customerName = customer.getCustomerName();
        this.address = customer.getAddress();
    }

    public UUID getCustomerId() {
        return customerId;
    }

//    public void setCustomerId(UUID customerId) {
//        this.customerId = customerId;
//    }

    public String getCustomerName() {
        return customerName;
    }

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }

    public String getAddress() {
        return address;
    }

//    public void setAddress(String address) {
//        this.address = address;
//    }
}
