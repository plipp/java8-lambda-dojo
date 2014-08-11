package java8.specials_X.currying;

import org.junit.Test;

import static org.junit.Assert.*;

public class Converter_0Test {

  public static final double CONVERSION_RATE = 1.5;

  @Test
  public void converts() throws Exception {
    assertEquals(4.5,new Converter_0().apply(CONVERSION_RATE,3.0),0.0001);
    assertEquals(6.0,new Converter_0().apply(CONVERSION_RATE,4.0),0.0001);
    assertEquals(7.5,new Converter_0().apply(CONVERSION_RATE,5.0),0.0001);
  }
}