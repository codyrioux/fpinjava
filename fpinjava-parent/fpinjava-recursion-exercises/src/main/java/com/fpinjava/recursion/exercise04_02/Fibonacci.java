package com.fpinjava.recursion.exercise04_02;

import com.fpinjava.common.TailCall;

import java.math.BigInteger;


public class Fibonacci {

  public static BigInteger fib(int x)
  {
      return fib_(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x)).eval();
  }

  public static TailCall<BigInteger> fib_(BigInteger acc0, BigInteger acc1, BigInteger x) {
      if (x.equals(BigInteger.ZERO)) {
        return TailCall.ret(BigInteger.ZERO);
    } else if (x.equals(BigInteger.ONE)) {
        return TailCall.ret(acc0.add(acc1));
    } else {
          return TailCall.sus(() -> fib_(acc1, acc0.add(acc1), x.subtract(BigInteger.ONE)));
      }
  }
}
