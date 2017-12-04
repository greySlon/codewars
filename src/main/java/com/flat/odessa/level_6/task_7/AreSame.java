package com.flat.odessa.level_6.task_7;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/are-they-the-same/java
 */
public class AreSame {

  public static boolean comp(int[] a, int[] b) {
    if (a == null || b == null || a.length != b.length) {
      return false;
    }
    int[] intsA = Arrays.stream(a).map(el -> Math.abs(el)).sorted().toArray();
    int[] intsB = Arrays.stream(b).map(el -> Math.abs(el)).sorted().toArray();
    for (int i = 0; i < intsA.length; i++) {
      if (intsA[i] * intsA[i] != intsB[i]) {
        return false;
      }
    }
    return true;
  }
}
