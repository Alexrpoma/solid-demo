package com.demo;

import java.util.List;

public class App {

  public static void main(String[] args) {
    IAreaCalculator areaCalculator = new AreaCalculator();
    Circle circle = new Circle(10);
    Square square = new Square(10);
    Triangle triangle = new Triangle(10,15);
    //Shape water = new Water(); // --> water violates the Liskov substitution principle. Modify the behaviour of the shape (father) class
    List<Shape> shapes = List.of(circle, square, triangle);
    TotalAreaShapesPrinter totalAreaShapesPrinter = new TotalAreaShapesPrinter(areaCalculator);
    totalAreaShapesPrinter.json(shapes);
    totalAreaShapesPrinter.csv(shapes);
  }
}
