package com.flat.odessa.level_7.task_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetBitsTest {

  SetBits sb = new SetBits();

  @Test
  public void sampleTests() {
    assertEquals(sb.eliminateSetBits("11010101010101"), 255);
    assertEquals(sb.eliminateSetBits("111"), 7);
    assertEquals(sb.eliminateSetBits("1000000"), 1);
  }
}