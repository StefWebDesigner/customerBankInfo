package com.infosys.abcbank.services;

import com.infosys.abcbank.entities.Customer;
import java.util.List;

public interface CustomerService {

    public Customer registerCustomer(Customer customer);

    public Customer findUserById(Integer id);


    public List<Customer> findAllCustomers();

    public String deleteCustomer(Integer id);



    }
