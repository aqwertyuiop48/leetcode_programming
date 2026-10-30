import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(Arrays.stream(v, 1, n + 1).max().getAsInt()) instanceof Integer mx
            && Long.valueOf(Arrays.stream(v, 1, n + 1).asLongStream().sum()) instanceof Long S
            && new int[mx + 2] instanceof int[] cnt && new boolean[mx + 1] instanceof boolean[] comp
            && IntStream.rangeClosed(1, n).filter(i -> ++cnt[v[i]] > 0).count() >= 0
            && IntStream.range(1, mx).filter(i -> (cnt[mx - i] += cnt[mx - i + 1]) >= 0).count() >= 0
            && IntStream.rangeClosed(2, (int) Math.sqrt(mx)).filter(i -> comp[i] || IntStream.range(0, (mx - i * i) / i + 1).filter(t -> (comp[i * i + t * i] = true)).count() >= 0).count() >= 0
            && IntStream.rangeClosed(2, mx).filter(p -> !comp[p]).toArray() instanceof int[] pr
            && Integer.valueOf((int) IntStream.range(0, pr.length).filter(i -> (long) pr[i] * pr[i] <= mx).count()) instanceof Integer B && new long[pr.length] instanceof long[] nd
            && IntStream.range(0, B).parallel().filter(i -> (nd[i] = LongStream.iterate(pr[i], q -> q <= mx, q -> q * pr[i]).map(q -> IntStream.rangeClosed(1, (int) (mx / q)).mapToLong(t -> cnt[(int) (t * q)]).sum()).sum()) > 0).count() >= 0
            && (B >= pr.length || IntStream.rangeClosed(1, mx / pr[B]).allMatch(t -> Integer.valueOf(Arrays.binarySearch(pr, mx / t)) instanceof Integer r
                && IntStream.range(B, r >= 0 ? r + 1 : -r - 1).allMatch(i -> (nd[i] += cnt[t * pr[i]]) > 0)))
            && Long.valueOf(Math.max(1L, IntStream.range(0, pr.length).mapToLong(i -> nd[i] * (pr[i] - 1) + 1).max().orElse(1L))) instanceof Long L
            && IntStream.range(0, pr.length).filter(i -> nd[i] * pr[i] >= L).toArray() instanceof int[] cand
            && new long[]{L, Math.max(L, Math.min(S, IntStream.range(0, pr.length).mapToLong(i -> nd[i] * pr[i]).max().orElse(1L)))} instanceof long[] lh
            && (IntStream.iterate(0, z -> lh[0] < lh[1], z -> z + 1).allMatch(z -> Long.valueOf((lh[0] + lh[1]) / 2) instanceof Long mid
                && (Arrays.stream(cand).allMatch(i -> (pr[i] >= 1000 ? mid / pr[i] + mid / pr[i] / pr[i] + mid / pr[i] / pr[i] / pr[i] + mid / pr[i] / pr[i] / pr[i] / pr[i] : LongStream.iterate(mid / pr[i], t -> t > 0, t -> t / pr[i]).sum()) >= nd[i]) ? (lh[1] = mid) >= 0 : (lh[0] = mid + 1) >= 0)) || true)
            ? lh[0] : "");
    }
}
