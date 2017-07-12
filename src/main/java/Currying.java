import static org.junit.Assert.assertEquals;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Function3;

public class Currying {
  public static void main(String[] args) {
    Function3<Integer, Integer, Integer, Integer> sumA = (a, b, c) -> a + b + c;
    Function2<Integer, Integer, Integer> addA2 = sumA.apply(2);

    assertEquals(addA2.apply(4, 3).intValue(), 9);

    Function3<Integer, Integer, Integer, Integer> sumB = (a, b, c) -> a + b + c;
    Function1<Integer, Function1<Integer, Integer>> addB2 = sumB.curried().apply(2);

    assertEquals(addB2.apply(4).apply(3).intValue(), 9);
  }
}
