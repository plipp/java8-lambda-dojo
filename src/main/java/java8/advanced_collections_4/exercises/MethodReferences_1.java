package java8.advanced_collections_4.exercises;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

// Instructions:  rewrite using method references:
public class MethodReferences_1 {
  public static List<String> toUpperWithMethodReference(final String[] strings) {
    return Stream.of(strings)
      .map(string -> string.toUpperCase()) /* use method reference (->IDEA) */
      .collect(toList());
  }

  public static List<Integer> concat(Integer[] values1, Integer[] values2) {
    return Stream.of(asList(values1), asList(values2))
      .flatMap(numbers -> numbers.stream())
      .collect(toList());
  }
}
