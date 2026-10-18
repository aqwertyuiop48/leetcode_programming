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
            && (Integer) t[0] instanceof Integer n
            && (Integer) t[1] instanceof Integer m
            && (Integer) Math.max(1, (int) Math.sqrt(n / 2.0)) instanceof Integer bs
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : t[1 + i]).toArray() instanceof int[] power
            && IntStream.rangeClosed(0, 2 * n + 1).map(i -> i >= 1 && i <= n ? (i - 1) / bs : -1).toArray() instanceof int[] blk
            && new int[n + 1] instanceof int[] pk
            && new int[n + 1] instanceof int[] lh
            && ((IntPredicate) i ->
                blk[i + power[i]] != blk[i]
                    ? (pk[i] = 131072 | (i + power[i] > n ? 0 : i + power[i])) > 0 && (lh[i] = i) > 0
                    : (pk[i] = pk[i + power[i]] + 131072) > 0 && (lh[i] = lh[i + power[i]]) > 0) instanceof IntPredicate stp
            && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(stp)
            && new int[3] instanceof int[] acc
            && new int[]{2 + n} instanceof int[] p
            ? IntStream.range(0, m).mapToObj(q ->
                    t[p[0]++] == 1
                        ? (acc[0] = 0) == 0 && (acc[1] = 0) == 0 && (acc[2] = t[p[0]++]) > 0
                            && IntStream.range(0, (n + bs - 1) / bs + 1).filter(x ->
                                acc[2] > 0 && (acc[1] = acc[2]) > 0 && (acc[0] += pk[acc[2]] >>> 17) > 0 && (acc[2] = pk[acc[1]] & 131071) >= 0).count() >= 0
                            ? lh[acc[1]] + " " + acc[0]
                            : null
                        : (Integer) t[p[0]++] instanceof Integer a && (power[a] = t[p[0]++]) >= 0
                            && IntStream.range(0, a - blk[a] * bs).filter(x -> stp.test(a - x)).count() >= 0
                            ? null : null)
                .filter(Objects::nonNull)
                .collect(Collectors.joining("\n"))
            : "");
    }
}
