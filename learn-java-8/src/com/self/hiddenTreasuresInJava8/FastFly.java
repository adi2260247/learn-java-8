package com.self.hiddenTreasuresInJava8;
public interface FastFly extends Fly {
  default void takeOff() { System.out.println("FastFly::takeOff"); }
}