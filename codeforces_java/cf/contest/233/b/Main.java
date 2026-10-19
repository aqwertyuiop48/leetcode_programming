import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n
            ? LongStream.rangeClosed(1, 90).flatMap(s -> LongStream.rangeClosed(-2, 2).map(dd -> (long) Math.sqrt((double) s * s + 4.0 * n) + dd)
                    .filter(r -> r >= 0 && r - s > 0 && (r - s) % 2 == 0 && r * r == s * s + 4 * n).map(r -> (r - s) / 2))
                .filter(x -> String.valueOf(x).chars().map(c -> c - '0').sum() * x + x * x == n).min().stream().boxed().findFirst().map(Object::toString).orElse("-1") : "");
    }
}
