# Currying in Java8

insprired by [Higher-order Functions, Functions Composition, and Currying in Java 8](http://java.dzone.com/articles/higher-order-functions)

## Basic Idea
    f(conversionRate,value) = (g(conversionRate))(value) 

### Sample    

    new Converter_0().apply(CONVERSION_RATE,3.0)
    =
    new Converter_1_1().apply(CONVERSION_RATE).apply(3.0)
    