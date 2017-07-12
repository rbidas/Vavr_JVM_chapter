import static org.junit.Assert.assertEquals;

import io.vavr.Function1;

public class Composition {

  public static void main(String[] args) {
    Function1<Integer, Integer> plusOne = a -> a + 1;
    Function1<Integer, Integer> multiplyByTwo = a -> a * 2;

    Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.andThen(multiplyByTwo);

    assertEquals(add1AndMultiplyBy2.apply(2).longValue(), 6);


    Function1<Integer, Integer> add1AndMultiplyBy2_1 = multiplyByTwo.compose(plusOne);

    assertEquals(add1AndMultiplyBy2_1.apply(2).longValue(), 6);

  }

}
