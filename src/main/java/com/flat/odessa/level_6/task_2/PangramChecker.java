package com.flat.odessa.level_6.task_2;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

  public boolean check(String sentence) {
    sentence = sentence.replaceAll("[^A-Za-z]+", "").toLowerCase();
    Set<Character> characters = new HashSet<>();
    for (char c : sentence.toCharArray()) {
      characters.add(c);
    }
    return characters.size() == 26;
  }
}