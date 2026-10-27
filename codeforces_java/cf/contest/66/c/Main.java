import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).useDelimiter("\\A")).ifPresent(s -> Optional.of(Arrays.stream(s.next().replaceAll("\\s", "").split("(?=[A-Za-z]:)")).filter(x -> x.length() > 0).map(x -> x.split("\\\\")).filter(p -> p.length >= 3).toArray(String[][]::new)).ifPresent(ps -> System.out.print(Arrays.stream(ps).map(p -> p[0] + p[1]).distinct().map(t -> Arrays.stream(ps).filter(p -> (p[0] + p[1]).equals(t)).toArray(String[][]::new)).map(g -> new long[]{Arrays.stream(g).flatMap(p -> IntStream.range(3, p.length).mapToObj(d -> String.join("/", Arrays.copyOf(p, d)))).distinct().count(), Arrays.stream(g).map(p -> String.join("/", p)).distinct().count()}).reduce((x, y) -> new long[]{Math.max(x[0], y[0]), Math.max(x[1], y[1])}).map(r -> r[0] + " " + r[1]).orElse("0 0"))));
    }
}





