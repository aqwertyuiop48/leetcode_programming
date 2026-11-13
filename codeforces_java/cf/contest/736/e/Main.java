import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (v[(int) st[3]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer m && Integer.valueOf((int) v[1]) instanceof Integer n
            && new int[n] instanceof int[] a && IntStream.range(0, n).allMatch(i -> (a[i] = (int) v[2 + i]) >= 0)
            && Long.valueOf(m.longValue() * (m - 1) - IntStream.of(a).asLongStream().sum()) instanceof Long R
            && (m - n == 0 ? R.longValue() == 0 : R.longValue() >= 0 && R.longValue() <= (long) (m - n) * a[n - 1])
            && new long[]{R.longValue() / Math.max(1, m - n), R.longValue() % Math.max(1, m - n)} instanceof long[] qr
            && new int[m] instanceof int[] t && IntStream.range(0, m).allMatch(i -> (t[i] = i < n ? a[i] : (int) (i - n < qr[1] ? qr[0] + 1 : qr[0])) >= 0)
            && IntStream.rangeClosed(1, m).allMatch(k -> IntStream.range(0, k).mapToLong(i -> t[i]).sum() <= 2L * k * m - (long) k * k - k)
            && new char[m * m] instanceof char[] res && IntStream.range(0, m).allMatch(i -> (res[i * m + i] = 'X') == 'X')
            && new int[m] instanceof int[] act && IntStream.range(0, m).allMatch(i -> (act[i] = 1) == 1)
            && IntStream.range(0, m - 1).allMatch(s -> IntStream.range(0, m).filter(i -> act[i] == 1).mapToLong(i -> (long) t[i] * 4096 + i).sorted().toArray() instanceof long[] ks
                && new int[]{(int) (ks[ks.length - 1] & 4095)} instanceof int[] vv
                && new int[]{2 * (ks.length - 1) - t[vv[0]]} instanceof int[] DD
                && new int[m] instanceof int[] dd
                && IntStream.iterate(ks.length - 2, p -> p >= 0, p -> p - 1).allMatch(p -> new int[]{(int) (ks[p] & 4095)} instanceof int[] ww
                    && 0 * ((DD[0] >= 2 && t[ww[0]] >= 2) ? (dd[ww[0]] = 2) + (DD[0] -= 2) : 0) == 0)
                && DD[0] >= 0
                && (DD[0] == 1
                    ? IntStream.iterate(ks.length - 2, p -> p >= 0, p -> p - 1).anyMatch(p -> new int[]{(int) (ks[p] & 4095)} instanceof int[] ww
                        && dd[ww[0]] == 0 && t[ww[0]] >= 1 && (dd[ww[0]] = 1) == 1 && (DD[0] = 0) == 0)
                    : DD[0] == 0)
                && IntStream.range(0, ks.length - 1).allMatch(q -> new int[]{(int) (ks[q] & 4095)} instanceof int[] ww
                    && 0 * ((res[vv[0] * m + ww[0]] = dd[ww[0]] == 2 ? 'L' : dd[ww[0]] == 1 ? 'D' : 'W')
                        + (res[ww[0] * m + vv[0]] = dd[ww[0]] == 2 ? 'W' : dd[ww[0]] == 1 ? 'D' : 'L')
                        + (t[ww[0]] -= dd[ww[0]])) == 0)
                && (t[vv[0]] = 0) == 0 && (act[vv[0]] = 0) == 0)
            && new StringBuilder() instanceof StringBuilder sb
            && sb.append("yes\n").length() > 0
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, m).allMatch(j -> sb.append(res[i * m + j]).length() > 0) && sb.append('\n').length() > 0)
            ? sb.toString().trim() : "no");
    }
}
