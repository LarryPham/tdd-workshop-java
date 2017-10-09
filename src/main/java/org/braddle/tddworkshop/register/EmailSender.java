package org.braddle.tddworkshop.register;

public interface EmailSender {

    void sendEmail(String toEmail, String toName, String subject, String message);
}
