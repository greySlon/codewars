package com.flat.odessa.level_6.task_4;

public class CalculateRotation {

  static int shiftedDiffBestPractice(String first, String second) {
    if (first.length() != second.length()) {
      return -1;
    }
    return (second + second).indexOf(first);
  }

  static int shiftedDiff(String first, String second) {
    int length = first.length();
    if (length != second.length()) {
      return -1;
    }
    char[] charsFirst = first.toCharArray();
    char[] charsSecond = second.toCharArray();
    if (isEquivalent(charsFirst, charsSecond)) {
      return 0;
    }
    for (int i = 0; i < length - 1; i++) {
      shift(charsFirst);
      if (isEquivalent(charsFirst, charsSecond)) {
        return length - 1 - i;
      }
    }
    return -1;
  }

  private static void shift(char[] chars) {
    char tmp = chars[0];
    for (int i = 1; i < chars.length; i++) {
      chars[i - 1] = chars[i];
    }
    chars[chars.length - 1] = tmp;
  }

  private static boolean isEquivalent(char[] first, char[] second) {
    if (first.length != second.length) {
      return false;
    }
    for (int i = 0; i < first.length; i++) {
      if (first[i] != second[i]) {
        return false;
      }
    }
    return true;
  }
}
