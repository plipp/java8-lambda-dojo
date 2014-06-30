package java8.lambda_expressions_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces_2 {
    public static void main(String[] args) {

        ActionListener actionListener = e -> System.out.println("Hello");
        ActionListener actionListener2 = (ActionEvent e) -> System.out.println("Hello");

        // new java8 Interfaces
        // used e.g. in java.util.stream.Stream
        Consumer<ActionEvent> consumer = e -> System.out.println("Hello"); // ActionEvent => void
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y; // Integer + Integer => Integer
        Predicate<Integer> predicate = n -> n>3; // Integer => Boolean
        Function<Integer,String> function = i -> String.valueOf(i); // Integer => String

        // ...
        // Supplier<T> : void => T, factory method
        // ...

        ImAFunctionalInterface fctInterface = () -> System.out.println("again");
    }

    @FunctionalInterface  // ==> only 1 function-method
    interface ImAFunctionalInterface { // void => void
        public void doSomething();

        // @FunctionalInterface allows exactly 1 abstract method and guarantees that the Interface isn't enhanced accidentally
        // => The following line does not compile
        // public void doSomething2();

        // default methods are backward compatible => accepted
        default void doSomething3() {
            System.out.println("Im number 3");
        }
    }
}
