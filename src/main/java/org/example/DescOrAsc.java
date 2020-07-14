package org.example;

import java.util.Iterator;
import java.util.List;


public class DescOrAsc {

    public boolean isSorted(List<Integer> numbers) {
        // LONGER Zersion
//        if (numbers.isEmpty() || numbers.size() == 1) {
//            return true;
//        }
//
//        return isAscending(numbers) || isDescending(numbers);


        // SHORTER version
        return (numbers.isEmpty() || numbers.size() == 1) || (isAscending(numbers) || isDescending(numbers));

        // Ternary operator version
//        return (numbers.isEmpty() || numbers.size() == 1) ? true : (isAscending(numbers) || isDescending(numbers));
    }

    public boolean isAscending(List<Integer> numbers) {
        Iterator<Integer> iter = numbers.iterator();
        Integer current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.compareTo(current) > 0) {
                return false;
            } else if (previous.compareTo(current) == 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public boolean isDescending(List<Integer> numbers) {
        Iterator<Integer> iter2 = numbers.iterator();
        Integer current2, previous2 = iter2.next();
        while (iter2.hasNext()) {
            current2 = iter2.next();
            if (previous2.compareTo(current2) < 0) {
                return false;
            } else if (previous2.compareTo(current2) == 0) {
                return false;
            }
            previous2 = current2;
        }
        return true;
    }
}
