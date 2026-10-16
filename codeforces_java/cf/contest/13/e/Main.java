import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((t[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(Math.max(1, (int) Math.sqrt(n))) instanceof Integer bs
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : t[1 + i]).toArray() instanceof int[] power
            && new int[n + 1] instanceof int[] lastHole
            && new int[n + 1] instanceof int[] jumpCount
            && new int[n + 1] instanceof int[] nextHole
            && new int[]{0} instanceof int[] lo
            && new IntPredicate[1] instanceof IntPredicate[] rc
            && (rc[0] = i -> i < lo[0] || ((i + power[i] > n || (i + power[i] - 1) / bs != (i - 1) / bs
                        ? (lastHole[i] = i) == i && (jumpCount[i] = 1) == 1 && (nextHole[i] = i + power[i] > n ? 0 : i + power[i]) >= 0
                        : (lastHole[i] = lastHole[i + power[i]]) >= 0 && (jumpCount[i] = 1 + jumpCount[i + power[i]]) >= 0 && (nextHole[i] = nextHole[i + power[i]]) >= 0)
                    && rc[0].test(i - 1))) != null
            && IntStream.range(0, (n + bs - 1) / bs).allMatch(k -> (lo[0] = k * bs + 1) > 0 && rc[0].test(Math.min((k + 1) * bs, n)))
            && new long[]{0, 0} instanceof long[] acc
            && new IntPredicate[1] instanceof IntPredicate[] qr
            && (qr[0] = c -> c <= 0 || ((acc[0] += jumpCount[c]) > 0 && (acc[1] = lastHole[c]) > 0 && qr[0].test(nextHole[c]))) != null
            && new int[]{2 + n} instanceof int[] p
            ? IntStream.range(0, m).mapToObj(q ->
                    t[p[0]++] == 1
                        ? (acc[0] = 0) == 0 && (acc[1] = 0) == 0 && qr[0].test(t[p[0]++])
                            ? acc[1] + " " + acc[0]
                            : null
                        : (Integer) t[p[0]++] instanceof Integer a && (power[a] = t[p[0]++]) >= 0 && (lo[0] = (a - 1) / bs * bs + 1) > 0 && rc[0].test(a)
                            ? null : null)
                .filter(Objects::nonNull)
                .collect(Collectors.joining("\n"))
            : "");
    }
}

