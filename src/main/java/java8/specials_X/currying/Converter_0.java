package java8.specials_X.currying;

import java.util.function.BiFunction;

/**
 * Converter which returns Double-result-value and always requires to set conversion rate
 */
public class Converter_0 implements BiFunction<Double,Double, Double> {
  @Override
  public Double apply(Double conversionRate, Double value) {
    return conversionRate*value;
  }
}
