package com.fpinjava.recursion.exercise04_05;

import java.util.List;

import com.fpinjava.common.Function;
import com.fpinjava.common.TailCall;

import static com.fpinjava.common.CollectionUtilities.*;
import static com.fpinjava.common.TailCall.*;

public class FoldRight {

  public static <T, U> U foldRight(List<T> ts, U identity, Function<T, Function<U, U>> f) {
      return foldRight_(reverse(ts), identity, f).eval();
  }

  private static <T, U> TailCall<U> foldRight_(List<T> ts, U accumulator, Function<T, Function<U, U>> f) {
    return ts.isEmpty() ? ret(accumulator)
            : sus(() -> foldRight_(tail(ts), f.apply(head(ts)).apply(accumulator), f));
  }
}
