import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Long.valueOf((1L << 61) - 1) instanceof Long P
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(Math.multiplyHigh(a, b)) instanceof Long hi && Long.valueOf((a * b & P) + ((a * b >>> 61) | (hi << 3))) instanceof Long x && Long.valueOf((x & P) + (x >>> 61)) instanceof Long y ? y >= P ? y - P : y : 0L) instanceof LongBinaryOperator mul
            && ((LongUnaryOperator) b -> IntStream.iterate(60, i -> i >= 0, i -> i - 1).boxed().reduce(1L, (acc, i) -> (((P - 2) >> i) & 1) == 1 ? mul.applyAsLong(mul.applyAsLong(acc, acc), b) : mul.applyAsLong(acc, acc), (u, v) -> u)) instanceof LongUnaryOperator inv
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[1 + 4 * i]) * Long.parseLong(t[1 + 4 * i]) * Long.parseLong(t[4 + 4 * i]) * Long.parseLong(t[4 + 4 * i]) + Long.parseLong(t[3 + 4 * i]) * Long.parseLong(t[3 + 4 * i]) * Long.parseLong(t[2 + 4 * i]) * Long.parseLong(t[2 + 4 * i])).toArray() instanceof long[] D
            && IntStream.range(0, n).mapToLong(i -> mul.applyAsLong((Long.parseLong(t[1 + 4 * i]) * Long.parseLong(t[2 + 4 * i]) * Long.parseLong(t[4 + 4 * i]) * Long.parseLong(t[4 + 4 * i]) % P + P) % P, inv.applyAsLong(D[i]))).toArray() instanceof long[] px
            && IntStream.range(0, n).mapToLong(i -> mul.applyAsLong((Long.parseLong(t[3 + 4 * i]) * Long.parseLong(t[4 + 4 * i]) * Long.parseLong(t[2 + 4 * i]) * Long.parseLong(t[2 + 4 * i]) % P + P) % P, inv.applyAsLong(D[i]))).toArray() instanceof long[] py
            && ((BiFunction<Integer, Integer, Long>) (i, j) -> (mul.applyAsLong((px[i] + px[j]) % P, 1000003L) + (py[i] + py[j]) % P) % P) instanceof BiFunction<Integer, Integer, Long> mid
            && IntStream.range(0, n).boxed().flatMapToLong(i -> IntStream.range(i + 1, n).mapToLong(j -> mid.apply(i, j))).sorted().toArray() instanceof long[] ks
            && IntStream.range(1, ks.length).filter(k -> ks[k] == ks[k - 1]).mapToObj(k -> ks[k]).collect(Collectors.toSet()) instanceof Set<Long> dup
            && ((BiFunction<Integer, Integer, Long>) (i, j) -> (px[i] - px[j] + P) % P == 0 ? P : mul.applyAsLong((py[i] - py[j] + P) % P, inv.applyAsLong((px[i] - px[j] + P) % P))) instanceof BiFunction<Integer, Integer, Long> slope
            && IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(i + 1, n).filter(j -> dup.contains(mid.apply(i, j))).mapToObj(j -> new long[]{mid.apply(i, j), slope.apply(i, j)})).sorted((p, q) -> p[0] != q[0] ? Long.compare(p[0], q[0]) : Long.compare(p[1], q[1])).toArray(long[][]::new) instanceof long[][] ps
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[]{1, 0, 0, 0} instanceof long[] st
            && IntStream.rangeClosed(0, ps.length).allMatch(k -> (k == ps.length || k > 0 && ps[k][0] != ps[k - 1][0]
                    ? (st[0] = st[0] * (1 + st[1]) % M) > 0 && (st[3] = (st[3] + st[0] - 1 - st[2] % M + 2 * M) % M) >= 0 && (st[0] = 1) > 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0
                    : k > 0 && ps[k][1] != ps[k - 1][1] ? (st[0] = st[0] * (1 + st[1]) % M) > 0 && (st[1] = 0) == 0 : true)
                && (k == ps.length || ++st[1] > 0 && ++st[2] > 0))
            ? st[3] : "");
    }
}
