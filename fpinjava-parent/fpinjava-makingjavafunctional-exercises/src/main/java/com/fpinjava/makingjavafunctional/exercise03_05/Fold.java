package com.fpinjava.makingjavafunctional.exercise03_05;

import com.fpinjava.common.Function;

import java.util.List;

public class Fold {

  public static Integer fold(List<Integer> is, Integer identity,
                             Function<Integer, Function<Integer, Integer>> f) {
      Integer accumulator = identity;
      for(Integer i : is) {
        accumulator = f.apply(accumulator).apply(i);
      }
      return accumulator;
  }
}
