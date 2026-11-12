
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] v && new int[buf.length / 2 + 3] instanceof int[] pp && new int[3] instanceof int[] ps
            && IntStream.range(0, buf.length + 1).filter(i -> i < buf.length && buf[i] >= '0'
                ? (ps[0] = ps[0] * 10 + buf[i] - '0') >= 0 && (ps[1] = 1) == 1
                : ps[1] == 1 && (v[ps[2]] = ps[0]) >= 0 && (ps[2] < 2 || (pp[ps[2] - 1] = (pp[ps[2] - 2] + ps[0]) % v[1]) >= 0) && ++ps[2] > 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0).count() >= 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer k && Arrays.copyOfRange(v, 2, 2 + n) instanceof int[] a && Arrays.copyOf(pp, n + 1) instanceof int[] p
            && new int[n] instanceof int[] ls && IntStream.range(0, n).map(i -> n).toArray() instanceof int[] rs && new int[n] instanceof int[] st && new int[2] instanceof int[] sp
            && IntStream.range(0, 2 * n).filter(s -> sp[1] < n && (sp[0] > 0 && a[st[sp[0] - 1]] < a[sp[1]] ? (rs[st[--sp[0]]] = sp[1]) >= 0 : (ls[sp[1]] = sp[0] == 0 ? -1 : st[sp[0] - 1]) > -2 && (st[sp[0]++] = sp[1]++) >= 0) || true).count() >= 0
            && new int[n] instanceof int[] lf && new int[n] instanceof int[] lo && new int[n] instanceof int[] len && new int[n] instanceof int[] cm && new int[2 * n] instanceof int[] tmv && new int[n + 3] instanceof int[] vs && new long[]{0} instanceof long[] tot
            && IntStream.range(0, n).filter(m -> (lf[m] = m - ls[m] <= rs[m] - m ? 1 : 0) >= 0 && (lo[m] = lf[m] == 1 ? ls[m] + 1 : m + 1) >= 0 && (len[m] = Math.min(m - ls[m], rs[m] - m)) > 0 && (tot[0] += len[m]) > 0
                && (cm[m] = lf[m] == 1 ? a[m] % k : (k - a[m] % k) % k) >= 0 && (tmv[m] = m + 1) > 0 && (tmv[m + n] = lf[m] == 1 ? rs[m] + 1 : ls[m] + 1) >= 0 && ++vs[m + 2] > 0 && ++vs[tmv[m + n] + 1] > 0).count() >= 0
            && IntStream.range(0, n + 2).filter(t -> (vs[t + 1] += vs[t]) >= 0).count() >= 0
            && vs.clone() instanceof int[] fl && new int[2 * n] instanceof int[] vlo && new int[2 * n] instanceof int[] vcm && new int[2 * n] instanceof int[] vlen && new int[2 * n] instanceof int[] vsg
            && IntStream.range(0, 2 * n).filter(j -> (Integer) (fl[tmv[j]]++) instanceof Integer q && (Integer) (j < n ? j : j - n) instanceof Integer m
                && (vlo[q] = lo[m]) >= 0 && (vcm[q] = cm[m]) >= 0 && (vlen[q] = len[m]) > 0 && (vsg[q] = (j < n ? lf[m] == 1 : lf[m] == 0) ? -1 : 1) != 0).count() >= 0
            && new int[k] instanceof int[] cnt && new long[]{0} instanceof long[] acc && new int[5] instanceof int[] sw
            && IntStream.range(0, (int) (2 * tot[0]) + n + 2).filter(s -> sw[0] <= n + 1 && (sw[1] < vs[sw[0] + 1]
                ? (sw[4] = p[vlo[sw[1]] + sw[2]] + vcm[sw[1]]) >= 0
                    && (acc[0] += vsg[sw[1]] * (long) cnt[sw[4] >= k ? sw[4] - k : sw[4]]) > Long.MIN_VALUE
                    && (++sw[2] < vlen[sw[1]] || (sw[2] = 0) == 0 && ++sw[1] > 0)
                : (sw[0] > n || ++cnt[p[sw[0]]] > 0) && ++sw[0] > 0) || true).count() >= 0
            ? String.valueOf(acc[0] - n) : "");
    }
}



