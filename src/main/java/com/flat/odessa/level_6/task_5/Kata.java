package com.flat.odessa.level_6.task_5;

public class Kata {

  public static String stringify(Node list) {
    if (list == null) {
      return "null";
    }
    StringBuilder sb = new StringBuilder();
    do {
      sb.append(list.getData()).append(" -> ");
      list = list.getNext();
    } while (list != null);
    sb.append("null");
    return sb.toString();
  }
}