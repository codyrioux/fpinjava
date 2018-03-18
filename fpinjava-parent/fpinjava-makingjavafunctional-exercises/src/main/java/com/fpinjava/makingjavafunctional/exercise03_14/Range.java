package com.fpinjava.makingjavafunctional.exercise03_14;

import java.util.Collections;
import java.util.List;

import static com.fpinjava.makingjavafunctional.exercise03_13.CollectionUtilities.prepend;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
      return end <= start ? Collections.emptyList() :
              prepend(start, range(start + 1, end));

  }
}
