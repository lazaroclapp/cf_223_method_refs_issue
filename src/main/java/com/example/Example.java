package com.example;

import com.google.common.collect.ImmutableList;
import io.reactivex.Observable;
import java.util.List;
import java.util.function.Function;


class Example {

  Example() {
  }

  static final class A {

    public A() {
    }

    public Object foo(Object o) {
      return o;
    }
  }

  private Observable<List<Function<Object,Object>>> test(A a) {
    return Observable.just(ImmutableList.of(a::foo));
  }

}

