package com.flat.odessa.level_5.task_3;

class Solution {

  static String toCamelCase(String s) {
    if (s.isEmpty()) {
      return s;
    }
    String firstLetter = s.substring(0, 1);
    StringBuilder sb = new StringBuilder();
    for (String str : s.split("[_-]")) {
      sb.append(str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase());
    }

    return firstLetter + sb.toString().substring(1, sb.length());
  }
}
