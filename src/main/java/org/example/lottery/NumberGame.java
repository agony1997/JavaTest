package org.example.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {

    Set<Integer> numbers = new HashSet<>();
    int count;

    void generate() {};

    boolean validate() {
        if (numbers.size() == count) {
            return true;
        } else {
            return false;
        }
    }

}
