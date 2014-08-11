package java8.specials_X.currying;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class Converter_2Test {
  public static final double CONVERSION_RATE = 1.5;

  @Test
  public void converts1() throws Exception {
    // f(conversionRate,value) = (g(conversionRate))(value)
    assertEquals(4.5, new Converter_2().curry1(CONVERSION_RATE).apply(3.0),0.0001);
  }

  @Test
  public void converts() throws Exception {
    Function<Double, Double> converterFunction = new Converter_2().curry1(CONVERSION_RATE);
    assertEquals(4.5, converterFunction.apply(3.0),0.0001);
    assertEquals(6.0, converterFunction.apply(4.0),0.0001);
    assertEquals(7.5, converterFunction.apply(5.0),0.0001);
  }
}