import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && LongStream.generate(it::next).limit(n).toArray() instanceof long[] a
            && Long.valueOf(Arrays.stream(a).reduce(0, (x, y) -> x ^ y)) instanceof Long T
            && IntStream.concat(IntStream.rangeClosed(0, 59).map(i -> 59 - i).filter(b -> (T >> b & 1) == 0), IntStream.rangeClosed(0, 59).map(i -> 59 - i).filter(b -> (T >> b & 1) == 1)).toArray() instanceof int[] src
            && Integer.valueOf((int) IntStream.range(0, 60).filter(b -> (T >> b & 1) == 0).count()) instanceof Integer m0
            && new long[60] instanceof long[] bv && new long[60] instanceof long[] comb && new int[60] instanceof int[] piv && new int[]{0} instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> new long[]{IntStream.range(0, 60).mapToLong(r -> (a[i] >> src[r] & 1) << (59 - r)).sum(), 0} instanceof long[] st
                && (IntStream.iterate(59, h -> h >= 0, h -> h - 1).anyMatch(h -> (st[0] >> h & 1) == 1
                    && (bv[h] == 0 && (bv[h] = st[0]) != 0 && (comb[h] = st[1] ^ (1L << cnt[0])) != 0 && (piv[cnt[0]++] = i) >= 0
                        || !((st[0] ^= bv[h]) >= 0 & (st[1] ^= comb[h]) >= 0 | true)))
                    || true))
            && new long[]{0, 0} instanceof long[] xs
            && IntStream.iterate(59, h -> h >= 0, h -> h - 1).allMatch(h -> bv[h] == 0 || (xs[0] >> h & 1) == (h >= 60 - m0 ? 1 : 0) || ((xs[0] ^= bv[h]) >= 0 | true) && ((xs[1] ^= comb[h]) >= 0 | true))
            && IntStream.range(0, cnt[0]).filter(k -> (xs[1] >> k & 1) == 1).boxed().map(k -> piv[k]).collect(Collectors.toSet()) instanceof Set<Integer> chosen
            ? IntStream.range(0, n).mapToObj(i -> chosen.contains(i) ? "1" : "2").collect(Collectors.joining(" ")) : "");
    }
}
