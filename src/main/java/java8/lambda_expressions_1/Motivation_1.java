package java8.lambda_expressions_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Motivation_1 {
    private JButton button = new JButton();

    public void classicWithAnonymousLocalClassOfInterface() {
        String data="the data";
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(data);
            }
        });
        // DECOMMENT => Doesn't compile:
        // data = "changed"; // => data: de facto 'final'

    }

    public void withLambdaExpression() {
        String data="the data2";

        button.addActionListener(e -> System.out.println(data));
        // DECOMMENT => Doesn't compile:
        // data = "changed"; // => data: de facto 'final'
    }

    public void withLambdaExpression2() {
        String data="the data2";

        ActionListener actionListener = e -> System.out.println(data);
        button.addActionListener(actionListener);
        // DECOMMENT => Doesn't compile:
        // data = "changed"; // => data: de facto 'final'
    }

    // TODO: show idea-refactoring to lambda!

    public static void main(String[] args) {
        Motivation_1 lambdaSample = new Motivation_1();

        lambdaSample.classicWithAnonymousLocalClassOfInterface();
        lambdaSample.withLambdaExpression();
        lambdaSample.withLambdaExpression2();
    }
}
