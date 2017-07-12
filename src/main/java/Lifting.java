import io.vavr.Function2;
import io.vavr.control.Option;

public class Lifting {

  public static void main(String[] args) {
    Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;
    Function2<Integer, Integer, Option<Integer>> safeDivide = Function2.lift(divide);
    //
    // divide.apply(1,0);

    System.out.println(safeDivide.apply(1,1).);

  }
}
