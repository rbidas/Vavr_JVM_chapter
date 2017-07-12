import io.vavr.control.Try;

public class TryEx {

  public static void main(String[] args) {
    Integer returned = Try.of(() -> 5 / 0).getOrElse(new Integer(1));
    System.out.println(returned);

  }
}
