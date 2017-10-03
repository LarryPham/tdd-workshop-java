package org.braddle.tddworkshop.number;

public interface MarksInteger {

    int getNative();

    boolean isEqual(int MarksInteger);

    boolean isGreaterThan(int MarksInteger);

    boolean isLessThan(int MarksInteger);

    MarksInteger add(int MarksInteger);

    MarksInteger minus(int MarksInteger);

    MarksInteger divideBy(int MarksInteger);

    MarksInteger multiply(int MarksInteger);
}
