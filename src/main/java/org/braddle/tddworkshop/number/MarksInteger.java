package org.braddle.tddworkshop.number;

public interface MarksInteger {

    int getNative();

    boolean isEqual(MarksInteger);

    boolean isGreaterThan(MarksInteger);

    boolean isLessThan(MarksInteger);

    MarksInteger add(MarksInteger);

    MarksInteger minus(MarksInteger);

    MarksInteger divideBy(MarksInteger);

    MarksInteger multiply(MarksInteger);
}
