package com.flat.odessa.level_7.task_3;

/**
 * https://www.codewars.com/kata/5a0d38c9697598b67a000041
 */
public class SetBits {

  public long eliminateSetBits(String number) {
    String s = number.replaceAll("0", "");
    if (s.isEmpty()) {
      return 0;
    }
    return Long.valueOf(s, 2);
  }
}
