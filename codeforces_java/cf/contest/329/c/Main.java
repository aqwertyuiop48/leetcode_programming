import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            ? (n <= 7
                ? Integer.valueOf(n * (n - 1) / 2) instanceof Integer P
                && ((BinaryOperator<Integer>) (u, v) -> Integer.valueOf(Math.min(u, v)) instanceof Integer a && Integer.valueOf(Math.max(u, v)) instanceof Integer b ? b * (b - 1) / 2 + a : 0) instanceof BinaryOperator<Integer> pid
                && Integer.valueOf(IntStream.range(0, m).map(i -> 1 << pid.apply(t[2 + 2 * i] - 1, t[3 + 2 * i] - 1)).reduce(0, (x, y) -> x | y)) instanceof Integer orig
                && IntStream.range(0, n).map(v -> IntStream.range(0, n).filter(u -> u != v).map(u -> 1 << pid.apply(u, v)).reduce(0, (x, y) -> x | y)).toArray() instanceof int[] vm
                && IntStream.range(0, 1 << P).filter(mask -> (mask & orig) == 0 && Integer.bitCount(mask) == m && Arrays.stream(vm).allMatch(x -> Integer.bitCount(mask & x) <= 2)).findFirst() instanceof OptionalInt f
                ? (f.isPresent() ? IntStream.range(0, n).boxed().flatMap(b -> IntStream.range(0, b).filter(a -> (f.getAsInt() >> (b * (b - 1) / 2 + a) & 1) != 0).mapToObj(a -> (a + 1) + " " + (b + 1))).collect(Collectors.joining("\n")) : "-1") : ""
                : new int[n + 1] instanceof int[] a1 && new int[n + 1] instanceof int[] a2
                && IntStream.range(0, m).allMatch(i -> ((a1[t[2 + 2 * i]] == 0 ? (a1[t[2 + 2 * i]] = t[3 + 2 * i]) : (a2[t[2 + 2 * i]] = t[3 + 2 * i])) >= 0
                    && (a1[t[3 + 2 * i]] == 0 ? (a1[t[3 + 2 * i]] = t[2 + 2 * i]) : (a2[t[3 + 2 * i]] = t[2 + 2 * i])) >= 0))
                && IntStream.rangeClosed(1, n).toArray() instanceof int[] p
                && new SplittableRandom(20130625L) instanceof SplittableRandom rnd
                && IntStream.range(0, 100000).filter(z -> IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(i + rnd.nextInt(n - i)) instanceof Integer j && Integer.valueOf(p[i]) instanceof Integer ti && (p[i] = p[j]) >= 0 && (p[j] = ti) >= 0)
                    && IntStream.range(0, m).allMatch(i -> Integer.valueOf(p[i]) instanceof Integer u && Integer.valueOf(p[(i + 1) % n]) instanceof Integer v && a1[u] != v && a2[u] != v)).findFirst() instanceof OptionalInt res
                ? (res.isPresent() ? new StringBuilder() instanceof StringBuilder sb && IntStream.range(0, m).allMatch(i -> sb.append(p[i]).append(' ').append(p[(i + 1) % n]).append('\n') != null) ? sb.toString().trim() : "" : "-1") : "") : "");
    }
}
