import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 3] instanceof long[] a
            && new long[]{0, 0, 0} instanceof long[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : ps[1] == 1 ? (a[(int) ps[2]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0) >= 0).count() >= 0
            && (Integer) (int) a[0] instanceof Integer n
            && Arrays.copyOfRange(a, 1, n + 3) instanceof long[] x
            && new long[n + 2] instanceof long[] d
            && IntStream.range(1, n + 1).filter(i -> (d[i] = a[n + 2 + i]) >= 0).count() >= 0
            && new int[n + 3] instanceof int[] stk && new int[]{0} instanceof int[] sp && new long[n + 2] instanceof long[] rch && new int[n + 2] instanceof int[] vl
            && (rch[0] = Long.MAX_VALUE / 4) > 0 && (vl[0] = 1) > 0
            && IntStream.range(1, n + 1).filter(i -> IntStream.iterate(0, z -> rch[stk[sp[0]]] < x[i], z -> z + 1).filter(z -> --sp[0] >= -1).count() >= 0
                && ((rch[i] = x[stk[sp[0]]] + 2 * d[i]) > x[i] ? (stk[++sp[0]] = i) * 0 + (vl[i] = 1) : 0) >= 0).count() >= 0
            && IntStream.iterate(0, z -> rch[stk[sp[0]]] < x[n + 1], z -> z + 1).filter(z -> --sp[0] >= -1).count() >= 0
            && (Boolean) (sp[0] > 0) instanceof Boolean alive
            && new long[n + 2] instanceof long[] rl && new int[n + 2] instanceof int[] vr
            && (stk[0] = n + 1) > 0 && (sp[0] = 0) == 0 && (rl[n + 1] = -Long.MAX_VALUE / 4) < 0 && (vr[n + 1] = 1) > 0
            && IntStream.range(1, n + 1).map(i -> n + 1 - i).filter(j -> IntStream.iterate(0, z -> rl[stk[sp[0]]] > x[j], z -> z + 1).filter(z -> --sp[0] >= -1).count() >= 0
                && ((rl[j] = x[stk[sp[0]]] - 2 * d[j]) < x[j] ? (stk[++sp[0]] = j) * 0 + (vr[j] = 1) : 0) >= 0).count() >= 0
            && new int[n + 3] instanceof int[] ms && new int[]{-1} instanceof int[] mp && new long[]{Long.MAX_VALUE} instanceof long[] best
            && IntStream.range(1, n + 2).filter(j -> (vl[j - 1] == 1 ? IntStream.iterate(0, z -> mp[0] >= 0 && rch[ms[mp[0]]] <= rch[j - 1], z -> z + 1).filter(z -> --mp[0] >= -2).count() * 0 + (ms[++mp[0]] = j - 1) : 0) >= 0
                && (vr[j] == 1 ? new int[]{0, mp[0]} instanceof int[] st
                    && IntStream.range(0, 18).filter(z -> (st[rch[ms[(st[0] + st[1] + 1) >> 1]] >= rl[j] ? 0 : 1] = rch[ms[(st[0] + st[1] + 1) >> 1]] >= rl[j] ? (st[0] + st[1] + 1) >> 1 : ((st[0] + st[1] + 1) >> 1) - 1) >= -5).count() >= 0
                    && (best[0] = Math.min(best[0], x[j] - x[ms[st[0]]])) > 0 : true)).count() >= 0
            ? (alive ? "0" : best[0] / 2 + (best[0] % 2 == 1 ? ".5" : "")) : "");
    }
}
