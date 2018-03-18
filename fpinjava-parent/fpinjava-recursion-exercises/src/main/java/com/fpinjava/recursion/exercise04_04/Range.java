package com.fpinjava.recursion.exercise04_04;

import com.fpinjava.common.TailCall;

import static com.fpinjava.common.CollectionUtilities.append;
import static com.fpinjava.common.List.list;
import static com.fpinjava.common.TailCall.*;

import java.util.ArrayList;
import java.util.List;


public class Range {

  public static List<Integer> range(Integer start, Integer end) {
      return range_(new ArrayList<>(), start, end).eval();
  }

  private static TailCall<List<Integer>> range_(List<Integer> is, Integer start, Integer end) {
      return end <= start ? ret(is)
              : sus(() -> range_(append(is, start), start + 1, end));
  }
}
