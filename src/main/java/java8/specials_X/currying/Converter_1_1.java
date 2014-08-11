package java8.specials_X.currying;

import java.util.function.Function;

/**
 * Converter which returns Function which then returns actual Double-result-value
 */
public class Converter_1_1 implements Function<Double,Function<Double,Double>> {
  @Override
  public Function<Double, Double> apply(Double conversionRate) {
    return new ConverterFunction(conversionRate);
  }

  // Closure: keeps 'conversionRate'
  private static class ConverterFunction implements Function<Double, Double> {
    private final Double conversionRate;

    public ConverterFunction(Double conversionRate) {
      this.conversionRate = conversionRate;
    }

    @Override
    public Double apply(Double value) {
      return conversionRate*value;
    }
  }
}
