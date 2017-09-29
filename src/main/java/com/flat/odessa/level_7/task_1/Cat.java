package com.flat.odessa.level_7.task_1;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

  public String name;
  public double weight;

  public Cat(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public int compareTo(Cat c) {
    return name.compareTo(c.name);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || o.getClass() != getClass()) {
      return false;
    }
    Cat anotherCat = (Cat) o;
    return Objects.equals(name, anotherCat.name);
  }
}
