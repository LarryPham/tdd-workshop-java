package org.braddle.tddworkshop.coverage;

public class Thing {
    public int doThing(boolean a, boolean b) {
        int i = 0;

        if (a) {
            i += 2;
        }

        if (b) {
            i += 3;
        }

        return i;
    }
}
