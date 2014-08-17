package java8.specials_X.currying;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface BiFunctionWithCurrying<T, U, R> extends BiFunction<T, U, R>{
  default Function<T,R> curry1 (U u) {
    return new Function<T, R>() {    // long version with Function
      @Override
      public R apply(T t) {
        return BiFunctionWithCurrying.this.apply(t,u);
      }
    };
  }

  default Function<U,R> curry2 (T t) {
    return u -> apply(t, u); // short version with lambda-expression
  }

  default <S> BiFunctionWithCurrying<S,U,R> compose (Function<S, ? extends T> before) {
    return (s, u) -> this.apply(before.apply(s), u);
  }
}
