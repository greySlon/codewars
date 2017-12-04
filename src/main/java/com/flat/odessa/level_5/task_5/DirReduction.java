package com.flat.odessa.level_5.task_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/550f22f4d758534c1100025a
 */
public class DirReduction {

  static int WEST = 0b10;
  static int EAST = 0b11;
  static int SOUTH = 0b00;
  static int NORTH = 0b01;
  static int OPOSITE = 0b01;

  public static String[] dirReduc(String[] arr) {
    LinkedList<String> strings = new LinkedList<String>(Arrays.asList(arr));
    ListIterator<String> iter = strings.listIterator();
    String first = "";
    if (iter.hasNext()) {
      first = iter.next();
    }
    while (iter.hasNext()) {
      String next = iter.next();
      if (checkOposit(first, next)) {
        iter.remove();
        iter.previous();
        iter.remove();
        if (iter.hasPrevious()) {
          first = iter.previous();
        } else if (iter.hasNext()) {
          first = iter.next();
        }
      } else {
        first = next;
      }
    }

    return strings.stream()
        .filter(el -> !el.isEmpty())
        .collect(Collectors.toList())
        .toArray(new String[0]);
  }

  private static boolean checkOposit(String before, String current) {
    int bef = convertToBinary(before);
    int nxt = convertToBinary(current);
    boolean b = OPOSITE == (bef ^ nxt);
    return b;
  }

  private static int convertToBinary(String direction) {
    switch (direction) {
      case "WEST":
        return WEST;
      case "EAST":
        return EAST;
      case "SOUTH":
        return SOUTH;
      default:
        return NORTH;
    }
  }

  public static void main(String[] args) {
    String[] strings = dirReduc(
        new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
    System.out.println(strings);
  }
}