import io.vavr.Lazy;

public class LazyEx {

  public static void main(String[] args) {
    Lazy<Double> lazy = Lazy.of(Math::random);
    System.out.println(lazy.isEvaluated());
    System.out.println(lazy.get());
    System.out.println(lazy.isEvaluated());
    System.out.println(lazy.get());
  }
}
