package com.infosys.abcbank.controllers;

import com.infosys.abcbank.entities.Customer;
import com.infosys.abcbank.services.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerServiceImp customerServiceImp;

    //REGISTER CUSTOMER
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerServiceImp.registerCustomer(customer));
    }

    //LOGIN CUSTOMER
    ///skip it as it comes with the security

    //TO FETCH A CUSTOMER
    @GetMapping("/find")
    public ResponseEntity<Customer> findUserById(@RequestParam Integer id){
        return ResponseEntity.ok(customerServiceImp.findUserById(id));
    }

    //TO RETRIEVE ALL CUSTOMERS
    @GetMapping("/all")
    public ResponseEntity<List<Customer>> findAllCustomers(){
        return ResponseEntity.ok(customerServiceImp.findAllCustomers());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteCustomer(@RequestParam Integer id){
        return ResponseEntity.ok(customerServiceImp.deleteCustomer(id));
    }





}
