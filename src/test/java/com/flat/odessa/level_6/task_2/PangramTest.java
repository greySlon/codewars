package com.flat.odessa.level_6.task_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PangramTest {

  @Test
  public void test1() {
    String pangram1 = "The quick brown fox jumps over the lazy dog.";
    PangramChecker pc = new PangramChecker();
    assertEquals(true, pc.check(pangram1));
  }

  @Test
  public void test2() {
    String pangram2 = "You shall not pass!";
    PangramChecker pc = new PangramChecker();
    assertEquals(false, pc.check(pangram2));
  }
  @Test
  public void test3() {
    String pangram2 = "qw<ertyuio, pa  sdfghjk'lzxcvbnm'\"?! .";
    PangramChecker pc = new PangramChecker();
    assertEquals(true, pc.check(pangram2));
  }
}