package com.flat.odessa.level_6.task_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void exampleTests() {
    assertEquals(true, Solution.isAlt("amazon"));
    assertEquals(false, Solution.isAlt("apple"));
    assertEquals(true, Solution.isAlt("banana"));
  }
}