import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(Math.max(1, (int) Math.sqrt(n))) instanceof Integer bs
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : t[1 + i]).toArray() instanceof int[] power
            && new int[n + 1] instanceof int[] lastHole
            && new int[n + 1] instanceof int[] jumpCount
            && new int[n + 1] instanceof int[] nextHole
            && ((IntPredicate) a ->
                IntStream.iterate(a, i -> i >= (a - 1) / bs * bs + 1, i -> i - 1).allMatch(i ->
                    i + power[i] > n || (i + power[i] - 1) / bs != (i - 1) / bs
                        ? (lastHole[i] = i) == i
                            && (jumpCount[i] = 1) == 1
                            && (nextHole[i] = i + power[i] > n ? 0 : i + power[i]) >= 0
                        : (lastHole[i] = lastHole[i + power[i]]) >= 0
                            && (jumpCount[i] = 1 + jumpCount[i + power[i]]) >= 0
                            && (nextHole[i] = nextHole[i + power[i]]) >= 0)) instanceof IntPredicate recompute
            && IntStream.range(0, (n + bs - 1) / bs).allMatch(k -> recompute.test(Math.min((k + 1) * bs, n)))
            && new int[]{2 + n} instanceof int[] p
            ? IntStream.range(0, m).mapToObj(q ->
                    t[p[0]++] == 1
                        ? (Long) IntStream.iterate(t[p[0]++], c -> c > 0, c -> nextHole[c]).asLongStream().reduce(0L, (acc, c) -> ((long) lastHole[(int) c] << 32) | ((acc & 0xFFFFFFFFL) + jumpCount[(int) c])) instanceof Long r
                            ? (r >> 32) + " " + (r & 0xFFFFFFFFL)
                            : null
                        : (Integer) t[p[0]++] instanceof Integer a && (power[a] = t[p[0]++]) >= 0 && recompute.test(a)
                            ? null : null)
                .filter(Objects::nonNull)
                .collect(Collectors.joining("\n"))
            : "");
    }
}
