import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Double.valueOf(tk[1]) instanceof Double a
            && IntStream.range(0, n).filter(i -> Math.hypot(tk[2 + 2 * i] - a, tk[3 + 2 * i]) > 0 && Math.hypot(tk[2 + 2 * i] + a, tk[3 + 2 * i]) > 0).toArray() instanceof int[] id
            && Integer.valueOf(id.length) instanceof Integer m
            && Arrays.stream(id).mapToDouble(i -> Math.hypot(tk[2 + 2 * i] - a, tk[3 + 2 * i])).toArray() instanceof double[] rr
            && Arrays.stream(id).mapToDouble(i -> Math.hypot(tk[2 + 2 * i] + a, tk[3 + 2 * i])).toArray() instanceof double[] dd
            && Arrays.stream(id).mapToDouble(i -> Math.atan2(tk[3 + 2 * i], tk[2 + 2 * i] + a)).toArray() instanceof double[] th
            && IntStream.range(0, m).mapToDouble(i -> Math.abs(dd[i] - rr[i])).toArray() instanceof double[] lo
            && IntStream.range(0, m).mapToDouble(i -> dd[i] + rr[i]).toArray() instanceof double[] hi
            && IntStream.range(0, m).mapToDouble(i -> dd[i] * dd[i] - rr[i] * rr[i]).toArray() instanceof double[] c2
            && IntStream.range(0, m).mapToDouble(i -> 0.5 / dd[i]).toArray() instanceof double[] inv
            && new long[2 * m + 2] instanceof long[] ks && new int[m + 1] instanceof int[] stk && new int[m + 1] instanceof int[] opn && new int[]{0} instanceof int[] ct
            && new double[]{0, 2 * a, 0, 0, 0, 0, 0} instanceof double[] lh
            && IntStream.range(0, 40).allMatch(it -> (lh[2] = (lh[0] + lh[1]) / 2) > 0 && (ct[0] = 0) == 0
                && IntStream.range(0, m).filter(i -> lh[2] >= lo[i] && lh[2] <= hi[i] && (lh[3] = (lh[2] * lh[2] + c2[i]) * inv[i] / lh[2]) > -1 && lh[3] < 1 && (lh[4] = Math.acos(lh[3])) >= 0 && (lh[5] = th[i] + lh[4]) > -100 && (lh[6] = th[i] - lh[4]) > -100
                    && (ks[ct[0]++] = ((long) ((lh[5] < 0 ? lh[5] + 6.283185307179586 : lh[5]) * 1099511627776.0) << 17) | i) >= 0
                    & (ks[ct[0]++] = ((long) ((lh[6] < 0 ? lh[6] + 6.283185307179586 : lh[6]) * 1099511627776.0) << 17) | i) >= 0).count() >= 0
                && Arrays.stream(ks, 0, ct[0]).sorted().toArray() instanceof long[] so && new int[]{0} instanceof int[] sp
                && Boolean.valueOf(IntStream.range(0, so.length).allMatch(j -> opn[(int) (so[j] & 131071L)] != it + 1
                    ? (opn[(int) (so[j] & 131071L)] = it + 1) > 0 && (stk[sp[0]++] = (int) (so[j] & 131071L)) >= 0 : sp[0] > 0 && stk[--sp[0]] == (int) (so[j] & 131071L))) instanceof Boolean ok
                && (ok ? (lh[0] = lh[2]) >= 0 : (lh[1] = lh[2]) >= 0))
            ? String.format("%.10f", lh[1]) : "");
    }
}
