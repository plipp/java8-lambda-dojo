package java8.advanced_collections_4.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class GroupingBy_2_3Test {

    @Test
    public void stringsByLength() {
        GroupingBy_2_3<String, Integer> stringIntegerGroupingBy23 = new GroupingBy_2_3<>(String::length);
        Map<Integer,List<String>> results = Stream.of("a", "b", "cc", "dd")
                                                  .collect(stringIntegerGroupingBy23);

        System.out.println(results);

        assertEquals(2, results.size());
        assertEquals(asList("a", "b"), results.get(1));
        assertEquals(asList("cc", "dd"), results.get(2));
    }

}
