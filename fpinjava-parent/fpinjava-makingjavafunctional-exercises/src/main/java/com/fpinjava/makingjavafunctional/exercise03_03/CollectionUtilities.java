package com.fpinjava.makingjavafunctional.exercise03_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionUtilities {

  public static <T> List<T > list() {
      return Collections.unmodifiableList(Collections.EMPTY_LIST);
  }

  public static <T> List<T > list(T t) {
    return Collections.unmodifiableList(Collections.singletonList(t));
  }
  public static <T> List<T > list(List<T> ts) {
      return Collections.unmodifiableList(new ArrayList<>(ts));
  }

  @SafeVarargs
  public static <T> List<T > list(T... t) {
    return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
  }
}
