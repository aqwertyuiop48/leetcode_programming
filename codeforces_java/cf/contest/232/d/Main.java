import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer n && LongStream.range(0, n).map(i -> it.next()).toArray() instanceof long[] h
            && Long.valueOf((1L << 61) - 1) instanceof Long M && Long.valueOf(1000003L + new Random().nextInt(1 << 30)) instanceof Long B
            && LongStream.concat(LongStream.concat(IntStream.range(0, n - 1).mapToLong(i -> h[i + 1] - h[i] + 2000000001L), LongStream.of(7000000000L)), IntStream.range(0, n - 1).mapToLong(i -> h[i] - h[i + 1] + 2000000001L)).toArray() instanceof long[] S
            && Integer.valueOf(S.length) instanceof Integer L
            && ((LongBinaryOperator) (a, b) -> Long.valueOf((a * b & M) + (Math.multiplyHigh(a, b) << 3 | a * b >>> 61)) instanceof Long s ? (s >= M ? s - M : s) : 0) instanceof LongBinaryOperator mul
            && new long[L + 1] instanceof long[] H && new long[L + 1] instanceof long[] P && (P[0] = 1) > 0
            && IntStream.range(0, L).allMatch(i -> (H[i + 1] = (mul.applyAsLong(H[i], B) + S[i]) % M) >= 0 && (P[i + 1] = mul.applyAsLong(P[i], B)) > 0)
            && ((LongBinaryOperator) (i, len) -> (H[(int) (i + len)] - mul.applyAsLong(H[(int) i], P[(int) len]) + M) % M) instanceof LongBinaryOperator hsh
            && Arrays.stream(S).distinct().sorted().toArray() instanceof long[] dv
            && IntStream.range(0, L).map(i -> Arrays.binarySearch(dv, S[i]) + 1).toArray() instanceof int[] rk
            && IntStream.iterate(1, k -> k < L, k -> k * 2).allMatch(k -> LongStream.range(0, L).map(i -> ((long) rk[(int) i] * (L + 2) + (i + k < L ? rk[(int) i + k] : 0)) << 18 | i).sorted().toArray() instanceof long[] ks
                && new int[]{0} instanceof int[] cur && IntStream.range(0, L).allMatch(j -> (cur[0] += j > 0 && ks[j] >> 18 != ks[j - 1] >> 18 ? 1 : j == 0 ? 1 : 0) > 0 && (rk[(int) (ks[j] & 262143)] = cur[0]) > 0))
            && new int[L] instanceof int[] sa && IntStream.range(0, L).allMatch(i -> (sa[rk[i] - 1] = i) >= 0)
            && Integer.valueOf(1 << 18) instanceof Integer SZ
            && IntStream.range(0, SZ).map(i -> i < L && sa[i] <= n - 2 ? sa[i] : -1).toArray() instanceof int[] val
            && IntStream.range(0, 19).mapToObj(j -> j == 0 ? val : IntStream.range(0, SZ >> j).flatMap(b -> Arrays.stream(val, b << j, (b + 1) << j).sorted()).toArray()).toList() instanceof List<int[]> lev
            && ((ToIntFunction<int[]>) w -> new int[]{w[1], w[2]} instanceof int[] st
                && IntStream.range(0, 20).allMatch(z -> (st[0] >= st[1] || (lev.get(w[0])[st[0] + st[1] >>> 1] < w[3] ? (st[0] = (st[0] + st[1] >>> 1) + 1) > 0 : (st[1] = st[0] + st[1] >>> 1) >= 0)) | true) ? st[0] - w[1] : 0) instanceof ToIntFunction<int[]> below
            && ((ToIntFunction<int[]>) w -> below.applyAsInt(new int[]{w[0], w[1] << w[0], w[1] + 1 << w[0], w[3] + 1}) - below.applyAsInt(new int[]{w[0], w[1] << w[0], w[1] + 1 << w[0], w[2]})) instanceof ToIntFunction<int[]> blk
            && ((ToIntFunction<int[]>) w -> new int[]{w[0], w[1] + 1, 0} instanceof int[] st
                && IntStream.range(0, 19).allMatch(j -> (st[0] < st[1] ? ((st[0] & 1) == 0 || (st[2] += blk.applyAsInt(new int[]{j, st[0]++, w[2], w[3]})) >= 0) && ((st[1] & 1) == 0 || (st[2] += blk.applyAsInt(new int[]{j, --st[1], w[2], w[3]})) >= 0) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0 : true)) ? st[2] : 0) instanceof ToIntFunction<int[]> cnt
            ? IntStream.range(0, Integer.valueOf((int) (long) it.next())).mapToObj(q -> Integer.valueOf((int) (long) it.next()) instanceof Integer l && Integer.valueOf((int) (long) it.next()) instanceof Integer r
                ? (l.equals(r) ? String.valueOf(n - 1)
                    : Integer.valueOf(r - l) instanceof Integer m && Integer.valueOf(n + l - 1) instanceof Integer p && Long.valueOf(hsh.applyAsLong(p, m)) instanceof Long hp
                    && Integer.valueOf(rk[p] - 1) instanceof Integer me
                    && new int[]{0, me} instanceof int[] lo && IntStream.range(0, 19).allMatch(z -> (lo[0] >= lo[1] || (sa[lo[0] + lo[1] >>> 1] + m <= L && hsh.applyAsLong(sa[lo[0] + lo[1] >>> 1], m) == hp ? (lo[1] = lo[0] + lo[1] >>> 1) >= 0 : (lo[0] = (lo[0] + lo[1] >>> 1) + 1) > 0)) | true)
                    && new int[]{me, L - 1} instanceof int[] hi && IntStream.range(0, 19).allMatch(z -> (hi[0] >= hi[1] || (sa[hi[0] + hi[1] + 1 >>> 1] + m <= L && hsh.applyAsLong(sa[hi[0] + hi[1] + 1 >>> 1], m) == hp ? (hi[0] = hi[0] + hi[1] + 1 >>> 1) >= 0 : (hi[1] = (hi[0] + hi[1] + 1 >>> 1) - 1) > -2)) | true)
                    ? String.valueOf(cnt.applyAsInt(new int[]{lo[0], hi[0], 0, n - 2}) - cnt.applyAsInt(new int[]{lo[0], hi[0], Math.max(0, l - 1 - m), r - 1})) : "?")
                : "").collect(Collectors.joining("\n")) : "");
    }
}
