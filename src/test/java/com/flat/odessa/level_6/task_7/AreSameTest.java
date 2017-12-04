package com.flat.odessa.level_6.task_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AreSameTest {

  @Test
  public void comp() throws Exception {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(AreSame.comp(a, b), true);
  }
}