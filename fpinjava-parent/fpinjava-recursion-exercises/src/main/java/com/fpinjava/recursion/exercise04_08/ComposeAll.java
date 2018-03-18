package com.fpinjava.recursion.exercise04_08;

import java.util.List;

import com.fpinjava.common.Function;

import static com.fpinjava.common.CollectionUtilities.foldLeft;
import static com.fpinjava.common.CollectionUtilities.foldRight;
import static com.fpinjava.common.CollectionUtilities.reverse;
import static com.fpinjava.common.Function.identity;


public class ComposeAll {

  static <T> Function<T, T> composeAllViaFoldLeft(List<Function<T, T>> list) {
      return foldLeft(reverse(list), identity(), f1 -> f2 -> f1.andThen(f2));
  }

  static <T> Function<T, T> composeAllViaFoldRight(List<Function<T, T>> list) {
    return foldRight(reverse(list), identity(), f1 -> f2 -> f1.andThen(f2));
  }

  static <T> Function<T, T> andThenAllViaFoldLeft(List<Function<T, T>> list) {
    return foldLeft(list, identity(), f1 -> f2 -> f1.andThen(f2));
  }

  static <T> Function<T, T> andThenAllViaFoldRight(List<Function<T, T>> list) {
    return foldRight(list, identity(), f1 -> f2 -> f1.andThen(f2));
  }
}
