import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && LongStream.range(0, n).map(i -> it.nextLong()).toArray() instanceof long[] x
            && Integer.valueOf((int) it.nextLong()) instanceof Integer m && LongStream.range(0, m).mapToObj(i -> new long[]{it.nextLong(), it.nextLong(), it.nextLong()}).toList() instanceof List<long[]> qs
            && x.clone() instanceof long[] cur
            && LongStream.concat(Arrays.stream(x), qs.stream().filter(q -> q[0] == 1).mapToLong(q -> cur[(int) q[1] - 1] += q[2])).sorted().distinct().toArray() instanceof long[] vals
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, vals.length - 1)) * 2) instanceof Integer S
            && ((LongFunction<Integer>) v -> Integer.valueOf(Arrays.binarySearch(vals, v)) instanceof Integer r ? r >= 0 ? r : -r - 1 : 0) instanceof LongFunction<Integer> lb
            && ((BinaryOperator<long[]>) (A, B) -> new long[]{A[0] + B[0], A[1] + B[1], A[2] + B[2] + B[1] * A[0] - A[1] * B[0]}) instanceof BinaryOperator<long[]> mg
            && IntStream.range(0, 2 * S).mapToObj(i -> new long[3]).toArray(long[][]::new) instanceof long[][] t
            && ((BiPredicate<Integer, Long>) (pos, on) -> t[pos + S] instanceof long[] leaf && (leaf[0] = on) >= 0 && (leaf[1] = on * vals[pos]) > Long.MIN_VALUE
                && IntStream.iterate((pos + S) >> 1, i -> i >= 1, i -> i >> 1).allMatch(i -> (t[i] = mg.apply(t[2 * i], t[2 * i + 1])) != null)) instanceof BiPredicate<Integer, Long> setp
            && Arrays.stream(x).allMatch(v -> setp.test(lb.apply(v), 1L)) && x.clone() instanceof long[] pos2
            ? IntStream.range(0, m).mapToObj(qi -> qs.get(qi) instanceof long[] q
                ? q[0] == 1
                    ? setp.test(lb.apply(pos2[(int) q[1] - 1]), 0L) && (pos2[(int) q[1] - 1] += q[2]) != Long.MIN_VALUE && setp.test(lb.apply(pos2[(int) q[1] - 1]), 1L) ? (String) null : (String) null
                    : new int[]{lb.apply(q[1]) + S, lb.apply(q[2] + 1) + S} instanceof int[] lr && new long[3][] instanceof long[][] res && (res[0] = new long[3]) != null && (res[1] = new long[3]) != null
                        && IntStream.iterate(0, z -> lr[0] < lr[1], z -> z + 1).allMatch(z -> ((lr[0] & 1) == 0 || (res[0] = mg.apply(res[0], t[lr[0]++])) != null) && ((lr[1] & 1) == 0 || (res[1] = mg.apply(t[--lr[1]], res[1])) != null)
                            && (lr[0] >>= 1) >= 0 && (lr[1] >>= 1) >= 0)
                        && (res[2] = mg.apply(res[0], res[1])) != null ? "" + res[2][2] : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
