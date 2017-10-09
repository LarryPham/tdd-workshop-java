package org.braddle.tddworkshop.register;

import java.util.Date;

public interface customerRegister {

    void registerCustomer(String firstName, String lastName, String email, Date dateOfbirth) throws NotOldEnoughException, EmailInvalidException;
}
