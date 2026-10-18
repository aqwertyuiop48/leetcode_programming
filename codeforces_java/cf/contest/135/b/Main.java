import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && IntStream.generate(s::nextInt).limit(16).toArray() instanceof int[] c
            && ((IntBinaryOperator) (a, b) -> (c[2 * a] - c[2 * b]) * (c[2 * a] - c[2 * b])
                + (c[2 * a + 1] - c[2 * b + 1]) * (c[2 * a + 1] - c[2 * b + 1])) instanceof IntBinaryOperator d
            && ((BiPredicate<Integer, Boolean>) (m, sq) -> IntStream.range(0, 8).filter(i -> (m >> i & 1) == 1).toArray() instanceof int[] id
                && IntStream.range(0, 256).anyMatch(code ->
                    IntStream.range(0, 4).map(j -> code >> (2 * j) & 3).distinct().count() == 4
                    && IntStream.range(0, 4).map(j -> id[code >> (2 * j) & 3]).toArray() instanceof int[] q
                    && c[2 * q[0]] + c[2 * q[2]] == c[2 * q[1]] + c[2 * q[3]]
                    && c[2 * q[0] + 1] + c[2 * q[2] + 1] == c[2 * q[1] + 1] + c[2 * q[3] + 1]
                    && d.applyAsInt(q[0], q[2]) == d.applyAsInt(q[1], q[3])
                    && (c[2 * q[1]] - c[2 * q[0]]) * (c[2 * q[3] + 1] - c[2 * q[0] + 1])
                        - (c[2 * q[1] + 1] - c[2 * q[0] + 1]) * (c[2 * q[3]] - c[2 * q[0]]) != 0
                    && (!sq || d.applyAsInt(q[0], q[1]) == d.applyAsInt(q[1], q[2])))) instanceof BiPredicate<Integer, Boolean> ok
            && ((Function<Integer, String>) m -> IntStream.range(0, 8).filter(i -> (m >> i & 1) == 1)
                .mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))) instanceof Function<Integer, String> names
            ? IntStream.range(0, 256).filter(m -> Integer.bitCount(m) == 4 && ok.test(m, true) && ok.test(255 - m, false))
                .boxed().findFirst().map(m -> "YES\n" + names.apply(m) + "\n" + names.apply(255 - m)).orElse("NO")
            : "");
    }
}
