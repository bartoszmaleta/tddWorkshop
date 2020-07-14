package org.example;

import java.util.Iterator;
import java.util.List;


public class DescOrAsc {

    public boolean isAscending(List<Integer> numbers) {
        if (numbers.isEmpty() || numbers.size() == 1) {
            return true;
        }

        Iterator<Integer> iter = numbers.iterator();
        Integer current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }
}
