import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split("\\s+") instanceof String[] tk
            && Long.valueOf(tk[0]) instanceof Long n
            && Arrays.stream(tk).skip(2).mapToInt(Integer::parseInt).distinct().toArray() instanceof int[] u
            && Arrays.stream(u).filter(x -> Arrays.stream(u).noneMatch(y -> y < x && x % y == 0))
                .boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray() instanceof int[] a
            && new int[a.length + 1][200000] instanceof int[][] memo
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> h
            && h.getAndSet((i, v) ->
                i == a.length ? v
                : v == 0 ? 0
                : v < 200000 && memo[(int) i][(int) v] != 0 ? memo[(int) i][(int) v] - 1
                : (Long) (h.get().applyAsLong(i + 1, v) - h.get().applyAsLong(i + 1, v / a[(int) i])) instanceof Long r
                    && (v >= 200000 || (memo[(int) i][(int) v] = (int) (r + 1)) > 0)
                    ? r : 0L) == null
            ? h.get().applyAsLong(0, n)
            : 0L);
    }
}





