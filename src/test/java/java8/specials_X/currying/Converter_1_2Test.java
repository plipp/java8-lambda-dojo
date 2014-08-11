package java8.specials_X.currying;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class Converter_1_2Test {
  public static final double CONVERSION_RATE = 1.5;

  @Test
  public void converts() throws Exception {
    Function<Double, Double> converterFunction = new Converter_1_2().apply(CONVERSION_RATE);
    assertEquals(4.5, converterFunction.apply(3.0),0.0001);
    assertEquals(6.0, converterFunction.apply(4.0),0.0001);
    assertEquals(7.5, converterFunction.apply(5.0),0.0001);
  }
}