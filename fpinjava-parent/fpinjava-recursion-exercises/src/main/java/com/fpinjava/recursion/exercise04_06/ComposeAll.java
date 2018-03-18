package com.fpinjava.recursion.exercise04_06;

import java.util.List;

import com.fpinjava.common.Function;


public class ComposeAll {
    // I got a bit ahead of the book here, this is the solution to the next exercise.
    // This one was intended to be done with foldLeft.
  static <T> Function<T, T> composeAll(List<Function<T, T>> list) {
      return t -> {
          T y = t;
        for (Function<T, T> fn : list) {
          y = fn.apply(y);
        }
        return y;
      };
  }
}
