import static org.junit.Assert.assertEquals;

import io.vavr.Function1;
import io.vavr.Function2;

public class PartialApplication {

  public static void main(String[] args) {
    Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
    Function1<Integer, Integer> add2 = sum.apply(2);

    assertEquals(add2.apply(4).longValue(), 6);

    Function2<Integer, Integer, Integer> div = (a, b) -> a / b;
    Function1<Integer, Integer> div2 = div.apply(10);

    assertEquals(div2.apply(2).longValue(), 5);
  }
}
