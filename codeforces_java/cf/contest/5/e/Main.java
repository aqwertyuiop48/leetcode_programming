import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] h
                && (Integer) IntStream.range(0, n).reduce((a, b) -> h[b] > h[a] ? b : a).getAsInt() instanceof Integer mx
                && IntStream.range(0, n).map(k -> h[(mx + k) % n]).toArray() instanceof int[] g
                && new int[n] instanceof int[] sh
                && new long[n] instanceof long[] sc
                && new int[]{0} instanceof int[] tp
                && new long[]{0} instanceof long[] res
                && (sh[0] = g[0]) >= 0
                && (sc[0] = 1) > 0
                && IntStream.range(1, n).allMatch(i ->
                    new long[]{1} instanceof long[] cnt
                    && IntStream.iterate(tp[0], t -> t >= 0 && sh[t] < g[i], t -> t - 1).allMatch(t -> (res[0] += sc[t]) >= 0 && --tp[0] >= -1)
                    && (tp[0] < 0 || sh[tp[0]] != g[i] || ((res[0] += sc[tp[0]]) >= 0 && (cnt[0] += sc[tp[0]]) > 0 && --tp[0] >= -1))
                    && (tp[0] < 0 || ++res[0] > 0)
                    && (sh[++tp[0]] = g[i]) >= 0
                    && (sc[tp[0]] = cnt[0]) > 0)
                && IntStream.iterate(tp[0], t -> t >= 1, t -> t - 1).allMatch(t -> (t == 1 && sc[0] == 1) || (res[0] += sc[t]) >= 0)
                ? res[0]
                : 0L)));
    }
}
