package com.flat.odessa.level_7.task_1;

import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {

  @Override
  public int compare(Cat o1, Cat o2) {
    return o1.weight < o2.weight
        ? -1
        : o1.weight > o2.weight
            ? 1
            : 0;
  }
}
