package java8.specials_X.currying;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class ComposedConverter_3Test {
  public static final double CONVERSION_RATE = 9/5.0;

  @Test
  public void calculatesFahrenheit() throws Exception {
    // f(conversionRate,value) = (g(conversionRate))(value)
    // f = ((9/5 * c) + 32)
    Double c = 15.0;
    assertEquals(59.0, new Converter_2().curry1(CONVERSION_RATE).andThen(value -> value + 32).apply(c),0.0001);
  }

  @Test
  public void calculatesCelsius() throws Exception {
    // f(conversionRate,value) = (g(conversionRate))(value)
    // c = (f - 32)*5/9
    Double f = 50.0;
    assertEquals(10.0, new Converter_2().curry1(1/CONVERSION_RATE).compose((Double f1) -> f1 - 32).apply(f),0.0001);
  }


}