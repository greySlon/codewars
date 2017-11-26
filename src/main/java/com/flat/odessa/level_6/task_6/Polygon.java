package com.flat.odessa.level_6.task_6;

import static java.lang.StrictMath.tan;
import static java.lang.StrictMath.toRadians;

/**
 * https://www.codewars.com/kata/circles-in-polygons
 */
public class Polygon {

  int sides;
  int sideLength;

  public Polygon(int sides, int sideLength) {
    this.sides = sides;
    this.sideLength = sideLength;
  }

  public double circleDiameter() {
    return sideLength / (tan(toRadians(360) / (2 * sides)));
  }
}