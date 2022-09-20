package com.infosys.abcbank.services;

import com.infosys.abcbank.entities.Customer;
import com.infosys.abcbank.exceptions.exceptionClasses.DeleteCustomerException;
import com.infosys.abcbank.exceptions.exceptionClasses.UserExceptions;
import com.infosys.abcbank.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService {

    private final  CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    //REGISTER CUSTOMER
    public Customer registerCustomer(Customer customer){

        return customerRepository.save(customer);
    }

    public Customer findUserById(Integer id){
        Optional<Customer> findUser = customerRepository.findById(id);
        if(findUser.isPresent()){
            return findUser.get();
        } else {
            throw new UserExceptions("USER DOESN'T EXIST. PLEASE TRY AGAIN");
        }
    }

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public String deleteCustomer(Integer id){
        Optional<Customer> findCustomer = customerRepository.findById(id);
        if(findCustomer.isPresent()){
            customerRepository.deleteById(id);
            return "CUSTOMER REMOVED";
        } else {
            throw new DeleteCustomerException("UNABLE TO REMOVE CUSTOMER");
        }
    }


}
