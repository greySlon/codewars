package com.flat.odessa.level_7.task_1;

import static org.junit.Assert.assertEquals;

import com.flat.odessa.level_7.task_1.Cat;
import com.flat.odessa.level_7.task_1.CatWeightComparator;

import org.junit.Test;

import java.util.Arrays;

public class CatComparatorTest {

  @Test
  public void testSimpleCase() {
    Cat[] cats = new Cat[2];
    cats[0] = new Cat("Lily", 30);
    cats[1] = new Cat("Drake", 15);

    Arrays.sort(cats, new CatWeightComparator());

    assertEquals("Incorrect cat found at index 0", "Drake", cats[0].name);
    assertEquals("Incorrect cat found at index 1", "Lily", cats[1].name);
  }
}