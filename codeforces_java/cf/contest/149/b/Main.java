import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next().split(":")).ifPresent(p -> System.out.print(p[0].replaceFirst("^0+", "").length() <= 1 && p[1].replaceFirst("^0+", "").length() <= 1 && (p[0].replaceFirst("^0+", "").isEmpty() ? 0 : Character.digit(p[0].replaceFirst("^0+", "").charAt(0), 36)) <= 23 && (p[1].replaceFirst("^0+", "").isEmpty() ? 0 : Character.digit(p[1].replaceFirst("^0+", "").charAt(0), 36)) <= 59 ? "-1" : Optional.of(IntStream.rangeClosed(2, 60).filter(b -> (p[0] + p[1]).chars().allMatch(c -> Character.digit(c, 36) < b) && p[0].chars().asLongStream().map(c -> Character.digit((int) c, 36)).reduce(0, (x, d) -> x * b + d) <= 23 && p[1].chars().asLongStream().map(c -> Character.digit((int) c, 36)).reduce(0, (x, d) -> x * b + d) <= 59).boxed().map(String::valueOf).collect(Collectors.joining(" "))).filter(r -> !r.isEmpty()).orElse("0")));
    }
}
