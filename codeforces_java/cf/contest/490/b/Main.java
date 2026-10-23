import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && new int[1000002] instanceof int[] nxt
            && new boolean[1000002] instanceof boolean[] hasB
            && IntStream.range(0, n).allMatch(i -> (nxt[g0[1 + 2 * i]] = g0[2 + 2 * i]) >= 0 && ((hasB[g0[2 + 2 * i]] = true) || true))
            && Integer.valueOf(IntStream.range(0, n).map(i -> g0[1 + 2 * i]).filter(a -> a != 0 && !hasB[a]).findFirst().getAsInt()) instanceof Integer first
            && IntStream.iterate(first, c -> nxt[c]).limit((n + 1) / 2).toArray() instanceof int[] ev
            && IntStream.iterate(nxt[0], c -> nxt[c]).limit(n / 2).toArray() instanceof int[] od
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(i % 2 == 0 ? ev[i / 2] : od[i / 2])).collect(Collectors.joining(" "))
            : "");
    }
}
