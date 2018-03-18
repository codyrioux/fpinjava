package com.fpinjava.makingjavafunctional.exercise03_11;

import com.fpinjava.makingjavafunctional.exercise03_09.CollectionUtilities;

import java.util.ArrayList;
import java.util.List;


public class Range {

  public static List<Integer> range(int start, int end) {
      List<Integer> result = new ArrayList<>();
      for (int i = start; i < end; ++i) {
          result = CollectionUtilities.append(result, i);
      }
      return result;
  }
}
