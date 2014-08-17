package java8.advanced_collections_4.exercises;

import java8.exercises_0.Exercises;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

// TODO: Not now!
// Implement Collectors.groupingBy as a custom collector.
//
// You don’t need to provide a downstream collector, so just implementing the simplest variant is
// fine.
//
// If you look at the JDK source code, you’re cheating!
//
// Hint:
// You might want to start with
//     public class GroupingBy<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>>.
// This is an advanced exercise, so you might want to attempt it last.

public class GroupingBy_2_3<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {

    private final Function<? super T, ? extends K> classifier;

    public GroupingBy_2_3(Function<? super T, ? extends K> classifier) {
        this.classifier = classifier;
    }

    @Override
    public Supplier<Map<K, List<T>>> supplier() {
        return Exercises.replaceThisWithSolution();
    }

    @Override
    public BiConsumer<Map<K, List<T>>, T> accumulator() {
        return Exercises.replaceThisWithSolution();
    }

    @Override
    public BinaryOperator<Map<K, List<T>>> combiner() {
        return Exercises.replaceThisWithSolution();
    }

    @Override
    public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
        return Exercises.replaceThisWithSolution();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Exercises.replaceThisWithSolution();
    }

}
