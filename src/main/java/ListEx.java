import io.vavr.collection.List;
import io.vavr.collection.Stream;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class ListEx {

  public static void main(String[] args) {

    Optional<Integer> reduce = Arrays.asList(1, 2, 3).stream().reduce((i, j) -> i + j);
    int sum = IntStream.of(1, 2, 3).sum();
    Number sum1 = List.of(1, 2, 3).sum();

    System.out.println(reduce);
    System.out.println(sum);
    System.out.println(sum1);

    java.util.List<Integer> integers = List.of(1, 2, 3).toJavaList();

    Stream.from(1, 2).filter(i -> i % 2 == 0).forEach(s -> System.out.println(s));
  }
}
