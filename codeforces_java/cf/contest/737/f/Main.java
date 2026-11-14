import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer a
            && Integer.valueOf(tk.nextToken()) instanceof Integer b
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] p
            && new int[n + 2] instanceof int[] suf
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (suf[i] = Math.max(p[i], suf[i + 1])) < 0).count() == 0
            && new int[n + 2] instanceof int[] cU && new int[n + 2] instanceof int[] cD
            && IntStream.range(0, n - 1).filter(i -> (cU[i] = p[i] == p[i + 1] + 1 ? 1 + (i > 0 ? cU[i - 1] : 0) : 0) + (cD[i] = p[i] == p[i + 1] - 1 ? 1 + (i > 0 ? cD[i - 1] : 0) : 0) < 0).count() == 0
            && new ArrayList<int[]>() instanceof ArrayList<int[]> blocks && new ArrayList<int[]>() instanceof ArrayList<int[]> meta
            && blocks.add(new int[0]) && meta.add(new int[]{0, -1, 0})
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> fr
            && fr.get(0).add(0)
            && new boolean[n + 2] instanceof boolean[] asg
            && new int[n + 2] instanceof int[] pos && new int[n + 2] instanceof int[] cs
            && IntStream.range(0, n).filter(i -> (pos[p[i]] = i) < 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(v -> (cs[v] = v > 1 && pos[v] > pos[v - 1] ? cs[v - 1] : v) < 0).count() == 0
            && new int[n + 5] instanceof int[] ex
            && ((BiFunction<int[], int[], int[]>) (bl, ke) -> new int[]{bl.length, 0, 1, ke[1]} instanceof int[] R
                    && ((IntUnaryOperator) j -> j < R[0] ? bl[j] : ex[j - R[0]]) instanceof IntUnaryOperator g
                    && ((IntUnaryOperator) r -> R[1] >= r ? (R[1] -= r) : ((R[0] -= r - R[1]) + (R[1] = 0))) instanceof IntUnaryOperator pop
                    && ((IntUnaryOperator) x -> ex[R[1]++] = x) instanceof IntUnaryOperator push
                    && (IntStream.generate(() -> 0).allMatch(x -> R[3] >= ke[0] && R[2] > 0
                        && (Integer) p[R[3]] instanceof Integer z && (Integer) (R[0] + R[1]) instanceof Integer T
                        && (T == 0
                            ? push.applyAsInt(z << 13 | z << 1 | 1) >= 0 && --R[3] > -2
                            : (Integer) g.applyAsInt(T - 1) instanceof Integer top && (Integer) (top >> 13) instanceof Integer tl
                                && (Integer) ((top >> 1) & 4095) instanceof Integer th
                                && (z > th
                                    ? (z == th + 1
                                        ? (Integer) (R[3] > ke[0] ? Math.min(cU[R[3] - 1], R[3] - ke[0]) : 0) instanceof Integer c1
                                            && pop.applyAsInt(1) >= 0 && push.applyAsInt(tl << 13 | p[R[3] - c1] << 1) >= 0 && (R[3] -= c1 + 1) > -2
                                        : push.applyAsInt(z << 13 | z << 1 | 1) >= 0 && --R[3] > -2)
                                    : (top & 1) == 1 && z == tl - 1 && th - tl + 1 < b
                                        ? (Integer) (T >= 2 ? g.applyAsInt(T - 2) : 0) instanceof Integer sec
                                            && (Integer) (T >= 2 ? (sec >> 1) & 4095 : -5) instanceof Integer sh
                                            && (Integer) Math.min(Math.min(R[3] > ke[0] ? Math.min(cD[R[3] - 1], R[3] - ke[0]) : 0, b - (th - z + 1)), z - sh - 1) instanceof Integer c2
                                            && pop.applyAsInt(c2 == z - sh - 1 ? 2 : 1) >= 0
                                            && push.applyAsInt(c2 == z - sh - 1 ? (sec >> 13) << 13 | th << 1 : (z - c2) << 13 | th << 1 | 1) >= 0
                                            && (R[3] -= 1 + c2) > -2
                                        : (R[2] = 0) > 0))) || true)
                ? R : null) instanceof BiFunction<int[], int[], int[]> sim
            && new int[n + 2] instanceof int[] T0 && (T0[n] = 99999) > 0
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (T0[i] = Math.min(T0[i + 1], i + 1 < n && p[i] != p[i + 1] - 1 ? IntStream.range(i + 1, n).filter(j -> p[j] > p[i]).findFirst().orElse(n) : 99999)) < 0).count() == 0
            && IntStream.range(0, n).filter(k -> fr.get(k).stream().filter(sid -> blocks.get(sid) instanceof int[] bl
                && IntStream.rangeClosed(1, Math.min(a, n - k)).filter(L -> !asg[k + L]
                    && k + L - 1 < T0[k]
                    && sim.apply(bl, new int[]{k, k + L - 1}) instanceof int[] R
                    && R[2] > 0
                    && ((IntUnaryOperator) j -> j < R[0] ? bl[j] : ex[j - R[0]]) instanceof IntUnaryOperator g
                    && ((IntUnaryOperator) r -> R[1] >= r ? (R[1] -= r) : ((R[0] -= r - R[1]) + (R[1] = 0))) instanceof IntUnaryOperator pop
                    && ((IntUnaryOperator) x -> ex[R[1]++] = x) instanceof IntUnaryOperator push
                    && (Integer) suf[k + L] instanceof Integer s
                    && (IntStream.generate(() -> 0).allMatch(x -> R[1] > 0 && (ex[R[1] - 1] >> 13) > s && pop.applyAsInt(1) >= 0) || true)
                    && (R[1] > 0 || new int[]{0, R[0]} instanceof int[] Q
                        && (IntStream.generate(() -> 0).allMatch(x -> Q[0] < Q[1] && ((bl[(Q[0] + Q[1]) >>> 1] >> 13) > s
                            ? (Q[1] = (Q[0] + Q[1]) >>> 1) >= 0 : (Q[0] = ((Q[0] + Q[1]) >>> 1) + 1) >= 0)) || (R[0] = Q[0]) >= 0))
                    && (Integer) (k + L) instanceof Integer k2 && (Integer) (R[0] + R[1]) instanceof Integer tot
                    && !fr.get(k2).stream().anyMatch(o -> blocks.get(o) instanceof int[] ob
                        && IntStream.range(0, tot).filter(j -> (g.applyAsInt(j) & 1) == 1 && (ob[j] & 1) == 0).count() == 0)
                    && (fr.get(k2).removeIf(o -> blocks.get(o) instanceof int[] ob
                        && IntStream.range(0, tot).filter(j -> (ob[j] & 1) == 1 && (g.applyAsInt(j) & 1) == 0).count() == 0) || true)
                    && blocks.add(IntStream.range(0, tot).map(g).toArray())
                    && meta.add(new int[]{k, sid, L})
                    && fr.get(k2).add(blocks.size() - 1)
                    && (IntStream.range(0, tot).filter(j -> (g.applyAsInt(j) & 1) == 0 && (Integer) g.applyAsInt(j) instanceof Integer w
                        && ((w >> 1) & 4095) - (w >> 13) + 1 <= b
                        && IntStream.range(w >> 13, (w >> 1) & 4095).allMatch(v -> pos[v + 1] < pos[v] || pos[v + 1] - pos[Math.max(cs[v], w >> 13)] + 1 <= a)).count() > 0
                        || (asg[k2] = true))).count() >= 0).count() >= 0).count() >= 0
            && !fr.get(n).isEmpty()
            && IntStream.iterate(fr.get(n).get(0), q -> q != 0, q -> meta.get(q)[1]).map(q -> meta.get(q)[2]).toArray() instanceof int[] rv
            && new int[n + 1] instanceof int[] st && new int[]{0, 0} instanceof int[] W && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, rv.length).map(t -> rv[rv.length - 1 - t]).filter(L -> sb.append("1 ").append(L).append('\n') != null
                && IntStream.range(0, L).filter(i -> (st[W[0]++] = p[W[1] + L - 1 - i]) < 0).count() == 0
                && (W[1] += L) > 0
                && (IntStream.generate(() -> 0).allMatch(x -> W[0] > 0
                    && (Integer) IntStream.iterate(W[0] - 1, j -> j - 1).filter(j -> j == 0 || st[j - 1] != st[j] + 1).findFirst().getAsInt() instanceof Integer j0
                    && st[j0] > suf[W[1]] && sb.append("2 ").append(W[0] - j0).append('\n') != null && (W[0] = j0) >= 0) || true)).count() >= 0
            ? "YES\n" + sb.chars().filter(ch -> ch == 10).count() + "\n" + sb.toString().trim() : "NO");
    }
}
