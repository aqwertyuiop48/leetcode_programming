import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            Optional.of(new Scanner(System.in))
                .map(sc -> new long[]{sc.nextInt(), sc.nextLong()})
                .map(nk -> ((BiFunction<Integer, Long, String>) (n, k0) ->
                    Optional.<Function<String, Long>>of(pre ->
                        Math.min(
                            LongStream.of(
                                IntStream.range(0, (n + 1) / 2).boxed().reduce(
                                    new long[]{1, 0, 0, 0},
                                    (cur, j) -> Optional.of(new int[]{
                                            j < pre.length() ? pre.charAt(j) - '0' : -1,
                                            n - 1 - j < pre.length() ? pre.charAt(n - 1 - j) - '0' : -1})
                                        .map(f -> IntStream.range(0, 4).mapToLong(t ->
                                            IntStream.range(0, 16)
                                                .filter(e -> (f[0] < 0 || ((e >> 2) & 1) == f[0])
                                                    && (f[1] < 0 || (e >> 3) == f[1])
                                                    && (j != n - 1 - j || ((e >> 2) & 1) == (e >> 3))
                                                    && (((e >> 2) & 1) == (e >> 3)
                                                        ? ((e & 1) != 0 || ((e >> 2) & 1) == 0) && t == ((e & 2) | 1)
                                                        : ((e & 2) != 0 || ((e >> 2) & 1) == 0) && t == (2 | (e & 1))))
                                                .mapToLong(e -> cur[e & 3])
                                                .sum()).toArray())
                                        .get(),
                                    (x, y) -> x)).sum(),
                            (long) 4e18)
                        - (pre.chars().allMatch(c -> c == '0') ? 1 : 0))
                    .map(count -> Optional.of(
                            IntStream.range(0, n).boxed().reduce(
                                Map.<Long, String>entry(k0, ""),
                                (st, p) -> Optional.of(count.apply(st.getValue() + "0"))
                                    .map(c -> c >= st.getKey()
                                        ? Map.<Long, String>entry(st.getKey(), st.getValue() + "0")
                                        : Map.<Long, String>entry(st.getKey() - c, st.getValue() + "1"))
                                    .get(),
                                (x, y) -> x))
                        .map(fin -> count.apply(fin.getValue()) >= fin.getKey() ? fin.getValue() : "-1")
                        .get())
                    .get())
                    .apply((int) nk[0], nk[1]))
                .get());
    }
}