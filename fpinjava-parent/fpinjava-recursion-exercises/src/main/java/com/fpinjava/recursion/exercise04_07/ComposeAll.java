  package com.fpinjava.recursion.exercise04_07;

import java.util.List;

import com.fpinjava.common.Function;

import static com.fpinjava.common.CollectionUtilities.foldLeft;
import static com.fpinjava.common.CollectionUtilities.foldRight;
import static com.fpinjava.common.Function.identity;

  public class ComposeAll {

  public static <T> Function<T, T> composeAll(List<Function<T, T>> list) {
    return t -> {
      T y = t;
      for (Function<T, T> fn : list) {
        y = fn.apply(y);
      }
      return y;
    };
  }
  public static <T> Function<T, T> composeAllViaFoldLeft(List<Function<T, T>> list) {
      return foldLeft(list, identity(), f1 -> f2 -> f1.andThen(f2));
  }

  public static <T> Function<T, T> composeAllViaFoldRight(List<Function<T, T>> list) {
      return foldRight(list, identity(), f1 -> f2 -> f1.andThen(f2));
  }
}
