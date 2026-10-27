import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && (raw[r0.length] = 10) == 10
            && new long[raw.length / 2 + 8] instanceof long[] g
            && new long[3] instanceof long[] ps
            && IntStream.range(0, raw.length).allMatch(i ->
                raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : raw[i] >= 'a'
                        ? ps[2] != 0 || ((g[(int) ps[1]++] = raw[i] == 'a' ? -1 : -2) < 0 && (ps[2] = 2) > 0)
                        : (ps[2] != 1 || ((g[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf((int) g[0]) instanceof Integer h
            && Integer.valueOf((int) g[1]) instanceof Integer q
            && new int[(int) g[1] * (int) g[0] + 8] instanceof int[] lc
            && new int[lc.length] instanceof int[] rc
            && new long[lc.length] instanceof long[] sm
            && new int[]{0, 1, 1} instanceof int[] st
            && new double[1] instanceof double[] acc
            && new long[1] instanceof long[] mxs
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(2, (int) ps[1]).allMatch(i ->
                g[i] >= 0
                || (g[i] == -1
                    ? Integer.valueOf(63 - Long.numberOfLeadingZeros(g[i + 1])) instanceof Integer dep
                        && (st[0] = 1) == 1
                        && (sm[1] += g[i + 2]) >= 0
                        && IntStream.rangeClosed(1, dep).allMatch(k ->
                            ((g[i + 1] >> (dep - k) & 1) == 0
                                ? lc[st[0]] != 0 || (lc[st[0]] = ++st[1]) > 0
                                : rc[st[0]] != 0 || (rc[st[0]] = ++st[1]) > 0)
                            && (st[0] = (g[i + 1] >> (dep - k) & 1) == 0 ? lc[st[0]] : rc[st[0]]) > 0
                            && (sm[st[0]] += g[i + 2]) >= 0)
                    : (st[2] = 1) == 1
                        && (mxs[0] = 0) == 0
                        && (acc[0] = 0) == 0
                        && IntStream.range(0, h).allMatch(d ->
                            Long.valueOf(sm[lc[st[2]]]) instanceof Long sl
                            && Long.valueOf(sm[rc[st[2]]]) instanceof Long sr
                            && (acc[0] += (double) (1L << (h - d - 1)) * Math.max(mxs[0], sm[st[2]] - Math.min(sl, sr))) >= 0
                            && (mxs[0] = Math.max(mxs[0], sm[st[2]] - Math.max(sl, sr))) >= 0
                            && (st[2] = sl >= sr ? lc[st[2]] : rc[st[2]]) >= 0)
                        && (acc[0] += Math.max(mxs[0], sm[st[2]])) >= 0
                        && Double.valueOf(acc[0] / (double) (1L << h)) instanceof Double v
                        && sb.append((long) (double) v).append('.').append(String.valueOf(1000000 + (long) ((v - (long) (double) v) * 1e6)).substring(1)).append('\n') != null))
            ? sb
            : "");
    }
}

