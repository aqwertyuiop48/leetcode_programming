
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 1} instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).mapToLong(i -> i < raw.length && raw[i] >= 48 ? (ps[2] = 1) + (ps[1] = ps[1] * 10 + raw[i] - 48) : ps[2] == 1 ? (tk[(int) ps[0]++] = ps[1] * ps[3]) + (ps[2] = 0) + (ps[1] = 0) + (ps[3] = 1) : i < raw.length && raw[i] == 45 ? (ps[3] = -1) : 0).max().isPresent()
            && (Integer) (int) tk[0] instanceof Integer n && (Integer) (int) tk[1] instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> (tk[2 + i] + 1000000000L) << 18 | i).sorted().toArray() instanceof long[] key && Arrays.stream(key).map(v -> (v >> 18) - 1000000000L).toArray() instanceof long[] x
            && new int[n] instanceof int[] pos && IntStream.range(0, n).map(r -> pos[(int) (key[r] & 262143)] = r).max().isPresent()
            && (LongBinaryOperator) ((p, ky) -> ky >= 0 ? ((Integer) Arrays.binarySearch(x, x[(int) p] + ky) instanceof Integer b1 ? (b1 >= 0 ? b1 : -b1 - 2) : 0)
                : ((Integer) Arrays.binarySearch(x, x[(int) p] - ~ky) instanceof Integer b2 ? (b2 >= 0 ? b2 : -b2 - 1) : 0)) instanceof LongBinaryOperator far
            ? IntStream.range(0, m).mapToObj(qi -> Stream.iterate(new long[]{pos[(int) tk[2 + n + 2 * qi] - 1], tk[3 + n + 2 * qi], 0, 0}, st -> st[3] < 2,
                st -> (Integer) (int) far.applyAsLong(st[0], st[2] == 0 ? st[1] : ~st[1]) instanceof Integer q
                    ? (q == st[0] ? new long[]{st[0], st[1], 1 - st[2], st[3] + 1}
                        : (Long) Math.abs(x[q] - x[(int) st[0]]) instanceof Long d && (Integer) (int) far.applyAsLong(q, st[2] == 0 ? ~(st[1] - d) : st[1] - d) instanceof Integer r
                            ? (r == st[0] ? new long[]{(st[1] / d) % 2 == 0 ? st[0] : q, st[1] % d, st[2] ^ ((st[1] / d) & 1), 0} : new long[]{q, st[1] - d, 1 - st[2], 0})
                            : null)
                    : null).reduce((u, v) -> v).map(sf -> (key[(int) sf[0]] & 262143) + 1).get()).map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}



