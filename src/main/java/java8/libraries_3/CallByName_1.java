package java8.libraries_3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CallByName_1 {
  public static final Logger LOGGER = Logger.getLogger("test");

  public static void debugWithCallByValue() {
    LOGGER.info("This message is always constructed:" + calculateValue("CBV1"));
  }

  public static void debugWithCallByValue2() {
    if (LOGGER.isLoggable(Level.INFO)) {
      LOGGER.info("This message is only constructed in Levels >= INFO:" + calculateValue("CBV2"));
    }
  }

  public static void debugWithCallByName() {
    LOGGER.info(() -> "This message is only constructed in Levels >= INFO:" + calculateValue("CBN")); // info(Supplier<String>)
  }

  public static void main(String[] args) {
    LOGGER.setLevel(Level.WARNING);

    debugWithCallByValue();
    debugWithCallByValue2();
    debugWithCallByName();
  }

  private static String calculateValue(String caller) {
    System.out.println("calculateValue: " + caller);
    return "gained with some expensive calculations";
  }
}
