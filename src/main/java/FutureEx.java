import io.vavr.concurrent.Future;
import java.util.concurrent.CompletableFuture;

public class FutureEx {

  public static void main(String[] args) {
    System.out.println("start");
    final java.util.concurrent.Future<Integer> jFuture = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      return 1;
    });
    System.out.println("end");

    final Future<Integer> future = Future.fromJavaFuture(jFuture);
    future.onComplete(x -> System.out.println(x));

  }
}
