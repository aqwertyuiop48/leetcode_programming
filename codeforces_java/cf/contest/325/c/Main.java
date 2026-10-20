import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Long.valueOf(314000000L) instanceof Long CAP
            && IntStream.range(0, m).mapToObj(i -> Integer.valueOf(rd.getAsInt() - 1) instanceof Integer ow && Integer.valueOf(rd.getAsInt()) instanceof Integer l
                ? IntStream.concat(IntStream.of(ow, l), IntStream.generate(rd).limit(l)).toArray() : null).toList() instanceof List<int[]> rl
            && rl.stream().mapToInt(a -> a[0]).toArray() instanceof int[] own
            && rl.stream().mapToInt(a -> a[1]).toArray() instanceof int[] len
            && rl.stream().mapToInt(a -> (int) IntStream.range(2, 2 + a[1]).filter(j -> a[j] == -1).count()).toArray() instanceof int[] d
            && IntStream.range(0, m).map(i -> len[i] - d[i]).toArray() instanceof int[] mc
            && new int[m + 1] instanceof int[] ms
            && IntStream.range(0, m).filter(i -> (ms[i + 1] = ms[i] + mc[i]) < 0).count() == 0
            && rl.stream().flatMapToInt(a -> IntStream.range(2, 2 + a[1]).filter(j -> a[j] != -1).map(j -> a[j] - 1)).toArray() instanceof int[] mon
            && new int[n + 2] instanceof int[] ocS && new int[n + 2] instanceof int[] rbS
            && IntStream.of(mon).filter(w -> ++ocS[w + 1] < 0).count() == 0 && IntStream.range(0, m).filter(i -> ++rbS[own[i] + 1] < 0).count() == 0
            && IntStream.range(0, n).filter(i -> (ocS[i + 1] += ocS[i]) + (rbS[i + 1] += rbS[i]) < 0).count() == 0
            && ocS.clone() instanceof int[] ocP && rbS.clone() instanceof int[] rbP && new int[mon.length + 1] instanceof int[] oc && new int[m + 1] instanceof int[] rb
            && IntStream.range(0, m).filter(i -> (rb[rbP[own[i]]++] = i) < 0 || IntStream.range(ms[i], ms[i + 1]).filter(t -> (oc[ocP[mon[t]]++] = i) < 0).count() > 0).count() == 0
            && new int[m] instanceof int[] rem && new long[m] instanceof long[] val && new long[n] instanceof long[] mn && new boolean[n] instanceof boolean[] fin
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && IntStream.range(0, m).filter(i -> (rem[i] = mc[i]) >= 0 && (val[i] = d[i]) >= 0 && mc[i] == 0 && pq.add((long) d[i] << 17 | own[i])).count() >= 0
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> Integer.valueOf((int) (e & 131071)) instanceof Integer v && !fin[v]
                && (fin[v] = true) && (mn[v] = Math.min(CAP, e >> 17)) >= 0
                && IntStream.range(ocS[v], ocS[v + 1]).filter(t -> Integer.valueOf(oc[t]) instanceof Integer r && (val[r] = Math.min(CAP, val[r] + mn[v])) >= 0
                    && --rem[r] == 0 && !fin[own[r]] && pq.add(val[r] << 17 | own[r])).count() >= 0).count() >= 0
            && new int[n + 1] instanceof int[] fS && new int[n + 1] instanceof int[] qS
            && IntStream.range(0, m).filter(r -> rem[r] == 0 && (fS[own[r] + 1] += mc[r]) >= 0 && IntStream.range(ms[r], ms[r + 1]).filter(t -> ++qS[mon[t] + 1] < 0).count() == 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (fS[i + 1] += fS[i]) + (qS[i + 1] += qS[i]) < 0).count() == 0
            && new int[fS[n] + 1] instanceof int[] fE && new int[fS[n] + 1] instanceof int[] qE && fS.clone() instanceof int[] fP && qS.clone() instanceof int[] qP
            && IntStream.range(0, m).filter(r -> rem[r] == 0 && IntStream.range(ms[r], ms[r + 1]).filter(t -> (fE[fP[own[r]]++] = mon[t]) < 0 || (qE[qP[mon[t]]++] = own[r]) < 0).count() > 0).count() == 0
            && new int[][][]{{fS, fE}, {qS, qE}} instanceof int[][][] gr
            && new boolean[n] instanceof boolean[] vis && new int[n] instanceof int[] stk && new int[n] instanceof int[] cu && new int[n] instanceof int[] order && new int[n] instanceof int[] comp
            && new int[4] instanceof int[] sv
            && ((IntBinaryOperator) (root, mode) -> (vis[root] = true) && (cu[root] = gr[mode - 1][0][root]) >= 0 && (stk[0] = root) >= 0 && (sv[0] = 1) > 0 && (comp[root] = sv[2]) >= 0
                && IntStream.iterate(0, t -> sv[0] > 0, t -> t + 1).filter(t -> Integer.valueOf(stk[sv[0] - 1]) instanceof Integer u
                    && (cu[u] < gr[mode - 1][0][u + 1]
                        ? Integer.valueOf(gr[mode - 1][1][cu[u]++]) instanceof Integer w && !vis[w] && (vis[w] = true) && (cu[w] = gr[mode - 1][0][w]) >= 0 && (comp[w] = sv[2]) >= 0 && (stk[sv[0]++] = w) >= 0 || true
                        : (sv[0]-- > 0) && (mode == 1 ? (order[sv[1]++] = u) >= 0 : true))).count() >= 0 ? 0 : 1) instanceof IntBinaryOperator dfs
            && IntStream.range(0, n).filter(v -> fin[v] && !vis[v] && dfs.applyAsInt(v, 1) == 0).count() >= 0
            && IntStream.range(0, n).filter(v -> !(vis[v] = false)).count() >= 0
            && IntStream.iterate(sv[1] - 1, i -> i >= 0, i -> i - 1).filter(i -> !vis[order[i]] && dfs.applyAsInt(order[i], 2) == 0 && ++sv[2] > 0).count() >= 0
            && Integer.valueOf(sv[2]) instanceof Integer cc
            && new int[cc + 1] instanceof int[] cs && new int[cc] instanceof int[] infc && new long[cc] instanceof long[] mv
            && IntStream.range(0, sv[1]).filter(i -> ++cs[comp[order[i]] + 1] < 0).count() == 0
            && IntStream.range(0, cc).filter(c -> (cs[c + 1] += cs[c]) < 0).count() == 0
            && cs.clone() instanceof int[] cp && new int[sv[1] + 1] instanceof int[] nbc
            && IntStream.range(0, sv[1]).filter(i -> (nbc[cp[comp[order[i]]]++] = order[i]) < 0).count() == 0
            && ((IntBinaryOperator) (r, c) -> IntStream.range(ms[r], ms[r + 1]).anyMatch(t -> comp[mon[t]] == c ? len[r] >= 2 : infc[comp[mon[t]]] == 1) ? 1 : 0) instanceof IntBinaryOperator rInf
            && ((ToLongBiFunction<Integer, Integer>) (r, c) -> mc[r] == 1 && d[r] == 0 && comp[mon[ms[r]]] == c ? -1L
                : Math.min(CAP, d[r] + IntStream.range(ms[r], ms[r + 1]).mapToLong(t -> mv[comp[mon[t]]]).sum())) instanceof ToLongBiFunction<Integer, Integer> rVal
            && IntStream.iterate(cc - 1, c -> c >= 0, c -> c - 1).filter(c ->
                (infc[c] = IntStream.range(cs[c], cs[c + 1]).map(i -> nbc[i]).anyMatch(v -> IntStream.range(rbS[v], rbS[v + 1]).map(t -> rb[t]).anyMatch(r -> rem[r] == 0 && rInf.applyAsInt(r, c) == 1)) ? 1 : 0) >= 0
                && (mv[c] = infc[c] == 1 ? 0 : IntStream.range(cs[c], cs[c + 1]).map(i -> nbc[i]).boxed().flatMap(v -> IntStream.range(rbS[v], rbS[v + 1]).map(t -> rb[t]).filter(r -> rem[r] == 0).boxed())
                    .mapToLong(r -> rVal.applyAsLong(r, c)).max().getAsLong()) < -5).count() == 0
            ? IntStream.range(0, n).mapToObj(v -> fin[v] ? mn[v] + " " + (infc[comp[v]] == 1 ? -2 : Math.min(CAP, mv[comp[v]])) : "-1 -1").collect(Collectors.joining("\n")) : "");
    }
}
