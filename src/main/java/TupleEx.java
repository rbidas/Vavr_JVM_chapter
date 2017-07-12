import io.vavr.Tuple;
import io.vavr.Tuple2;

public class TupleEx {

  public static void main(String[] args) {
    Tuple2<String, Integer> java8 = Tuple.of("Java", 8);

    String string = java8._1;
    Integer integer = java8._2;

    String that = java8.apply(
        (s, i) -> s.substring(2) + "vr " + i / 8
    );

    System.out.println(that);
  }

}
