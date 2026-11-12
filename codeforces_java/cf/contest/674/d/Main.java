import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 4] instanceof long[] tok && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tok[0]) instanceof Integer n && Integer.valueOf((int) tok[1]) instanceof Integer q
            && new long[n + 1] instanceof long[] t && new long[n + 1] instanceof long[] sh && new long[n + 1] instanceof long[] kp && new long[n + 1] instanceof long[] S
            && new int[n + 1] instanceof int[] fo && new int[n + 1] instanceof int[] cnt && new int[]{2 + 2 * n} instanceof int[] ptr && new StringBuilder() instanceof StringBuilder sb
            && Stream.generate(() -> new TreeMap<Long, Integer>()).limit(n + 1).collect(Collectors.toList()) instanceof List<TreeMap<Long, Integer>> F
            && Integer.valueOf(1 << (32 - Integer.numberOfLeadingZeros(n))) instanceof Integer sz && Integer.valueOf(31 - Integer.numberOfLeadingZeros(sz)) instanceof Integer lg
            && LongStream.generate(() -> Long.MAX_VALUE).limit(2 * sz).toArray() instanceof long[] tmin && LongStream.generate(() -> Long.MIN_VALUE).limit(2 * sz).toArray() instanceof long[] tmax
            && ((BiPredicate<TreeMap<Long, Integer>, Long>) (m, k) -> m.merge(k, -1, (a, b) -> a + b == 0 ? null : a + b) != null || true) instanceof BiPredicate<TreeMap<Long, Integer>, Long> dec
            && ((BiPredicate<TreeMap<Long, Integer>, Long>) (m, k) -> m.merge(k, 1, Integer::sum) > 0) instanceof BiPredicate<TreeMap<Long, Integer>, Long> inc
            && ((IntPredicate) g -> (tmin[sz + g] = F.get(g).isEmpty() ? Long.MAX_VALUE : F.get(g).firstKey() + sh[g]) * 0 == 0 & (tmax[sz + g] = F.get(g).isEmpty() ? Long.MIN_VALUE : F.get(g).lastKey() + sh[g]) * 0 == 0) instanceof IntPredicate leaf
            && ((IntPredicate) g -> leaf.test(g) && IntStream.rangeClosed(1, lg).filter(lv -> (tmin[(sz + g) >> lv] = Math.min(tmin[((sz + g) >> lv) * 2], tmin[((sz + g) >> lv) * 2 + 1])) * 0 == 0 & (tmax[(sz + g) >> lv] = Math.max(tmax[((sz + g) >> lv) * 2], tmax[((sz + g) >> lv) * 2 + 1])) * 0 == 0).count() >= 0) instanceof IntPredicate upd
            && ((IntBinaryOperator) (v, d) -> (cnt[v] += d) >= 0 && (S[fo[v]] -= sh[v]) * 0 == 0 && (sh[v] = t[v] / (cnt[v] + 2)) >= 0 && (kp[v] = t[v] - (cnt[v] + 1) * sh[v]) >= 0 && (S[fo[v]] += sh[v]) * 0 == 0 ? 1 : 0) instanceof IntBinaryOperator sc
            && IntStream.rangeClosed(1, n).filter(i -> (t[i] = tok[1 + i]) > 0 & (fo[i] = (int) tok[n + 1 + i]) > 0 & ++cnt[fo[i]] > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (sh[v] = t[v] / (cnt[v] + 2)) >= 0 & (kp[v] = t[v] - (cnt[v] + 1) * sh[v]) >= 0 & (S[fo[v]] += sh[v]) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> inc.test(F.get(fo[v]), kp[v] + S[v])).count() >= 0
            && IntStream.rangeClosed(1, n).filter(g -> leaf.test(g)).count() >= 0
            && IntStream.range(1, sz).map(x -> sz - x).filter(x -> (tmin[x] = Math.min(tmin[2 * x], tmin[2 * x + 1])) * 0 == 0 & (tmax[x] = Math.max(tmax[2 * x], tmax[2 * x + 1])) * 0 == 0).count() >= 0
            && IntStream.range(0, q).filter(qi -> (int) tok[ptr[0]] == 1
                ? (ptr[0] += 3) > 0 && Integer.valueOf((int) tok[ptr[0] - 2]) instanceof Integer i && Integer.valueOf((int) tok[ptr[0] - 1]) instanceof Integer j && Integer.valueOf(fo[i]) instanceof Integer p
                    && IntStream.of(i, p, j, fo[p], fo[j]).distinct().toArray() instanceof int[] W
                    && IntStream.concat(Arrays.stream(W).map(v -> fo[v]), IntStream.of(p, j)).distinct().toArray() instanceof int[] G
                    && Arrays.stream(W).filter(v -> dec.test(F.get(fo[v]), kp[v] + S[v])).count() >= 0
                    && (S[p] -= sh[i]) * 0 == 0 && (S[j] += sh[i]) * 0 == 0
                    && sc.applyAsInt(p, -1) + sc.applyAsInt(j, 1) == 2
                    && (fo[i] = j) == j.intValue()
                    && Arrays.stream(W).filter(v -> inc.test(F.get(fo[v]), kp[v] + S[v])).count() >= 0
                    && Arrays.stream(G).filter(g -> upd.test(g)).count() >= 0
                : (int) tok[ptr[0]] == 2
                ? (ptr[0] += 2) > 0 && Integer.valueOf((int) tok[ptr[0] - 1]) instanceof Integer i && sb.append(kp[i] + S[i] + sh[fo[i]]).append((char) 10) != null
                : (ptr[0] += 1) > 0 && sb.append(tmin[1]).append(' ').append(tmax[1]).append((char) 10) != null).count() >= 0
            ? sb.toString().trim() : "");
    }
}
