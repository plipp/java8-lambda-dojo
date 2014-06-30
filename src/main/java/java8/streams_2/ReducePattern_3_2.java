package java8.streams_2;

import java.util.*;
import java.util.function.BinaryOperator;

import static java.util.Arrays.asList;

// accumulator = initialValue
// accumulator = combine(accumulator,nextValue)
public class ReducePattern_3_2 {

    public int accumulateWithExternalIteration(List<Integer> intList, int initialValue, BinaryOperator<Integer> op) {
        int accumulator = initialValue;

        for (Integer i : intList) {
            accumulator = op.apply(accumulator, i);
        }
        return accumulator;
    }

    public int accumulateWithInternalIteration(List<Integer> intList, Integer initalValue, BinaryOperator<Integer> op) {
        return intList.stream().reduce(initalValue, op);
    }

    public static void main(String[] args) {
        ReducePattern_3_2 reduce = new ReducePattern_3_2();

        System.out.println(reduce.accumulateWithExternalIteration(asList(1,2,3,4), 0, (x,y)->x+y));


        // asList(1,2,3,4).stream().reduce(0, (x,y)->x+y);
        System.out.println(reduce.accumulateWithInternalIteration(asList(1,2,3,4), 0, (x,y)->x+y));

    }
}
