import io.vavr.Function2;
import io.vavr.Function8;

public class FunctionsEx {

  public static void main(String[] args) {
    Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;

    Function8<Integer, Integer, Integer, String, String, String, String, String, String> func =
        (a, b, c, d, e, f, g, h) -> a + b + c + d + e + f + g + h;

  }

}
