package java8.advanced_collections_4.exercises;

import java8.exercises_0.Exercises;
import java8.testdata_0.Artist;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

//  Find the artist with the longest name.
//
//  You should implement this using a Collector and the reduce higher-order function from Chapter 3.
//
//  Then compare the differences in your implementation: which was easier to write and which
//  was easier to read?
public class LongestName_2_1 {
  public static Artist byReduce(List<Artist> artists) {
    return Exercises.replaceThisWithSolution();
  }

  public static Artist byCollecting(List<Artist> artists) {
    return Exercises.replaceThisWithSolution();
  }

}
