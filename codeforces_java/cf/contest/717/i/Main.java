import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && new long[3][n] instanceof long[][] pa
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, 3).allMatch(c -> (pa[c][i] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE))
            && Integer.valueOf(tk.nextToken()) instanceof Integer m && new long[3][m] instanceof long[][] pb
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, 3).allMatch(c -> (pb[c][i] = Long.parseLong(tk.nextToken())) > Long.MIN_VALUE))
            && IntStream.range(0, 3).mapToLong(c -> IntStream.range(0, n).mapToLong(i -> (pa[(c + 1) % 3][i] - pa[(c + 1) % 3][(i + 1) % n]) * (pa[(c + 2) % 3][i] + pa[(c + 2) % 3][(i + 1) % n])).sum()).toArray() instanceof long[] nv
            && new int[m] instanceof int[] sg && new double[m] instanceof double[] sd
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, 3).mapToObj(c -> BigInteger.valueOf(nv[c]).multiply(BigInteger.valueOf(pb[c][i] - pa[c][0]))).reduce(BigInteger.ZERO, BigInteger::add) instanceof BigInteger sv
                && (sg[i] = sv.signum()) > -5 && (sd[i] = sv.doubleValue()) > -1e300)
            && Integer.valueOf(Math.abs(nv[0]) >= Math.abs(nv[1]) && Math.abs(nv[0]) >= Math.abs(nv[2]) ? 0 : Math.abs(nv[1]) >= Math.abs(nv[2]) ? 1 : 2) instanceof Integer ax
            && Integer.valueOf((ax + 1) % 3) instanceof Integer cu && Integer.valueOf((ax + 2) % 3) instanceof Integer cv
            && Boolean.valueOf(nv[ax] > 0) instanceof Boolean ccw
            && new long[n] instanceof long[] eu1 && new long[n] instanceof long[] ev1 && new long[n] instanceof long[] eu2 && new long[n] instanceof long[] ev2 && new boolean[n] instanceof boolean[] eup
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf((i + 1) % n) instanceof Integer j && ((eup[i] = pa[cv][j] > pa[cv][i])
                ? (eu1[i] = pa[cu][i]) > Long.MIN_VALUE && (ev1[i] = pa[cv][i]) > Long.MIN_VALUE && (eu2[i] = pa[cu][j]) > Long.MIN_VALUE && (ev2[i] = pa[cv][j]) > Long.MIN_VALUE
                : (eu1[i] = pa[cu][j]) > Long.MIN_VALUE && (ev1[i] = pa[cv][j]) > Long.MIN_VALUE && (eu2[i] = pa[cu][i]) > Long.MIN_VALUE && (ev2[i] = pa[cv][i]) > Long.MIN_VALUE))
            && IntStream.range(0, n).filter(i -> ev1[i] != ev2[i]).toArray() instanceof int[] ids
            && ids.length >= 0
            && Arrays.stream(ids).mapToLong(i -> ((ev1[i] + 2000000L) << 17) | i).sorted().mapToInt(k -> (int) (k & 131071L)).toArray() instanceof int[] insIds
            && Arrays.stream(ids).mapToLong(i -> ((ev2[i] + 2000000L) << 17) | i).sorted().mapToInt(k -> (int) (k & 131071L)).toArray() instanceof int[] remIds
            && IntStream.range(0, m).filter(i -> (sg[i] >= 0) != (sg[(i + 1) % m] >= 0)).toArray() instanceof int[] cr
            && new double[cr.length] instanceof double[] qu && new double[cr.length] instanceof double[] qv && new int[cr.length] instanceof int[] dr
            && IntStream.range(0, cr.length).allMatch(k -> Integer.valueOf(cr[k]) instanceof Integer i && Integer.valueOf((i + 1) % m) instanceof Integer j
                && (dr[k] = sg[i] >= 0 ? 1 : -1) != 0
                && IntStream.of(cu, cv).mapToDouble(c -> sg[i] == 0 ? pb[c][i] : sg[j] == 0 ? pb[c][j] : pb[c][i] + (pb[c][j] - pb[c][i]) * (sd[i] / (sd[i] - sd[j]))).toArray() instanceof double[] xy
                && (qu[k] = xy[0]) > -1e300 && (qv[k] = xy[1]) > -1e300)
            && IntStream.range(0, cr.length).boxed().sorted(Comparator.comparingDouble(k -> qv[k])).toArray(Integer[]::new) instanceof Integer[] qo
            && new double[4] instanceof double[] st && new int[2] instanceof int[] pp && new long[1] instanceof long[] tot
            && ((IntToDoubleFunction) a -> a < 0 ? st[2] : eu1[a] + (st[0] - ev1[a]) * (double) (eu2[a] - eu1[a]) / (ev2[a] - ev1[a])) instanceof IntToDoubleFunction xe
            && new TreeSet<Integer>((a, b) -> a.equals(b) ? 0
                : Double.valueOf(xe.applyAsDouble(a)) instanceof Double xa && Double.valueOf(xe.applyAsDouble(b)) instanceof Double xb
                ? (a < 0 || b < 0 ? (xa.equals(xb) ? (a < 0 ? -1 : 1) : Double.compare(xa, xb))
                    : Math.abs(xa - xb) > 1e-6 ? Double.compare(xa, xb)
                    : Long.valueOf((long) st[0]) instanceof Long lv
                    && Integer.valueOf(BigInteger.valueOf(eu1[a] * (ev2[a] - ev1[a]) + (lv - ev1[a]) * (eu2[a] - eu1[a])).multiply(BigInteger.valueOf(ev2[b] - ev1[b]))
                        .compareTo(BigInteger.valueOf(eu1[b] * (ev2[b] - ev1[b]) + (lv - ev1[b]) * (eu2[b] - eu1[b])).multiply(BigInteger.valueOf(ev2[a] - ev1[a])))) instanceof Integer c1
                    ? (c1 != 0 ? c1 : Integer.valueOf(Long.compare((eu2[a] - eu1[a]) * (ev2[b] - ev1[b]), (eu2[b] - eu1[b]) * (ev2[a] - ev1[a]))) instanceof Integer c2
                        ? (c2 != 0 ? (st[1] > 0 ? c2 : -c2) : Integer.compare(a, b)) : 0) : 0) : 0) instanceof TreeSet<Integer> set
            && IntStream.range(0, cr.length).allMatch(t -> Integer.valueOf(qo[t]) instanceof Integer k
                && (st[3] = qv[k]) > -1e300
                && IntStream.generate(() -> Long.valueOf(pp[0] < ids.length ? ev1[insIds[pp[0]]] : Long.MAX_VALUE) instanceof Long li
                    && Long.valueOf(pp[1] < ids.length ? ev2[remIds[pp[1]]] : Long.MAX_VALUE) instanceof Long lr
                    ? (lr <= st[3] && lr <= li ? ((st[0] = lr) > -1e300 && (st[1] = -1) < 0 && set.remove(remIds[pp[1]++]) || true ? 1 : 1)
                        : li <= st[3] ? ((st[0] = li) > -1e300 && (st[1] = 1) > 0 && set.add(insIds[pp[0]++]) || true ? 1 : 1) : 0) : 0).takeWhile(z -> z == 1).count() >= 0
                && (st[0] = qv[k]) > -1e300 && (st[2] = qu[k]) > -1e300
                && (set.higher(-1) instanceof Integer e && eup[e] == ccw ? (tot[0] += dr[k]) != 0 || true : true))
            ? (tot[0] != 0 ? "YES" : "NO") : "");
    }
}
