package java8.specials_X.currying;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Converter which returns Function which then returns actual Double-result-value (using lambdas)
 */
public class Converter_1_2 implements Function<Double,Function<Double,Double>> {
  @Override
  public Function<Double, Double> apply(Double conversionRate) {
    return value -> conversionRate*value; // Function == Closure, that keeps 'conversionRate'
  }
}
