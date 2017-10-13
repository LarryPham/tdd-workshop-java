package org.braddle.tddworkshop.register;

import java.util.Date;

public class CustomerRegister {

    private EmailSender emailSender;

    public CustomerRegister(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public Customer registerCustomer(String firstName, String lastName, String email) throws EmailInvalidException {
        Customer customer = new Customer(firstName, lastName, email);

        emailSender.sendEmail(email, firstName, "Welcome", "Hi, We are so please you registered");

        return customer;
    }


}
