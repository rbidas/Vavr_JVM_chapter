import io.vavr.Function1;
import java.util.Random;

public class Memoized {

  public static void main(String[] args) {
    Function1<Integer, String> f = i -> {
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException e) {

      }
      return i + " is OK " + new Random().nextInt();
    };
    System.out.println(f.apply(1));
    System.out.println(f.apply(1));

    Function1<Integer, String> mf = f.memoized();
    System.out.println(mf.apply(1));
    System.out.println(mf.apply(2));
    System.out.println(mf.apply(1));
  }
}
