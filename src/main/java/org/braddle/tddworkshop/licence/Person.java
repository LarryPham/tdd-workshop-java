package org.braddle.tddworkshop.licence;

import java.util.Date;
import java.util.regex.PatternSyntaxException;

public class Person {

    private String name;

    private Date dateOfBirth;

    private static final String[] NO_INITIALS = {};

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getInitials() {
        String initials = "";

        for (String aName: getNames()) {
            initials = initials + aName.charAt(0);
        }

        return initials;
    }

    private String[] getNames() {
        try {
            return name.split("\\s+");
        } catch (PatternSyntaxException ex) {
            return NO_INITIALS;
        }
    }

}
