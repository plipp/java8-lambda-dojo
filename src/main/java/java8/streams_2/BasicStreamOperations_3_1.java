package java8.streams_2;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class BasicStreamOperations_3_1 {
    public static void main(String[] args) {
        // eager collect
        // Stream<T> -collect--> List<T>
        List<String> asList = Stream.of("1", "2", "3").collect(toList());
        // System.out.println(asList);

        // lazy map
        // Stream<T>:n -map--> Stream<R>:n
        List<Integer> mappedInts = Stream.of("1", "2", "3").map(s -> Integer.parseInt(s)).collect(toList());
        // System.out.println(mappedInts);


        // lazy filter with Predicate<T>
        // Stream<T>:n -map--> Stream<T>:k, k<=n
        List<Integer> evenInts = Stream.of(1, 2, 3).filter(i -> i%2==0).collect(toList());
        // System.out.println(evenInts);


        // lazy flatMap
        //
        // def:  flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        //       T -> Stream<R>
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(listOfNumbers -> {
                    // TODO: System.out.println("listOfNumbers:" + listOfNumbers);
                    return listOfNumbers.stream();
                }).collect(toList());
        // System.out.println(together);


        // lazy map + flatMap
        //
        // def:  flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        //       T -> Stream<R>
        // here: T=String, R=Integer
        //       Integer::parseInt == s -> Integer.parseInt(s)
        List<Integer> together2 = Stream.of(asList("1", "2"), asList("3", "4"))
                .flatMap(listOfNumbersAsString -> listOfNumbersAsString.stream().map(Integer::parseInt))
                .collect(toList());
        // System.out.println(together2);

    }
}
