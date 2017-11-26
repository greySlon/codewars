package com.flat.odessa.level_8.task_2;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/sort-my-textbooks/java
 */
public class Sorter {

  public static List<String> sort(List<String> textbooks) {
    return textbooks.stream()
        .sorted((o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()))
        .collect(Collectors.toList());
  }

}
