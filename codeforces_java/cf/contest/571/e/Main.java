import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && ((Function<Long, TreeMap<Long, Long>>) x -> new long[]{x} instanceof long[] rem && new TreeMap<Long, Long>() instanceof TreeMap<Long, Long> res
                && IntStream.rangeClosed(2, 31623).filter(d -> rem[0] % d == 0 && (Long) LongStream.iterate(rem[0], r -> r % d == 0, r -> r / d).count() instanceof Long c && res.put((long) d, c) == null
                    && (rem[0] = LongStream.iterate(rem[0], r -> r % d == 0, r -> r / d).reduce((u, v) -> v).getAsLong() / d) >= 0 && false).count() >= 0
                && (rem[0] <= 1 || res.put(rem[0], 1L) == null) ? res : null) instanceof Function<Long, TreeMap<Long, Long>> fac
            && IntStream.range(0, 2 * n).mapToObj(i -> fac.apply(Long.parseLong(tk.nextToken()))).toList() instanceof List<TreeMap<Long, Long>> fs
            && IntStream.range(0, 2 * n).boxed().flatMap(i -> fs.get(i).keySet().stream()).mapToLong(Long::longValue).sorted().distinct().toArray() instanceof long[] pr && (Integer) pr.length instanceof Integer P
            && IntStream.range(0, n).mapToObj(i -> Arrays.stream(pr).map(q -> fs.get(2 * i).getOrDefault(q, 0L)).toArray()).toArray(long[][]::new) instanceof long[][] alpha
            && IntStream.range(0, n).mapToObj(i -> Arrays.stream(pr).map(q -> fs.get(2 * i + 1).getOrDefault(q, 0L)).toArray()).toArray(long[][]::new) instanceof long[][] beta
            && alpha[0].clone() instanceof long[] A && beta[0].clone() instanceof long[] B
            && ((IntPredicate) i -> alpha[i] instanceof long[] al && beta[i] instanceof long[] be
                && (Integer) IntStream.range(0, P).filter(p -> B[p] != 0).findFirst().orElse(-1) instanceof Integer r && (Integer) IntStream.range(0, P).filter(p -> be[p] != 0).findFirst().orElse(-1) instanceof Integer e
                && (r < 0 && e < 0 ? Arrays.equals(A, al)
                    : r < 0 ? (A[e] - al[e]) % be[e] == 0 && (Long) ((A[e] - al[e]) / be[e]) instanceof Long l && l >= 0 && IntStream.range(0, P).allMatch(p -> al[p] + l * be[p] == A[p])
                    : e < 0 ? (al[r] - A[r]) % B[r] == 0 && (Long) ((al[r] - A[r]) / B[r]) instanceof Long k && k >= 0 && IntStream.range(0, P).allMatch(p -> A[p] + k * B[p] == al[p])
                        && IntStream.range(0, P).filter(p -> (A[p] = al[p]) < 0 | (B[p] = 0L) < 0).count() >= 0
                    : (Integer) IntStream.range(0, P).filter(p -> B[p] * be[r] - B[r] * be[p] != 0).findFirst().orElse(-1) instanceof Integer q
                        && (q >= 0
                            ? (Long) (B[q] * be[r] - B[r] * be[q]) instanceof Long dl && (Long) (-(al[r] - A[r]) * be[q] + be[r] * (al[q] - A[q])) instanceof Long kn && kn % dl == 0 && (Long) (kn / dl) instanceof Long k2 && k2 >= 0
                                && (Integer) (be[r] != 0 ? r : q) instanceof Integer s && (B[s] * k2 - (al[s] - A[s])) % be[s] == 0 && (Long) ((B[s] * k2 - (al[s] - A[s])) / be[s]) instanceof Long l2 && l2 >= 0
                                && IntStream.range(0, P).allMatch(p -> A[p] + k2 * B[p] == al[p] + l2 * be[p]) && IntStream.range(0, P).filter(p -> (A[p] += k2 * B[p]) < 0 | (B[p] = 0L) < 0).count() >= 0
                            : IntStream.range(0, P).allMatch(p -> (al[p] - A[p]) * B[r] == (al[r] - A[r]) * B[p] && (al[p] - A[p]) * be[r] == (al[r] - A[r]) * be[p])
                                && (Long) BigInteger.valueOf(B[r]).gcd(BigInteger.valueOf(be[r])).longValue() instanceof Long g && (al[r] - A[r]) % g == 0 && (Long) (be[r] / g) instanceof Long mm
                                && (Long) (((al[r] - A[r]) / g % mm + mm) % mm) instanceof Long cq && (Long) (B[r] / g % mm) instanceof Long bq
                                && (Long) (mm == 1 ? 0L : (long) IntStream.range(0, (int) (long) mm).filter(t -> bq * t % mm == cq).findFirst().orElse(-1)) instanceof Long k0 && k0 >= 0
                                && (Long) ((B[r] * k0 - (al[r] - A[r])) / be[r]) instanceof Long l0 && (Long) (l0 >= 0 ? 0L : (-l0 + B[r] / g - 1) / (B[r] / g)) instanceof Long tt
                                && (Long) (k0 + tt * mm) instanceof Long k1 && IntStream.range(0, P).filter(p -> (A[p] += k1 * B[p]) < 0 | (B[p] *= mm) < 0).count() >= 0))) instanceof IntPredicate step
            ? IntStream.range(1, n).allMatch(step) ? IntStream.range(0, P).mapToObj(p -> BigInteger.valueOf(pr[p]).modPow(BigInteger.valueOf(A[p]), BigInteger.valueOf(1000000007L))).reduce(BigInteger.ONE, BigInteger::multiply).mod(BigInteger.valueOf(1000000007L)).toString() : "-1"
            : "");
    }
}
