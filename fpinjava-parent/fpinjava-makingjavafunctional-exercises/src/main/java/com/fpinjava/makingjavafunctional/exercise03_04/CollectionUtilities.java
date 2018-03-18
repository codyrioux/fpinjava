package com.fpinjava.makingjavafunctional.exercise03_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionUtilities {

  public static <T> List<T > list() {
    return Collections.emptyList();
  }

  public static <T> List<T > list(T t) {
    return Collections.singletonList(t);
  }

  public static <T> List<T > list(List<T> ts) {
    return Collections.unmodifiableList(new ArrayList<>(ts));
  }

  @SafeVarargs
  public static <T> List<T > list(T... t) {
    return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t, t.length)));
  }

  public static <T> T head(List<T> list) {
    if (list.size() < 1) {
      throw new IllegalStateException("The list passed to head must contain at least one element.");
    }
    return list.get(0);
  }

  private static <T> List<T > copy(List<T> ts) {
      return Collections.unmodifiableList(new ArrayList<>(ts));
  }

  public static <T> List<T> tail(List<T> list) {
    if (list.size() < 1) {
      throw new IllegalStateException("The list passed to tail must contain at least one element.");
    }
      return Collections.unmodifiableList(copy(list).subList(1, list.size()));
  }
}
