import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;

public class MatchEx {

  public static void main(String[] args) {
      Integer i = 0;
      String on = Match(i).of(
          Case($(1), "Jeden"),
          Case($(2), "Dwa")
      );
      System.out.println(on); // nie wyświetli się
    }



}
