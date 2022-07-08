package edu.training;


import java.util.List;
import java.util.function.*;

public class LambdaExpression {

    /**
     * Implement the predicate that check if input string length is higher than 5
     *
     * @return Predicate that return
     * - false if string length is 5 or less
     * - true if string length is 6 of more
     */
    public static Predicate<String> stringLengthPredicate() {
        return s -> s.length() > 5;
    }

    /**
     * Implement the predicate that check if input number is even
     *
     * @return Predicate that return
     * - false if number is odd
     * - true if number is even
     */
    public static IntPredicate evenNumberPredicate() {
        return i -> i % 2 == 0;
    }

    /**
     * Implement function that take a string and return string length
     *
     * @return String to Integer function
     */
    public static Function<String, Integer> stringLengthFunction() {
        return s -> s.length();
    }

    /**
     * Implement function that take an integer and return string value of integer e.q. 123 -> "123"
     *
     * @return Integer to string function
     */
    public static Function<Integer, String> toStringFunction() {
        return String::valueOf;
    }

    /**
     * Implement supplier that returns string "Java"
     *
     * @return Supplier
     */
    public static Supplier<String> javaSupplier() {
        return () -> "Java";
    }

    /**
     * Implement supplier that returns ArrayList of Strings with 3 elements "one", "two", "three"
     *
     * @return Supplier
     */
    public static Supplier<List<String>> collectionSupplier() {
        return () -> List.of("one", "two", "three");
    }

    /**
     * Implement UnaryOperator that returns square of input value
     *
     * @return IntUnaryOperator
     */
    public static IntUnaryOperator intSquare() {
        return i -> i * i;
    }

    /**
     * Implement BinaryOperator that returns multiplication of two input values
     *
     * @return IntBinaryOperator
     */
    public static IntBinaryOperator multiplication() {
        return (x, y) -> x * y;
    }

    /**
     * Implement BiPredicate that check if the result of multiplication of two Integers is even number
     *
     * @return BiPredicate
     */
    public static BiPredicate<Integer, Integer> multiplicationResultIsEven() {
        return (x, y) -> (x * y) % 2 == 0;
    }
}
