import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[6] instanceof int[] pz
            && Stream.of(0).peek(z1 -> {
                while (pz[0] <= raw.length && ((pz[0] > 0 && raw[pz[0] - 1] > 32 && (pz[0] == raw.length || raw[pz[0]] <= 32)) ? ++pz[1] > 0 : true) && ++pz[0] > 0) {}
            }).findFirst().isPresent()
            && new int[pz[1]] instanceof int[] a
            && Stream.of(0).peek(z1 -> {
                while (pz[2] <= raw.length && (pz[2] < raw.length && raw[pz[2]] > 32 ? (pz[3] = pz[3] * 10 + raw[pz[2]] - 48) >= 0 : !(pz[2] > 0 && raw[pz[2] - 1] > 32) || ((a[pz[4]++] = pz[3]) >= 0 && (pz[3] = 0) == 0)) && ++pz[2] > 0) {}
            }).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n
            && Integer.valueOf(a[1]) instanceof Integer m
            && Integer.valueOf(a[2]) instanceof Integer q
            && new int[6] instanceof int[] ms
            && (ms[0] = 3 + 2 * m) > 0
            && Stream.of(0).peek(z1 -> {
                while (ms[1] < q && (ms[2] = Math.max(ms[2], a[ms[0]])) >= 0 && (ms[3] = Math.max(ms[3], a[ms[0] + 1])) >= 0 && (ms[4] = Math.max(ms[4], a[ms[0]] + 2 * a[ms[0] + 1])) >= 0 && (ms[0] += 2 + a[ms[0]] + 2 * a[ms[0] + 1]) > 0 && ++ms[1] > 0) {}
            }).findFirst().isPresent()
            && Integer.valueOf(Math.max(m, n + ms[3]) + 2) instanceof Integer capE
            && new int[capE] instanceof int[] EU
            && new int[capE] instanceof int[] EV
            && new int[n + 2] instanceof int[] off
            && new int[n + 2] instanceof int[] pos
            && new int[2 * capE] instanceof int[] adjV
            && new int[2 * capE] instanceof int[] adjE
            && new int[n + 2] instanceof int[] par
            && new int[n + 2] instanceof int[] parE
            && new int[n + 2] instanceof int[] dep
            && new int[n + 2] instanceof int[] ord
            && new boolean[n + 2] instanceof boolean[] vis
            && new int[n + 2] instanceof int[] ds
            && new int[n + 2] instanceof int[] top
            && new int[n + 2] instanceof int[] sz
            && new int[n + 2] instanceof int[] lab
            && new int[2] instanceof int[] gv
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> ds[x] == x ? x : (ds[x] = fh[0].applyAsInt(ds[x]))) != null
            && fh[0] instanceof IntUnaryOperator find
            && ((Predicate<int[]>) k -> Stream.of(0).peek(z2 -> {
                while (k[0] < gv[0] + 2 && (off[k[0]] = 0) == 0 && ++k[0] > 0) {}
                while (k[1] < gv[1] && ++off[EU[k[1]] + 1] + ++off[EV[k[1]] + 1] > 0 && ++k[1] > 0) {}
                while (k[2] < gv[0] && (off[k[2] + 1] += off[k[2]]) >= 0 && ++k[2] > 0) {}
                while (k[3] < gv[0] && (pos[k[3]] = off[k[3]]) >= 0 && (par[k[3]] = -1) < 0 && (parE[k[3]] = -1) < 0 && (dep[k[3]] = 0) == 0 && !(vis[k[3]] = false) && (ds[k[3]] = k[3]) >= 0 && (top[k[3]] = k[3]) >= 0 && (sz[k[3]] = 1) > 0 && ++k[3] > 0) {}
                while (k[4] < gv[1] && (adjV[pos[EU[k[4]]]] = EV[k[4]]) >= 0 && (adjE[pos[EU[k[4]]]++] = k[4]) >= 0 && (adjV[pos[EV[k[4]]]] = EU[k[4]]) >= 0 && (adjE[pos[EV[k[4]]]++] = k[4]) >= 0 && ++k[4] > 0) {}
                while (k[7] < gv[0]) {
                    while (k[7] >= k[5] && k[6] < gv[0] && vis[k[6]] && ++k[6] > 0) {}
                    while (k[7] >= k[5] && k[6] < gv[0] && !vis[k[6]] && (vis[k[6]] = true) && (ord[k[5]++] = k[6]++) >= 0) {}
                    while (k[7] < k[5] && Integer.valueOf(ord[k[7]++]) instanceof Integer v && (k[8] = off[v]) >= 0) {
                        while (k[8] < off[v + 1] && (vis[adjV[k[8]]] || ((vis[adjV[k[8]]] = true) && (par[adjV[k[8]]] = v) >= -1 && (parE[adjV[k[8]]] = adjE[k[8]]) >= 0 && (dep[adjV[k[8]]] = dep[v] + 1) > 0 && (ord[k[5]++] = adjV[k[8]]) >= 0)) && ++k[8] > 0) {}
                    }
                }
                while (k[9] < gv[1] && Integer.valueOf(k[9]++) instanceof Integer c) {
                    while (parE[EU[c]] != c && parE[EV[c]] != c && Integer.valueOf(find.applyAsInt(EU[c])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(EV[c])) instanceof Integer rb && ra.intValue() != rb.intValue()
                        && Integer.valueOf(dep[top[ra]] >= dep[top[rb]] ? ra : rb) instanceof Integer x && Integer.valueOf(find.applyAsInt(par[top[x]])) instanceof Integer y
                        && (sz[x] < sz[y] ? (ds[x] = y) + (sz[y] += sz[x]) : (ds[y] = x) + (sz[x] += sz[y]) + (top[x] = top[y])) >= 0) {}
                }
                while (k[10] < gv[0] && (lab[k[10]] = find.applyAsInt(k[10])) >= 0 && ++k[10] > 0) {}
            }).findFirst().isPresent()) instanceof Predicate<int[]> ecc
            && new int[n + 2] instanceof int[] cidB
            && new int[n + 2] instanceof int[] cp
            && new int[n + 2] instanceof int[] cd
            && new int[n + 2] instanceof int[] csz
            && new int[n + 2] instanceof int[] tin
            && new int[n + 2] instanceof int[] nxt
            && new int[n + 2] instanceof int[] pdep
            && new int[n + 2] instanceof int[] ppar
            && new int[n + 2] instanceof int[] proot
            && new int[n + 2] instanceof int[] cid2
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n)) instanceof Integer K
            && new int[K][n + 2] instanceof int[][] sp
            && new int[16] instanceof int[] b
            && Stream.of(0).peek(z2 -> {
                while (b[0] < m && (EU[b[0]] = a[3 + 2 * b[0]] - 1) >= -1 && (EV[b[0]] = a[4 + 2 * b[0]] - 1) >= -1 && ++b[0] > 0) {}
                if ((gv[0] = n) > 0 && (gv[1] = m) >= 0 && ecc.test(new int[16])) {}
                while (b[1] < n && Integer.valueOf(ord[b[1]++]) instanceof Integer v
                    && (par[v] < 0 || lab[v] != lab[par[v]]
                        ? (cidB[v] = b[2]) >= 0 && (cp[b[2]++] = par[v] < 0 ? -1 : cidB[par[v]]) > -2
                        : (cidB[v] = cidB[par[v]]) >= 0)) {}
                while (b[3] < b[2] && (cd[b[3]] = cp[b[3]] < 0 ? 0 : cd[cp[b[3]]] + 1) >= 0 && ++b[3] > 0) {}
                while (b[4] < b[2] && (csz[b[4]] = 1) > 0 && ++b[4] > 0) {}
                while (b[5] < b[2] && Integer.valueOf(b[2] - 1 - b[5]++) instanceof Integer c && (cp[c] < 0 || (csz[cp[c]] += csz[c]) > 0)) {}
                while (b[6] < b[2] && (tin[b[6]] = cp[b[6]] < 0 ? (b[7] += csz[b[6]]) - csz[b[6]] : (nxt[cp[b[6]]] += csz[b[6]]) - csz[b[6]]) >= 0 && (nxt[b[6]] = tin[b[6]] + 1) > 0 && ++b[6] > 0) {}
                while (b[8] < b[2] && (pdep[tin[b[8]]] = cd[b[8]]) >= 0 && (ppar[tin[b[8]]] = cp[b[8]] < 0 ? -1 : tin[cp[b[8]]]) > -2 && (proot[tin[b[8]]] = cp[b[8]] < 0 ? tin[b[8]] : proot[tin[cp[b[8]]]]) >= 0 && ++b[8] > 0) {}
                while (b[9] < n && (cid2[b[9]] = tin[cidB[b[9]]]) >= 0 && ++b[9] > 0) {}
                while (b[10] < K && Integer.valueOf(b[10]++) instanceof Integer j && (b[11] = 0) == 0) {
                    while (b[11] < b[2] - (1 << j) + 1 && (sp[j][b[11]] = j == 0 ? b[11] : (pdep[sp[j - 1][b[11]]] <= pdep[sp[j - 1][b[11] + (1 << (j - 1))]] ? sp[j - 1][b[11]] : sp[j - 1][b[11] + (1 << (j - 1))])) >= 0 && ++b[11] > 0) {}
                }
            }).findFirst().isPresent()
            && ((IntBinaryOperator) (u, w) -> Integer.valueOf(31 - Integer.numberOfLeadingZeros(w - u)) instanceof Integer kk && Integer.valueOf(sp[kk][u + 1]) instanceof Integer x1 && Integer.valueOf(sp[kk][w - (1 << kk) + 1]) instanceof Integer y1
                ? ppar[pdep[x1] <= pdep[y1] ? x1 : y1] : -1) instanceof IntBinaryOperator lca
            && new int[Math.max(ms[4], 2 * Math.min(ms[4], n)) + 4] instanceof int[] KB
            && new int[ms[2] + 1] instanceof int[] sv
            && new int[2 * ms[3] + 1] instanceof int[] exy
            && new int[n + 2] instanceof int[] loc
            && new int[24] instanceof int[] qr
            && new int[]{3 + 2 * m} instanceof int[] ptr
            && new long[1] instanceof long[] rr
            && new StringBuilder() instanceof StringBuilder out
            && ((Predicate<int[]>) r -> Stream.of(0).peek(z2 -> {
                if (r[4] > 24) { if (Stream.of(0).peek(z3 -> Arrays.sort(KB, 0, r[4])).findFirst().isPresent()) {} }
                else if ((r[5] = 0) == 0) {
                    while (r[5] < r[4] && Integer.valueOf(r[5]++) instanceof Integer i && Integer.valueOf(KB[i]) instanceof Integer key && (r[6] = i - 1) >= -1) {
                        while (r[6] >= 0 && KB[r[6]] > key && (KB[r[6] + 1] = KB[r[6]]) >= 0 && --r[6] > -2) {}
                        while ((KB[r[6] + 1] = key) < 0) {}
                    }
                }
                if ((r[7] = 0) == 0 && (r[8] = 0) == 0) {}
                while (r[8] < r[4] && ((r[7] > 0 && KB[r[7] - 1] == KB[r[8]]) || (KB[r[7]++] = KB[r[8]]) >= 0) && ++r[8] > 0) {}
                if ((r[4] = r[7]) >= 0) {}
            }).findFirst().isPresent()) instanceof Predicate<int[]> sd
            && ((IntPredicate) qi -> Stream.of(0).peek(z2 -> {
                if (Integer.valueOf(a[ptr[0]]) instanceof Integer ni && Integer.valueOf(a[ptr[0] + 1]) instanceof Integer mi
                    && Integer.valueOf(ptr[0] + 2) instanceof Integer sb && Integer.valueOf(ptr[0] + 2 + ni) instanceof Integer eb && (ptr[0] = eb + 2 * mi) > 0
                    && (qr[1] = 0) == 0 && (qr[2] = 1) == 1) {
                    while (qr[1] < ni && (sv[qr[1]] = cid2[(int) ((a[sb + qr[1]] - 1 + rr[0]) % n)]) >= 0 && ++qr[1] > 0) {}
                    if ((qr[1] = 1) == 1) {}
                    while (qr[1] < ni && sv[qr[1]] == sv[0] && ++qr[1] > 0) {}
                    if (qr[1] < ni) {
                        if (mi == 0) { if ((qr[2] = 0) == 0) {} }
                        else {
                            if ((qr[3] = 0) == 0) {}
                            while (qr[3] < 2 * mi && (exy[qr[3]] = cid2[(int) ((a[eb + qr[3]] - 1 + rr[0]) % n)]) >= 0 && ++qr[3] > 0) {}
                            if ((qr[3] = 0) == 0) {}
                            while (qr[3] < ni && (KB[qr[3]] = sv[qr[3]]) >= 0 && ++qr[3] > 0) {}
                            if ((qr[3] = 0) == 0) {}
                            while (qr[3] < 2 * mi && (KB[ni + qr[3]] = exy[qr[3]]) >= 0 && ++qr[3] > 0) {}
                            if ((qr[4] = ni + 2 * mi) > 0 && sd.test(qr)) {}
                            if ((qr[9] = qr[4]) > 0 && (qr[3] = 0) == 0) {}
                            while (qr[3] < qr[9] - 1 && (KB[qr[9] + qr[3]] = proot[KB[qr[3]]] == proot[KB[qr[3] + 1]] ? lca.applyAsInt(KB[qr[3]], KB[qr[3] + 1]) : KB[qr[3]]) >= 0 && ++qr[3] > 0) {}
                            if ((qr[4] = 2 * qr[9] - 1) > 0 && sd.test(qr)) {}
                            if ((qr[3] = 0) == 0) {}
                            while (qr[3] < qr[4] && (loc[KB[qr[3]]] = qr[3]) >= 0 && ++qr[3] > 0) {}
                            if ((qr[10] = qr[4] - 1) >= 0 && (qr[3] = 0) == 0) {}
                            while (qr[3] < qr[10] && (EU[qr[3]] = proot[KB[qr[3]]] == proot[KB[qr[3] + 1]] ? loc[lca.applyAsInt(KB[qr[3]], KB[qr[3] + 1])] : qr[3] + 1) >= 0 && (EV[qr[3]] = qr[3] + 1) > 0 && ++qr[3] > 0) {}
                            if ((qr[3] = 0) == 0) {}
                            while (qr[3] < mi && (EU[qr[10] + qr[3]] = loc[exy[2 * qr[3]]]) >= 0 && (EV[qr[10] + qr[3]] = loc[exy[2 * qr[3] + 1]]) >= 0 && ++qr[3] > 0) {}
                            if ((gv[0] = qr[4]) > 0 && (gv[1] = qr[10] + mi) >= 0 && ecc.test(new int[16])) {}
                            if ((qr[3] = 1) == 1) {}
                            while (qr[3] < ni && lab[loc[sv[qr[3]]]] == lab[loc[sv[0]]] && ++qr[3] > 0) {}
                            if (qr[3] < ni && (qr[2] = 0) == 0) {}
                        }
                    }
                    if (qr[2] == 1) { if ((rr[0] = (rr[0] + qi) % n) >= 0 && out.append("YES\n") != null) {} }
                    else if (out.append("NO\n") != null) {}
                }
            }).findFirst().isPresent()) instanceof IntPredicate step
            && Stream.of(0).peek(z2 -> {
                while (qr[0] < q && step.test(++qr[0])) {}
            }).findFirst().isPresent()
            ? out : "");
    }
}
