package java8.specials_X.currying;

/**
 * Curryable version
 */
public class Converter_2 implements BiFunctionWithCurrying<Double, Double, Double>{
  @Override
  public Double apply(Double conversionRate, Double value) {
    return conversionRate*value;
  }
}
