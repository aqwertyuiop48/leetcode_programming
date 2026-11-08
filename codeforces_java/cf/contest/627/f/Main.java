import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && IntStream.range(0, n).map(i -> tok[1 + i]).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> tok[1 + n + i]).toArray() instanceof int[] b
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr
            && IntStream.range(0, n - 1).filter(j -> Integer.valueOf(tok[2 * n + 1 + 2 * j] - 1) instanceof Integer u && Integer.valueOf(tok[2 * n + 2 + 2 * j] - 1) instanceof Integer w
                && ++deg[u] > 0 & ++deg[w] > 0 & (xr[u] ^= w) >= 0 & (xr[w] ^= u) >= 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, n).filter(i -> a[i] == 0).findFirst().getAsInt()) instanceof Integer s && Integer.valueOf(IntStream.range(0, n).filter(i -> b[i] == 0).findFirst().getAsInt()) instanceof Integer t
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[n] instanceof int[] dep && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).filter(v -> v != t && deg[v] == 1 && (ord[tail[0]++] = v) >= 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && Integer.valueOf(xr[v]) instanceof Integer p && (par[v] = p) >= 0 & (xr[p] ^= v) >= 0 & (--deg[p] != 1 || p - t == 0 || (ord[tail[0]++] = p) >= 0)).count() >= 0
            && (par[t] = -1) < 0
            && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).filter(i -> (dep[ord[i]] = dep[par[ord[i]]] + 1) > 0).count() >= 0
            && a.clone() instanceof int[] ap && IntStream.iterate(s, v -> v != t, v -> par[v]).filter(v -> (ap[v] = a[par[v]]) < 0).count() == 0 && (ap[t] = 0) == 0
            && new boolean[n] instanceof boolean[] inD && Long.valueOf(IntStream.range(0, n).filter(v -> inD[v] = ap[v] != b[v]).count()) instanceof Long cntD
            ? (cntD == 0 ? "0 " + dep[s]
                : new int[n] instanceof int[] dcnt && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] dch
                    && IntStream.range(0, n).filter(v -> inD[v] && inD[par[v]] && ++dcnt[par[v]] > 0 & (dch[par[v]] = v) >= 0).count() >= 0
                    && IntStream.range(0, n).allMatch(v -> dcnt[v] <= 1)
                    && IntStream.range(0, n).filter(v -> inD[v] && !inD[par[v]]).toArray() instanceof int[] tops && tops.length >= 1 && tops.length <= 2 && (tops.length == 1 || par[tops[0]] == par[tops[1]])
                    && Integer.valueOf(par[tops[0]]) instanceof Integer c0
                    && IntStream.iterate(tops[0], v -> v >= 0, v -> dch[v]).toArray() instanceof int[] ch1
                    && (tops.length == 1 ? new int[0] : IntStream.iterate(tops[1], v -> v >= 0, v -> dch[v]).toArray()) instanceof int[] ch2
                    && IntStream.concat(IntStream.of(ch1), IntStream.range(0, ch2.length).map(i -> ch2[ch2.length - 1 - i])).toArray() instanceof int[] A
                    && Integer.valueOf(A.length) instanceof Integer M && M >= 2 && M == cntD.intValue()
                    && IntStream.range(0, M).map(i -> A[M - 1 - i]).toArray() instanceof int[] RA
                    && IntStream.iterate(s, v -> v >= 0, v -> par[v]).filter(v -> inD[v] || v == c0).findFirst() instanceof OptionalInt fu
                    && Boolean.valueOf(!fu.isPresent() || fu.getAsInt() == c0) instanceof Boolean caseA
                    && new boolean[n] instanceof boolean[] onS && IntStream.iterate(s, v -> v >= 0, v -> par[v]).filter(v -> onS[v] = true).count() > 0
                    && Integer.valueOf(caseA ? (fu.isPresent() ? dep[s] - dep[c0] : dep[s] + dep[c0] - 2 * dep[IntStream.iterate(c0, v -> v >= 0, v -> par[v]).filter(v -> onS[v]).findFirst().getAsInt()]) : dep[s] - dep[fu.getAsInt()]) instanceof Integer alen
                    && Integer.valueOf(caseA ? 0 : dep[fu.getAsInt()] - dep[c0]) instanceof Integer dl
                    && (caseA || tops.length == 2 && IntStream.of(ch1).noneMatch(v -> v == fu.getAsInt()) ? A : RA) instanceof int[] Q
                    && Integer.valueOf(IntStream.range(0, M).filter(i -> ap[Q[i]] == b[Q[0]]).findFirst().orElse(-1)) instanceof Integer j && j > 0
                    && IntStream.range(0, M).allMatch(i -> b[Q[i]] == ap[Q[(i + j) % M]])
                    ? Long.valueOf(caseA ? (long) alen + dep[c0] + (long) (M + 1) * Math.min(j, M - j) : Math.min((long) alen + dep[c0] + dl + (long) j * (M + 1), (long) alen + dep[c0] + (long) (M - j) * (M + 1) - dl)) instanceof Long cost
                        ? (Math.min(ch1[ch1.length - 1], tops.length == 2 ? ch2[ch2.length - 1] : c0) + 1) + " " + (Math.max(ch1[ch1.length - 1], tops.length == 2 ? ch2[ch2.length - 1] : c0) + 1) + " " + cost : "-1"
                    : "-1") : "");
    }
}
