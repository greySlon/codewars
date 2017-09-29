package com.flat.odessa.level_8.task_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CockroachSpeedTests {

  @Test
  public void basicTests() throws Exception {
    Cockroach cockroach = new Cockroach();
    assertEquals(30, cockroach.cockroachSpeed(1.08));
    assertEquals(30, cockroach.cockroachSpeed(1.09));
    assertEquals(0, cockroach.cockroachSpeed(0));
  }
}