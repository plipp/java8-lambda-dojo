package java8.euler_99;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProblemsTest {

  @Test
  public void sumOfMultipliesOf3Or5UpTo10() throws Exception {
    assertThat(Problems.sumOfMultipliesOf3Or5(10), is(23));
  }

  @Test @Ignore("Find the solution")
  public void sumOfMultipliesOf3Or5UpTo1000() throws Exception {
    assertThat(Problems.sumOfMultipliesOf3Or5(1000), is(1000));
  }

  @Test
  public void smallestMultipleWithMaxDiv10() throws Exception {
    assertThat(Problems.smallestMultiple(10), is(2520L));
  }

  @Test @Ignore("Find the solution")
  public void smallestMultipleWithMaxDiv20() throws Exception {
    assertThat(Problems.smallestMultiple(20), is(10000));
  }

  @Test
  public void sumSquareDifferenceUpTo10() throws Exception {
    assertThat(Problems.sumSquareDifference(10), is(2640));
  }

  @Test @Ignore("Find the solution")
  public void sumSquareDifferenceUpTo100() throws Exception {
    assertThat(Problems.sumSquareDifference(100), is(100000));
  }

  @Test
  public void digitSumFor2Power15() throws Exception {
    assertThat(Problems.powerDigitSum(15), is(26));
  }

  @Test @Ignore("Find the solution")
  public void digitSumFor2Power1000() throws Exception {
    assertThat(Problems.powerDigitSum(1000), is(1000));
  }

  @Test
  public void factorialDigitSumOf10() throws Exception {
    assertThat(Problems.factorialDigitSum(10), is(27));
  }

  @Test  @Ignore("Find the solution")
  public void factorialDigitSumOf100() throws Exception {
    assertThat(Problems.factorialDigitSum(100), is(1000));
  }
}