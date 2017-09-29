package com.flat.odessa.level_6.task_3;

import java.util.ArrayList;
import java.util.List;

public class Validate {

  public static boolean validate(String n) {
    List<Integer> numbers = getNumberList(n);
    doubleElements(numbers, n.length() % 2 == 0);

    int sum = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    return sum % 10 == 0;
  }

  private static void doubleElements(List<Integer> numbers, boolean even) {
    for (int i = 0; i < numbers.size(); i++) {
      if ((even && i % 2 == 0) || (!even && i % 2 != 0)) {
        int element = numbers.get(i) * 2;
        if (element > 9) {
          element = element - 9;
        }
        numbers.set(i, element);
      }
    }
  }

  private static List<Integer> getNumberList(String n) {
    List<Integer> numbers = new ArrayList<>();
    n = n.replaceAll("\\s", "");
    for (int i = 0; i < n.length(); i++) {
      numbers.add(Integer.parseInt(n.substring(i, i + 1)));
    }
    return numbers;
  }
}