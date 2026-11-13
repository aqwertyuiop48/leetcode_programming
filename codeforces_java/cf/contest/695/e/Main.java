import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw
            && new int[b0.length / 2 + 2] instanceof int[] nums && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (st[3] = raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) * 0 : st[1] == 1 ? (nums[st[2]++] = st[0]) * 0 + (st[0] = 0) * 0 + (st[1] = 0) * 0 : 0) > 5).count() >= 0
            && new int[] {0} instanceof int[] ps && ((IntSupplier) () -> nums[ps[0]++]) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : ni.getAsInt()).toArray() instanceof int[] a
            && Integer.valueOf(ni.getAsInt()) instanceof Integer q && new int[q] instanceof int[] QL && new int[q] instanceof int[] QR
            && IntStream.range(0, q).filter(i -> (QL[i] = ni.getAsInt()) < 0 || (QR[i] = ni.getAsInt()) < 0).count() >= 0
            && Integer.valueOf(300) instanceof Integer TH && new int[100002] instanceof int[] cnt && new int[100002] instanceof int[] tot && new int[n + 305] instanceof int[] cc
            && IntStream.rangeClosed(1, n).filter(i -> tot[a[i]]++ < 0).count() >= 0
            && IntStream.rangeClosed(1, 100001).filter(v -> tot[v] > TH).toArray() instanceof int[] heavy
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(q)))) instanceof Integer Bm
            && IntStream.range(0, q).mapToLong(i -> ((long) (QL[i] / Bm) * (n + 1) + ((QL[i] / Bm & 1) == 0 ? QR[i] : n - QR[i])) << 17 | i).sorted().toArray() instanceof long[] keys
            && ((IntUnaryOperator) x -> cc[cnt[x]]-- + cnt[x]++ + cc[cnt[x]]++) instanceof IntUnaryOperator addf
            && ((IntUnaryOperator) x -> cc[cnt[x]]-- + cnt[x]-- + cc[cnt[x]]++) instanceof IntUnaryOperator remf
            && new int[] {1, 0} instanceof int[] cur && new int[TH + 1] instanceof int[] tmp && new int[n / TH + 20] instanceof int[] big && new int[n / TH + 20] instanceof int[] bq
            && new int[4] instanceof int[] r && new int[] {0} instanceof int[] left && new int[] {0} instanceof int[] bc && new long[1] instanceof long[] ansl && new int[3] instanceof int[] ms
            && ((IntSupplier) () -> ms[0] < bc[0] && (ms[1] >= ms[2] || big[ms[0]] <= bq[ms[1]]) ? big[ms[0]++] : bq[ms[1]++]) instanceof IntSupplier popf
            && new long[q] instanceof long[] res
            && Arrays.stream(keys).filter(key -> Integer.valueOf((int) (key & 131071)) instanceof Integer qi && Integer.valueOf(QL[qi]) instanceof Integer l && Integer.valueOf(QR[qi]) instanceof Integer rr
                && Stream.of(0).peek(z -> IntStream.range(l, cur[0]).forEach(i -> addf.applyAsInt(a[i]))).findFirst().isPresent() && (cur[0] = Math.min(cur[0], l)) > 0
                && Stream.of(0).peek(z -> IntStream.rangeClosed(cur[1] + 1, rr).forEach(i -> addf.applyAsInt(a[i]))).findFirst().isPresent() && (cur[1] = Math.max(cur[1], rr)) >= 0
                && Stream.of(0).peek(z -> IntStream.range(cur[0], l).forEach(i -> remf.applyAsInt(a[i]))).findFirst().isPresent() && (cur[0] = Math.max(cur[0], l)) > 0
                && Stream.of(0).peek(z -> IntStream.rangeClosed(rr + 1, cur[1]).forEach(i -> remf.applyAsInt(a[i]))).findFirst().isPresent() && (cur[1] = Math.min(cur[1], rr)) >= 0
                && (ansl[0] = 0) == 0 && (bc[0] = 0) == 0 && (left[0] = 0) == 0 && (ms[0] = 0) == 0 && (ms[1] = 0) == 0 && (ms[2] = 0) == 0
                && Arrays.stream(heavy).filter(v -> cnt[v] > TH && (big[bc[0]++] = cnt[v]) < 0).count() >= 0
                && IntStream.rangeClosed(1, TH).filter(f -> (r[0] = cc[f] + tmp[f]) > 0 && (tmp[f] = 0) == 0
                    && (left[0] != 0 ? (ansl[0] += left[0] + f) > 0 && (r[0]-- > 0) && (left[0] + f <= TH ? tmp[left[0] + f]++ >= 0 : (big[bc[0]++] = left[0] + f) >= 0) && (left[0] = 0) == 0 : true)
                    && (ansl[0] += (long) (r[0] / 2) * 2 * f) >= 0
                    && (r[0] < 2 || (2 * f <= TH ? (tmp[2 * f] += r[0] / 2) >= 0 : IntStream.range(0, r[0] / 2).filter(j -> (big[bc[0]++] = 2 * f) < 0).count() >= 0))
                    && ((r[0] & 1) == 1 ? (left[0] = f) > 0 : true)).count() >= 0
                && (left[0] == 0 || (big[bc[0]++] = left[0]) > 0)
                && Stream.of(0).peek(z -> Arrays.sort(big, 0, bc[0])).findFirst().isPresent()
                && IntStream.iterate(0, z -> (bc[0] - ms[0]) + (ms[2] - ms[1]) >= 2, z -> z + 1).filter(z -> Integer.valueOf(popf.getAsInt()) instanceof Integer x && Integer.valueOf(popf.getAsInt()) instanceof Integer y && (ansl[0] += x + y) > 0 && (bq[ms[2]++] = x + y) < 0).count() >= 0
                && (res[qi] = ansl[0]) >= 0).count() >= 0
            ? Arrays.stream(res).mapToObj(Long::toString).collect(Collectors.joining("\n")) : "");
    }
}
