package java8.streams_2.exercises;

import java8.testdata_0.SampleData;
import org.junit.Test;

import java.util.Arrays;

import static java8.streams_2.exercises.Iteration_2.countBandMembersExternal;
import static java8.streams_2.exercises.Iteration_2.countBandMembersInternal;
import static org.junit.Assert.assertEquals;

public class Iteration_2Test {
  @Test
  public void external() {
    assertEquals(4, countBandMembersExternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
  }

  @Test
  public void internal() {
    assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles)));
  }
}