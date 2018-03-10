package com.flat.odessa.level_3.task_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

  @Test
  public void simpleLiteral() {
    assertEquals("simple literal", new Double(127), Calculator.evaluate("127"));
  }

  @Test
  public void subtractionAndAddition() {
    assertEquals("addition", new Double(5), Calculator.evaluate("2 + 3"));
    assertEquals("subtraction", new Double(-5), Calculator.evaluate("2 - 3 - 4"));
  }

  @Test
  public void divisionAndMultiplication() {
    assertEquals("mixed division and multiplication", new Double(10),
        Calculator.evaluate("10 * 5 / 5"));
  }

  @Test
  public void allMixed() {
    assertEquals("mixed", new Double(13), Calculator.evaluate("2 / 2 + 3 * 4"));
  }

  @Test
  public void floats() {
    assertEquals("floats 1", new Double(0), Calculator.evaluate("7.7 - 3.3 - 4.4"));
  }
}