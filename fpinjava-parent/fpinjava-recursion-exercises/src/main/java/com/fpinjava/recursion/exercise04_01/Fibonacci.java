package com.fpinjava.recursion.exercise04_01;

import java.math.BigInteger;

public class Fibonacci {

  // TODO: Need to use two accumulators and a helper method.
  public static BigInteger fib(int x)
  {
      return fib_(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x));
  }

  private static BigInteger fib_(BigInteger acc0, BigInteger acc1, BigInteger x) {
      if (x.equals(BigInteger.ZERO)) {
        return BigInteger.ZERO;
      } else if (x.equals(BigInteger.ONE)) {
          return acc0.add(acc1);
      } else {
          return fib_(acc1, acc1.add(acc0), x.subtract(BigInteger.ONE));
      }
  }
}
