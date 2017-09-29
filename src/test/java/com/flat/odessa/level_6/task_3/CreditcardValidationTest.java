package com.flat.odessa.level_6.task_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CreditcardValidationTest {

  @Test
  public void test891() {
    assertEquals(false, Validate.validate("891"));
  }

  @Test
  public void test123() {
    assertEquals(false, Validate.validate("123"));
  }

  @Test
  public void test1230() {
    assertEquals(true, Validate.validate("1230"));
  }
}