package com.flat.odessa.level_3.task_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {

  public static Double evaluate(String expression) {
    String[] arr = expression.split("\\s");
    ArrayList<Double> dataList = getDataList(arr);
    ArrayList<String> opList = getOpList(arr);
    countPriorityOperation(opList, dataList);
    countOperation(opList, dataList);
    return dataList.get(0);
  }

  private static void countOperation(ArrayList<String> opList, ArrayList<Double> dataList) {
    Iterator<String> iter = opList.iterator();
    int i = 0;
    while (iter.hasNext()) {
      String next = iter.next();

      if (next.equals("+")) {
        Double res = dataList.get(i) + dataList.get(i + 1);
        iter.remove();
        simplifyData(dataList, i, res);
        i--;
      } else if (next.equals("-")) {
        Double res = dataList.get(i) - dataList.get(i + 1);
        iter.remove();
        simplifyData(dataList, i, res);
        i--;
      }
      i++;
    }
  }

  private static ArrayList<String> getOpList(String[] arr) {
    ArrayList<String> strings = new ArrayList<>();
    for (int i = 1; i < arr.length; i += 2) {
      strings.add(arr[i]);
    }
    return strings;
  }

  private static ArrayList<Double> getDataList(String[] arr) {
    ArrayList<Double> doubles = new ArrayList<>();
    for (int i = 0; i < arr.length; i += 2) {
      doubles.add(Double.parseDouble(arr[i]));
    }
    return doubles;
  }

  private static void countPriorityOperation(ArrayList<String> oplist, ArrayList<Double> dataList) {
    Iterator<String> iter = oplist.iterator();
    int i = 0;
    while (iter.hasNext()) {
      String next = iter.next();

      if (next.equals("/")) {
        Double res = dataList.get(i) / dataList.get(i + 1);
        iter.remove();
        simplifyData(dataList, i, res);
        i--;
      } else if (next.equals("*")) {
        Double res = dataList.get(i) * dataList.get(i + 1);
        iter.remove();
        simplifyData(dataList, i, res);
        i--;
      }
      i++;
    }
  }

  private static void simplifyData(ArrayList<Double> dataList, int position, Double result) {
    dataList.remove(position);
    dataList.remove(position);
    dataList.add(position, result);
  }
}
