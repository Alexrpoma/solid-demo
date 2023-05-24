package com.demo;

public record Triangle(int base, int height) implements Shape {
  @Override
  public double area() {
    return (double) (base * height) / 2;
  }
}