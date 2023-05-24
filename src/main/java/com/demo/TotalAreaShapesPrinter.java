package com.demo;

import java.util.List;

public class TotalAreaShapesPrinter {

  private final IAreaCalculator areaCalculator;  //Dependency inversion.

  public TotalAreaShapesPrinter(IAreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }

  public void json(List<Shape> shapes) {
    System.out.printf("{Total area shapes: %d}%n", areaCalculator.sum(shapes));
  }

  public void csv(List<Shape> shapes) {
    System.out.printf("Total_area_shapes,%d%n", areaCalculator.sum(shapes));
  }
}
