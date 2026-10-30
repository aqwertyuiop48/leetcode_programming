import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) t[0] instanceof Integer n
            && new long[n + 1] instanceof long[] a && new long[(n + 1) * 30] instanceof long[] bit && new long[30] instanceof long[] dv && new long[510] instanceof long[] dummy
            && IntStream.rangeClosed(2, 6).flatMap(z -> IntStream.range(0, 2 * (z - 1)).map(s -> z)).toArray() instanceof int[] zk
            && IntStream.rangeClosed(2, 6).flatMap(z -> IntStream.range(0, 2 * (z - 1))).toArray() instanceof int[] sk
            && IntStream.range(0, 30 * 120).map(x -> ((x % 120 - sk[x / 120]) % (2 * (zk[x / 120] - 1)) + 2 * (zk[x / 120] - 1)) % (2 * (zk[x / 120] - 1)) <= zk[x / 120] - 1
                ? ((x % 120 - sk[x / 120]) % (2 * (zk[x / 120] - 1)) + 2 * (zk[x / 120] - 1)) % (2 * (zk[x / 120] - 1)) + 1
                : 2 * (zk[x / 120] - 1) - ((x % 120 - sk[x / 120]) % (2 * (zk[x / 120] - 1)) + 2 * (zk[x / 120] - 1)) % (2 * (zk[x / 120] - 1)) + 1).toArray() instanceof int[] wtab
            && ((IntBinaryOperator) (k, i) -> wtab[k * 120 + i % 120]) instanceof IntBinaryOperator w
            && IntStream.rangeClosed(1, n).allMatch(i -> (a[i] = t[i]) > 0)
            && IntStream.range(30, (n + 1) * 30).map(x -> (bit[x] = a[x / 30] * wtab[x % 30 * 120 + x / 30 % 120]) > 0 ? 0 : 0).sum() == 0
            && IntStream.range(30, (n + 1) * 30).filter(x -> x / 30 + (x / 30 & -(x / 30)) <= n).map(x -> (bit[(x / 30 + (x / 30 & -(x / 30))) * 30 + x % 30] += bit[x]) > 0 ? 0 : 0).sum() == 0
            && new LongUnaryOperator[1] instanceof LongUnaryOperator[] pfh
            && (pfh[0] = code -> (code >> 5) <= 0 ? 0L : bit[(int) (code >> 5) * 30 + (int) (code & 31)] + pfh[0].applyAsLong(((code >> 5) - (code >> 5 & -(code >> 5)) << 5) | (code & 31))) != null
            && (Integer) t[n + 1] instanceof Integer m
            && new int[]{n + 2} instanceof int[] pos
            ? IntStream.range(0, m).mapToObj(q -> (Integer) t[pos[0]] instanceof Integer ty
                ? ty == 1
                    ? (Integer) t[pos[0] + 1] instanceof Integer i && (Long) (long) t[pos[0] + 2] instanceof Long v && (Long) (v - a[i]) instanceof Long d && (a[i] = v) >= 0 && (pos[0] += 3) > 0
                        && IntStream.iterate(i, j -> j <= n, j -> j + (j & -j)).toArray() instanceof int[] nodes
                        && Stream.of(0).peek(z0 -> Arrays.setAll(dv, k -> d * w.applyAsInt(k, i))).peek(z1 -> Arrays.setAll(dummy, x -> x < nodes.length * 30 ? (bit[nodes[x / 30] * 30 + x % 30] += dv[x % 30]) : 0L)).findFirst().isPresent() ? (String) null : (String) null
                    : (Integer) t[pos[0] + 1] instanceof Integer l && (Integer) t[pos[0] + 2] instanceof Integer r && (Integer) t[pos[0] + 3] instanceof Integer z && (pos[0] += 4) > 0
                        && (Long) (long) ((z - 2) * (z - 1) + l % (2 * (z - 1))) instanceof Long slot
                        ? String.valueOf(pfh[0].applyAsLong((long) r * 32 + slot) - pfh[0].applyAsLong((long) (l - 1) * 32 + slot)) : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
