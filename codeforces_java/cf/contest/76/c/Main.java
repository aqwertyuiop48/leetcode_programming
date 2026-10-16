import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer k
                && Long.valueOf(s.nextLong()) instanceof Long limit
                && s.next() instanceof String str
                && IntStream.range(0, k).mapToLong(i -> s.nextLong()).toArray() instanceof long[] t
                && IntStream.range(0, k).mapToObj(i -> IntStream.range(0, k).mapToLong(j -> s.nextLong()).toArray()).toArray(long[][]::new) instanceof long[][] a
                && new long[1 << k] instanceof long[] f
                && new long[1 << k] instanceof long[] ts
                && new int[k] instanceof int[] ord
                && new int[]{0, 0} instanceof int[] cp
                && IntStream.range(0, n).allMatch(p ->
                    Integer.valueOf(str.charAt(p) - 'A') instanceof Integer j
                    && Integer.valueOf(IntStream.range(0, cp[0]).filter(q -> ord[q] == j).findFirst().orElse(cp[0])) instanceof Integer pos
                    && new int[]{0} instanceof int[] bm
                    && IntStream.range(0, pos).allMatch(q ->
                        Integer.valueOf(1 << ord[q]) instanceof Integer bi
                        && (f[bm[0]] += a[ord[q]][j]) == f[bm[0]]
                        && (f[bm[0] | bi] -= a[ord[q]][j]) == f[bm[0] | bi]
                        && (f[bm[0] | (1 << j)] -= a[ord[q]][j]) == f[bm[0] | (1 << j)]
                        && (f[bm[0] | bi | (1 << j)] += a[ord[q]][j]) == f[bm[0] | bi | (1 << j)]
                        && (bm[0] |= bi) >= 0)
                    && (pos == cp[0]
                        || ((f[bm[0]] += a[j][j]) == f[bm[0]] && (f[bm[0] | (1 << j)] -= a[j][j]) == f[bm[0] | (1 << j)]))
                    && IntStream.range(0, pos).allMatch(q -> (ord[pos - q] = ord[pos - q - 1]) >= 0)
                    && (ord[0] = j) >= 0
                    && (cp[0] += pos == cp[0] ? 1 : 0) >= 0
                    && (cp[1] |= 1 << j) >= 0)
                && IntStream.range(0, k).allMatch(b -> IntStream.range(0, 1 << k).allMatch(d -> (d >> b & 1) == 0 || (f[d] += f[d ^ (1 << b)]) != Long.MIN_VALUE))
                && IntStream.range(1, 1 << k).allMatch(d -> (ts[d] = ts[d & (d - 1)] + t[Integer.numberOfTrailingZeros(d)]) >= 0)
                ? IntStream.range(0, 1 << k).filter(d -> (d & ~cp[1]) == 0 && d != cp[1] && f[d] + ts[d] <= limit).count()
                : 0L));
    }
}



