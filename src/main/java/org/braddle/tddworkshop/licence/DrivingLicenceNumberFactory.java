package org.braddle.tddworkshop.licence;

import java.text.SimpleDateFormat;

public class DrivingLicenceNumberFactory {
    private RandomNumberGenerator randomNumberGenerator;

    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMdd");

    public DrivingLicenceNumberFactory(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public String generate(Person person) {
//        return person.getDateOfBirth().toString();
//        return dateFormatter.format(person.getDateOfBirth());
        return person.getInitials() + dateFormatter.format(person.getDateOfBirth()) + randomNumberGenerator.createRandomNumber(3);
    }
}
