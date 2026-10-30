import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && (Integer) raw.length instanceof Integer len
            && new int[len * 26 + 52] instanceof int[] ch && new int[len + 2] instanceof int[] par && new int[len + 2] instanceof int[] dep
            && IntStream.range(0, len + 2).map(i -> -1).toArray() instanceof int[] ha && IntStream.range(0, len + 2).map(i -> -1).toArray() instanceof int[] ta && IntStream.range(0, len + 2).map(i -> -1).toArray() instanceof int[] hb && IntStream.range(0, len + 2).map(i -> -1).toArray() instanceof int[] tb
            && new int[]{0, 0, 0, 0, 0, 0, 0} instanceof int[] st && new long[1] instanceof long[] total
            && IntStream.range(0, len / 2 + 2).map(i -> -1).toArray() instanceof int[] nxtI
            && IntStream.range(0, len).filter(i -> raw[i] >= 97 ? (st[1] = 1) > 0 && (ch[st[0] * 26 + raw[i] - 97] > 0 || (ch[st[0] * 26 + raw[i] - 97] = ++st[4]) > 0 && (par[st[4]] = st[0]) >= 0 && (dep[st[4]] = dep[st[0]] + 1) > 0) && (st[0] = ch[st[0] * 26 + raw[i] - 97]) > 0
                : raw[i] >= 48 ? (st[3] = st[3] * 10 + raw[i] - 48) >= 0
                : st[1] == 1 && ((st[2] < st[3] ? (ha[st[0]] == -1 ? (ha[st[0]] = st[2]) >= 0 : (nxtI[ta[st[0]]] = st[2]) >= 0) && (ta[st[0]] = st[2]) >= 0
                    : (hb[st[0]] == -1 ? (hb[st[0]] = st[2]) >= 0 : (nxtI[tb[st[0]]] = st[2]) >= 0) && (tb[st[0]] = st[2]) >= 0) && st[2]++ >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0)).count() >= 0
            && (Integer) st[3] instanceof Integer n && new int[n] instanceof int[] pa && new int[n] instanceof int[] pb && new int[1] instanceof int[] pc
            && IntStream.iterate(st[4], v -> v >= 0, v -> v - 1).filter(v -> (ha[v] == -1 || hb[v] == -1 || IntStream.iterate(0, k -> ha[v] != -1 && hb[v] != -1, k -> k + 1)
                    .filter(k -> (pa[pc[0]] = ha[v]) >= 0 && (pb[pc[0]++] = hb[v] - n) >= 0 && (total[0] += dep[v]) >= 0 && (ha[v] = nxtI[ha[v]]) >= -1 && (hb[v] = nxtI[hb[v]]) >= -1).count() >= 0)
                && (v == 0 || ha[v] == -1 || (ha[par[v]] == -1 ? (ha[par[v]] = ha[v]) >= -1 : (nxtI[ta[par[v]]] = ha[v]) >= -1) && (ta[par[v]] = ta[v]) >= -1)
                && (v == 0 || hb[v] == -1 || (hb[par[v]] == -1 ? (hb[par[v]] = hb[v]) >= -1 : (nxtI[tb[par[v]]] = hb[v]) >= -1) && (tb[par[v]] = tb[v]) >= -1)).count() >= 0
            ? total[0] + "\n" + IntStream.range(0, n).mapToObj(i -> (pa[i] + 1) + " " + (pb[i] + 1)).collect(Collectors.joining("\n")) : "");
    }
}
