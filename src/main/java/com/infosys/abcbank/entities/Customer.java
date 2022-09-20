package com.infosys.abcbank.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer_model")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String password;
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private String address1;
    @Column
    private String address2;
    @Column
    private String city;
    @Column
    private String country;
    @Enumerated(EnumType.STRING)
    private SecurityQuestionType securityQuestion1;
    @Enumerated(EnumType.STRING)
    private SecurityQuestionType securityQuestion2;
    @Enumerated(EnumType.STRING)
    private SecurityQuestionType securityQuestion3;
    @Column
    private String role;

    public Customer() {
    }

    public Customer(Integer id, String username, String email, String password, String lastname, String firstname, String address1, String address2, String city, String country, SecurityQuestionType securityQuestion1, SecurityQuestionType securityQuestion2, SecurityQuestionType securityQuestion3, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.country = country;
        this.securityQuestion1 = securityQuestion1;
        this.securityQuestion2 = securityQuestion2;
        this.securityQuestion3 = securityQuestion3;
        this.role = role;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SecurityQuestionType getSecurityQuestion1() {
        return securityQuestion1;
    }

    public void setSecurityQuestion1(SecurityQuestionType securityQuestion1) {
        this.securityQuestion1 = securityQuestion1;
    }

    public SecurityQuestionType getSecurityQuestion2() {
        return securityQuestion2;
    }

    public void setSecurityQuestion2(SecurityQuestionType securityQuestion2) {
        this.securityQuestion2 = securityQuestion2;
    }

    public SecurityQuestionType getSecurityQuestion3() {
        return securityQuestion3;
    }

    public void setSecurityQuestion3(SecurityQuestionType securityQuestion3) {
        this.securityQuestion3 = securityQuestion3;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
