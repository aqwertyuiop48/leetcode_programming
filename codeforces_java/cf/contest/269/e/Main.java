import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length + 8] instanceof int[] vals && new int[3] instanceof int[] pr
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47 && raw[i] < 58)
                ? (pr[0] = pr[0] * 10 + raw[i] - 48) >= 0 && (pr[2] = 1) > 0
                : (pr[2] == 0 || ((vals[pr[1]++] = pr[0]) >= 0 && (pr[0] = 0) == 0 && (pr[2] = 0) == 0))
                    && (i >= raw.length || raw[i] < 65 || (vals[pr[1]++] = raw[i]) != 0))
            && Integer.valueOf(vals[0]) instanceof Integer n && Integer.valueOf(vals[1]) instanceof Integer m && Integer.valueOf(n + m) instanceof Integer N
            && ((IntBinaryOperator) (s, x) -> (s == 76 || s == 82 ? 0 : 2 * n) + 2 * (x - 1) + (s == 82 || s == 66 ? 1 : 0)) instanceof IntBinaryOperator pid
            && new int[2 * N] instanceof int[] partner && new int[16] instanceof int[] cnts
            && IntStream.range(0, N).allMatch(i -> Integer.valueOf(vals[2 + 4 * i]) instanceof Integer s1 && Integer.valueOf(vals[3 + 4 * i]) instanceof Integer s2
                && (partner[pid.applyAsInt(s1, vals[4 + 4 * i])] = pid.applyAsInt(s2, vals[5 + 4 * i])) >= 0 && (partner[pid.applyAsInt(s2, vals[5 + 4 * i])] = pid.applyAsInt(s1, vals[4 + 4 * i])) >= 0
                && Integer.valueOf(s1 == 76 ? 0 : s1 == 82 ? 1 : s1 == 84 ? 2 : 3) instanceof Integer u1 && Integer.valueOf(s2 == 76 ? 0 : s2 == 82 ? 1 : s2 == 84 ? 2 : 3) instanceof Integer u2
                && ++cnts[Math.min(u1, u2) * 4 + Math.max(u1, u2)] > 0)
            && Integer.valueOf(cnts[2]) instanceof Integer a && Integer.valueOf(cnts[6]) instanceof Integer b && Integer.valueOf(cnts[3]) instanceof Integer c
            && Integer.valueOf(cnts[7]) instanceof Integer d && Integer.valueOf(cnts[1]) instanceof Integer e && Integer.valueOf(cnts[11]) instanceof Integer f
            && (e == 0 || f == 0)
            && new int[2 * N] instanceof int[] ideal
            && ((IntBinaryOperator) (p, q) -> (ideal[p] = q) >= 0 && (ideal[q] = p) >= 0 ? 0 : 1) instanceof IntBinaryOperator link
            && IntStream.rangeClosed(1, a).allMatch(i -> link.applyAsInt(pid.applyAsInt(76, i), pid.applyAsInt(84, i)) == 0)
            && IntStream.rangeClosed(1, b).allMatch(i -> link.applyAsInt(pid.applyAsInt(82, i), pid.applyAsInt(84, m + 1 - i)) == 0)
            && IntStream.rangeClosed(1, c).allMatch(i -> link.applyAsInt(pid.applyAsInt(76, n + 1 - i), pid.applyAsInt(66, i)) == 0)
            && IntStream.rangeClosed(1, d).allMatch(i -> link.applyAsInt(pid.applyAsInt(82, n + 1 - i), pid.applyAsInt(66, m + 1 - i)) == 0)
            && IntStream.rangeClosed(1, e).allMatch(k -> link.applyAsInt(pid.applyAsInt(76, a + k), pid.applyAsInt(82, b + k)) == 0)
            && IntStream.rangeClosed(1, f).allMatch(k -> link.applyAsInt(pid.applyAsInt(84, a + k), pid.applyAsInt(66, c + k)) == 0)
            && ((Function<int[], Object[]>) pt -> new int[N] instanceof int[] seq && new int[N + 1] instanceof int[] cs && new int[N] instanceof int[] cycOf && new boolean[N] instanceof boolean[] vis
                && new int[]{-1, 0, 0, 0, 0} instanceof int[] stt
                && IntStream.iterate(0, t -> stt[1] < N || stt[0] >= 0, t -> t + 1).allMatch(t -> stt[0] < 0
                    ? Integer.valueOf(stt[1]++) instanceof Integer v && (v >= N || vis[v] || (stt[0] = 2 * v) >= 0 && (stt[4] = 2 * v) >= 0 && (cs[stt[3]++] = stt[2]) >= 0)
                    : (seq[stt[2]] = stt[0]) >= 0 && (cycOf[stt[2]] = stt[3] - 1) >= 0 && (vis[stt[0] / 2] = true)
                        && Integer.valueOf(stt[2] == cs[stt[3] - 1] ? pt[stt[4] + 1] : pt[stt[0] ^ 1]) instanceof Integer nx && ++stt[2] > 0 && (stt[0] = nx == stt[4] ? -1 : nx) > -2)
                && (cs[stt[3]] = N) == N && Integer.valueOf(stt[3]) instanceof Integer C
                && new int[N] instanceof int[] sf && new int[N] instanceof int[] rseq && new int[N] instanceof int[] sr
                && IntStream.range(0, N).allMatch(w -> (sf[w] = (seq[w] / 2 >= n ? 2 : 0) + (seq[w] & 1)) >= 0
                    && (rseq[w] = seq[cs[cycOf[w]] + cs[cycOf[w] + 1] - 1 - w] ^ 1) >= 0 && (sr[w] = (rseq[w] / 2 >= n ? 2 : 0) + (rseq[w] & 1)) >= 0)
                && ((Function<int[], int[]>) A -> new int[C] instanceof int[] rot && new int[4] instanceof int[] ms
                    && (ms[2] = 1) == 1
                    && IntStream.iterate(0, t -> ms[0] < C, t -> t + 1).allMatch(t -> Integer.valueOf(cs[ms[0]]) instanceof Integer s && Integer.valueOf(cs[ms[0] + 1] - cs[ms[0]]) instanceof Integer len
                        && (ms[1] < len && ms[2] < len && ms[3] < len
                            ? Integer.valueOf(A[s + (ms[1] + ms[3] >= len ? ms[1] + ms[3] - len : ms[1] + ms[3])]) instanceof Integer x
                                && Integer.valueOf(A[s + (ms[2] + ms[3] >= len ? ms[2] + ms[3] - len : ms[2] + ms[3])]) instanceof Integer y
                                && (x.equals(y) ? ++ms[3] > 0 : ((x > y ? (ms[1] += ms[3] + 1) : (ms[2] += ms[3] + 1)) > 0 && (ms[1] != ms[2] || ++ms[2] > 0) && (ms[3] = 0) == 0))
                            : (rot[ms[0]] = Math.min(ms[1], ms[2])) >= 0 && ++ms[0] > 0 && (ms[1] = 0) == 0 && (ms[2] = 1) == 1 && (ms[3] = 0) == 0))
                    ? rot : null) instanceof Function<int[], int[]> minRot
                && minRot.apply(sf) instanceof int[] rf && minRot.apply(sr) instanceof int[] rr
                && new boolean[C] instanceof boolean[] useRev && new int[2] instanceof int[] cm
                && IntStream.iterate(0, t -> cm[0] < C, t -> t + 1).allMatch(t -> Integer.valueOf(cs[cm[0]]) instanceof Integer s && Integer.valueOf(cs[cm[0] + 1] - cs[cm[0]]) instanceof Integer len
                    && (cm[1] < len
                        ? Integer.valueOf(sf[s + (rf[cm[0]] + cm[1] >= len ? rf[cm[0]] + cm[1] - len : rf[cm[0]] + cm[1])]) instanceof Integer x
                            && Integer.valueOf(sr[s + (rr[cm[0]] + cm[1] >= len ? rr[cm[0]] + cm[1] - len : rr[cm[0]] + cm[1])]) instanceof Integer y
                            && (x.equals(y) ? ++cm[1] > 0 : ((useRev[cm[0]] = y < x) || true) && ++cm[0] > 0 && (cm[1] = 0) == 0)
                        : ++cm[0] > 0 && (cm[1] = 0) == 0))
                && new char[N] instanceof char[] words && new int[N] instanceof int[] nodes
                && IntStream.range(0, N).allMatch(w -> Integer.valueOf(cycOf[w]) instanceof Integer cc && Integer.valueOf(cs[cc]) instanceof Integer s && Integer.valueOf(cs[cc + 1] - cs[cc]) instanceof Integer len
                    && Integer.valueOf(useRev[cc] ? rr[cc] + w - s : rf[cc] + w - s) instanceof Integer o && Integer.valueOf(s + (o >= len ? o - len : o)) instanceof Integer ix
                    && (words[w] = (char) (48 + (useRev[cc] ? sr[ix] : sf[ix]))) > 0 && (nodes[w] = (useRev[cc] ? rseq[ix] : seq[ix]) / 2) >= 0)
                ? new Object[]{cs, nodes, words, C, cycOf} : null) instanceof Function<int[], Object[]> analyze
            && analyze.apply(ideal) instanceof Object[] oi && analyze.apply(partner) instanceof Object[] og
            && (int[]) oi[0] instanceof int[] csI && (int[]) oi[1] instanceof int[] ndI && (char[]) oi[2] instanceof char[] wdI && Integer.valueOf((Integer) oi[3]) instanceof Integer CI
            && (int[]) og[0] instanceof int[] csG && (int[]) og[1] instanceof int[] ndG && (char[]) og[2] instanceof char[] wdG && Integer.valueOf((Integer) og[3]) instanceof Integer CG && (int[]) og[4] instanceof int[] cyG
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> head && new int[CI] instanceof int[] nxI && new int[CG] instanceof int[] mc
            && IntStream.range(0, CI).allMatch(cc -> Integer.valueOf(head.getOrDefault(new String(wdI, csI[cc], csI[cc + 1] - csI[cc]), -1)) instanceof Integer h0
                && (nxI[cc] = h0) >= -1 && (head.put(new String(wdI, csI[cc], csI[cc + 1] - csI[cc]), cc) == null || true))
            && IntStream.range(0, CG).allMatch(cc -> new String(wdG, csG[cc], csG[cc + 1] - csG[cc]) instanceof String key && head.get(key) instanceof Integer h1 && h1 >= 0
                && (mc[cc] = h1) >= 0 && (head.put(key, nxI[h1]) == null || true))
            && new int[n] instanceof int[] resR && new int[m] instanceof int[] resC
            && IntStream.range(0, N).allMatch(w -> Integer.valueOf(cyG[w]) instanceof Integer cg && Integer.valueOf(ndI[csI[mc[cg]] + w - csG[cg]]) instanceof Integer xx && Integer.valueOf(ndG[w]) instanceof Integer yy
                && (xx < n ? (resR[yy] = xx + 1) > 0 : (resC[yy - n] = xx - n + 1) > 0))
            ? Arrays.stream(resR).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n" + Arrays.stream(resC).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "No solution");
    }
}
