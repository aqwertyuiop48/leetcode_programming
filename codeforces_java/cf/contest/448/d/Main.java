import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long m && Long.valueOf(s.nextLong()) instanceof Long k
            ? Stream.iterate(new long[]{1, n * m},
                p -> LongStream.rangeClosed(1, n).map(i -> Math.min(m, (p[0] + p[1]) / 2 / i)).sum() >= k ? new long[]{p[0], (p[0] + p[1]) / 2} : new long[]{(p[0] + p[1]) / 2 + 1, p[1]})
                .limit(41).reduce((x, y) -> y).get()[0] : "");
    }
}
