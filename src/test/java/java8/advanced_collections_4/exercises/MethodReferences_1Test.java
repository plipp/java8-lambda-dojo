package java8.advanced_collections_4.exercises;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class MethodReferences_1Test {
  @Test
  public void uppercases() {
    assertEquals(asList("A", "B", "HELLO"), MethodReferences_1.toUpperWithMethodReference(new String[]{"a", "B", "hElLo"}));
  }

  @Test
  public void concatesIntegerArrays() {
    assertEquals(asList(1, 2, 3, 4), MethodReferences_1.concat(new Integer[]{1,2}, new Integer[]{3,4}));
  }
}