package com.infosys.abcbank;

import com.infosys.abcbank.entities.Customer;
import com.infosys.abcbank.entities.SecurityQuestionType;
import com.infosys.abcbank.repositories.CustomerRepository;
import com.infosys.abcbank.services.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTests {

    @Autowired
    private CustomerService customerService;

    @MockBean
    private CustomerRepository customerRepository;

    @Test
    public void RegisterCustomer(){
        Customer testCustomer = new Customer(
                1,
                "stef",
                "stefan@icloud.com",
                "password",
                "riley",
                "stefan",
                "first Street",
                "apt 2",
                "Hartford",
                "United States",
                SecurityQuestionType.QUESTION1,
                SecurityQuestionType.QUESTION2,
                SecurityQuestionType.QUESTION3,
                "ADMIN"
        );

        when(customerRepository.save(testCustomer)).thenReturn(testCustomer);
        assertEquals(testCustomer, customerService.registerCustomer(testCustomer));
    }

    @Test
    public void findUserByIdTest(){
        Customer testCustomer = new Customer(
                1,
                "stef",
                "stefan@icloud.com",
                "password",
                "riley",
                "stefan",
                "first Street",
                "apt 2",
                "Hartford",
                "United States",
                SecurityQuestionType.QUESTION1,
                SecurityQuestionType.QUESTION2,
                SecurityQuestionType.QUESTION3,
                "ADMIN"
        );

        when(customerRepository.findById(testCustomer.getId())).thenReturn(Optional.of(testCustomer));
        assertEquals(testCustomer, customerService.findUserById(testCustomer.getId()));
    }

    @Test
    public void findAllCustomersTest(){
        when(customerRepository.findAll()).thenReturn(Stream.of(
                new Customer(
                        1,
                        "stef",
                        "stefan@icloud.com",
                        "password",
                        "riley",
                        "stefan",
                        "first Street",
                        "apt 2",
                        "Hartford",
                        "United States",
                        SecurityQuestionType.QUESTION1,
                        SecurityQuestionType.QUESTION2,
                        SecurityQuestionType.QUESTION3,
                        "ADMIN"
                ),

                new Customer(
                        2,
                        "maria",
                        "maria@icloud.com",
                        "password1",
                        "Martin",
                        "maria",
                        "second Street",
                        "apt 3",
                        "Hartford",
                        "United States",
                        SecurityQuestionType.QUESTION1,
                        SecurityQuestionType.QUESTION2,
                        SecurityQuestionType.QUESTION3,
                        "USER"
                )
        ).collect(Collectors.toList()));
        assertEquals(2, customerService.findAllCustomers().size());
    }


    @Test
    public void DeleteCustomerByIdTest(){

        Customer testCustomer = new Customer(
                1,
                "stef",
                "stefan@icloud.com",
                "password",
                "riley",
                "stefan",
                "first Street",
                "apt 2",
                "Hartford",
                "United States",
                SecurityQuestionType.QUESTION1,
                SecurityQuestionType.QUESTION2,
                SecurityQuestionType.QUESTION3,
                "ADMIN"
        );

        when(customerRepository.findById(testCustomer.getId())).thenReturn(Optional.of(testCustomer));
        assertEquals(customerService.deleteCustomer(1), "CUSTOMER REMOVED");

    }






}
