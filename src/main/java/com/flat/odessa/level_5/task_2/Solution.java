package com.flat.odessa.level_5.task_2;

public class Solution {

  public static int zeros(int n) {
    int zeros = 0;
    long i = 1;
    long fact = 1;
    while (i <= n) {
      fact *= i++;
      while (fact % 10 == 0) {
        fact /= 10;
        zeros++;
      }
      if (fact > 1000000) {
        fact %= 1000000;
      }
    }
    return zeros;
  }
}