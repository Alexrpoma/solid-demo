package com.demo;

public record Square(int length) implements Shape, ThreeDShape {
  @Override
  public double area() {
    return Math.pow(length, 2);
  }

  @Override
  public double volume() {
    return Math.pow(length, 3);
  }
}
