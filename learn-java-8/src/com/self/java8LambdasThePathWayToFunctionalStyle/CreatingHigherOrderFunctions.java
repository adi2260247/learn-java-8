package com.self.java8LambdasThePathWayToFunctionalStyle;
import java.util.*;
import java.util.function.*;

public class CreatingHigherOrderFunctions {
  public static int totalValues(List<Integer> values, Predicate<Integer> selector) {
    return values.stream()
                 .filter(selector)
                 .mapToInt(e -> e)
                 .sum();
  }
  
  public static void main(String[] args) {
    List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    System.out.println(totalValues(values, e -> true));
    System.out.println(totalValues(values, CreatingHigherOrderFunctions::isEven));
    System.out.println(totalValues(values, CreatingHigherOrderFunctions::isOdd));
    System.out.println(totalValues(values, e -> e > 3));
  }
  
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static boolean isOdd(int number) {
    return number % 2 != 0;
  }
}

