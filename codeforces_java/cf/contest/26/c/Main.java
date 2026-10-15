import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.generate(s::nextInt).limit(5).toArray() instanceof int[] v
            && Integer.valueOf(v[0]) instanceof Integer n
            && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(v[2] - (n % 2 == 1 ? m / 2 : 0)) instanceof Integer ap
            && Integer.valueOf(v[3] - (m % 2 == 1 ? n / 2 : 0)) instanceof Integer bp
            && Integer.valueOf(Math.min(v[4], (n / 2) * (m / 2))) instanceof Integer nc
            && Integer.valueOf(Math.min(Math.max(ap, 0) / 2, (n / 2) * (m / 2) - nc)) instanceof Integer nh
            && !(n % 2 == 1 && m % 2 == 1) && ap >= 0 && bp >= 0
            && (n / 2) * (m / 2) - nc - nh <= bp / 2
            && new char[n][m] instanceof char[][] g
            && ((Predicate<int[]>) t -> IntStream.rangeClosed('a', 'z').boxed()
                .filter(ch -> IntStream.rangeClosed(t[0] - 1, t[2] + 1).allMatch(i -> IntStream.rangeClosed(t[1] - 1, t[3] + 1).allMatch(j ->
                    !(i >= t[0] && i <= t[2] || j >= t[1] && j <= t[3]) || i < 0 || j < 0 || i >= n || j >= m || g[i][j] != ch)))
                .findFirst().get() instanceof Integer lt
                && IntStream.rangeClosed(t[0], t[2]).allMatch(i -> IntStream.rangeClosed(t[1], t[3]).allMatch(j -> (g[i][j] = (char) (int) lt) > 0))) instanceof Predicate<int[]> place
            && Stream.concat(
                IntStream.range(0, n / 2).boxed().flatMap(r ->
                    new int[]{Math.max(0, Math.min(m / 2, nc - r * (m / 2))), Math.max(0, Math.min(r * (m / 2) + m / 2, nc + nh) - Math.max(r * (m / 2), nc))} instanceof int[] q
                    && Integer.valueOf(m / 2 - q[0] - q[1]) instanceof Integer cv
                    && Integer.valueOf(q[1] > 0 && cv > 0 ? 1 : 0) instanceof Integer pre
                    ? Stream.of(
                        IntStream.range(0, q[0]).mapToObj(k -> new int[]{2 * r, 2 * k, 2 * r + 1, 2 * k + 1}),
                        IntStream.range(0, 2 * cv).mapToObj(k -> new int[]{2 * r, k < pre ? 2 * q[0] : 2 * q[0] + 2 * q[1] + k, 2 * r + 1, k < pre ? 2 * q[0] : 2 * q[0] + 2 * q[1] + k}),
                        IntStream.range(0, q[1]).boxed().flatMap(k -> Stream.of(
                            new int[]{2 * r, 2 * q[0] + pre + 2 * k, 2 * r, 2 * q[0] + pre + 2 * k + 1},
                            new int[]{2 * r + 1, 2 * q[0] + pre + 2 * k, 2 * r + 1, 2 * q[0] + pre + 2 * k + 1}))
                    ).flatMap(x -> x)
                    : Stream.<int[]>empty()),
                Stream.concat(
                    n % 2 == 1 ? IntStream.range(0, m / 2).mapToObj(k -> new int[]{n - 1, 2 * k, n - 1, 2 * k + 1}) : Stream.<int[]>empty(),
                    m % 2 == 1 ? IntStream.range(0, n / 2).mapToObj(k -> new int[]{2 * k, m - 1, 2 * k + 1, m - 1}) : Stream.<int[]>empty())
            ).allMatch(place)
            ? Arrays.stream(g).map(String::new).collect(Collectors.joining("\n"))
            : "IMPOSSIBLE"));

    }
}


