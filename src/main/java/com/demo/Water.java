package com.demo;

public class Water implements Shape{

  //This method does not apply to this class
  @Override
  public double area() {
    throw new RuntimeException("Oops! we cannot calculate water area!");
  }
}
