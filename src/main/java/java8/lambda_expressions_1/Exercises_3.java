package java8.lambda_expressions_1;

import javax.swing.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Exercises_3 {
    public void whichDefinitionIsValid() {
        // 1
        // BinaryOperator add = (x,y) -> x+y;

        // 2
        // Function<Long,Long> f1 =  x -> x+1;

        // 3
        // Function<Long,Long> f2 =  x -> (x+1==3);

        // 4
        // Function<Long,Long> f3 =  (x,y) -> x+1;
    }

    public void doesTypeInferenceWork() {
        // 1
        //        JButton button = new JButton();
        //        button.addActionListener(event ->
        //                System.out.println(event.getActionCommand()));

        // 2
        // Runnable helloWorld = () -> System.out.println("hello world");

    }
}
