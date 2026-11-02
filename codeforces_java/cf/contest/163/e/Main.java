import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] rw
            && Arrays.copyOf(rw, rw.length + 1) instanceof byte[] raw && (raw[rw.length] = 10) == 10
            && (Integer) raw.length instanceof Integer len
            && IntStream.range(0, len).filter(i -> raw[i] > 32 && (i == 0 || raw[i - 1] <= 32)).toArray() instanceof int[] st
            && (Integer) IntStream.range(st[0], len).takeWhile(i -> raw[i] > 32).reduce(0, (a, i) -> a * 10 + raw[i] - 48) instanceof Integer nq
            && (Integer) IntStream.range(st[1], len).takeWhile(i -> raw[i] > 32).reduce(0, (a, i) -> a * 10 + raw[i] - 48) instanceof Integer k
            && (Integer) (Math.toIntExact(IntStream.range(0, st[k + 2]).filter(i -> raw[i] >= 97).count()) + 1) instanceof Integer maxN
            && new int[maxN * 26] instanceof int[] go && new int[k] instanceof int[] leaf && new int[4] instanceof int[] t
            && IntStream.range(st[2], st[k + 2]).filter(i -> raw[i] > 32
                ? (t[0] = go[t[0] * 26 + raw[i] - 97] > 0 ? go[t[0] * 26 + raw[i] - 97] : (go[t[0] * 26 + raw[i] - 97] = ++t[2])) >= 0
                : raw[i - 1] > 32 && (leaf[t[1]++] = t[0]) >= 0 && (t[0] = 0) == 0).count() >= 0
            && (Integer) (t[2] + 1) instanceof Integer N
            && new int[N] instanceof int[] qu && new int[N] instanceof int[] fail && new int[N] instanceof int[] sz && new int[N] instanceof int[] tin && new int[N] instanceof int[] nxt
            && IntStream.range(0, 26).filter(c -> go[c] > 0 && (fail[go[c]] = 0) == 0 && (qu[++t[3]] = go[c]) > 0).count() >= 0
            && ((IntBinaryOperator) (p, d) -> go[p] > 0 ? (fail[go[p]] = go[p + d]) * 0 + (qu[++t[3]] = go[p]) * 0 : (go[p] = go[p + d]) * 0) instanceof IntBinaryOperator step
            && IntStream.range(1, N).filter(x -> (Integer) (qu[x] * 26) instanceof Integer b && (Integer) (fail[qu[x]] * 26 - b) instanceof Integer d
                && step.applyAsInt(b + 0, d) + step.applyAsInt(b + 1, d) + step.applyAsInt(b + 2, d) + step.applyAsInt(b + 3, d) + step.applyAsInt(b + 4, d) + step.applyAsInt(b + 5, d) + step.applyAsInt(b + 6, d) + step.applyAsInt(b + 7, d) + step.applyAsInt(b + 8, d) + step.applyAsInt(b + 9, d) + step.applyAsInt(b + 10, d) + step.applyAsInt(b + 11, d) + step.applyAsInt(b + 12, d) + step.applyAsInt(b + 13, d) + step.applyAsInt(b + 14, d) + step.applyAsInt(b + 15, d) + step.applyAsInt(b + 16, d) + step.applyAsInt(b + 17, d) + step.applyAsInt(b + 18, d) + step.applyAsInt(b + 19, d) + step.applyAsInt(b + 20, d) + step.applyAsInt(b + 21, d) + step.applyAsInt(b + 22, d) + step.applyAsInt(b + 23, d) + step.applyAsInt(b + 24, d) + step.applyAsInt(b + 25, d) == 0).count() >= 0
            && IntStream.range(1, N).map(j -> sz[fail[qu[N - j]]] += sz[qu[N - j]] + 1).max().isPresent()
            && (tin[0] = 1) == 1 && (nxt[0] = 2) == 2
            && IntStream.range(1, N).map(i -> nxt[qu[i]] = (tin[qu[i]] = nxt[fail[qu[i]]]) + 1 + (nxt[fail[qu[i]]] += sz[qu[i]] + 1) * 0).max().isPresent()
            && new int[N + 3] instanceof int[] bit && new int[1] instanceof int[] c
            && IntStream.range(0, k).map(p -> bit[tin[leaf[p]]]++ + bit[tin[leaf[p]] + sz[leaf[p]] + 1]--).max().isPresent()
            && IntStream.range(1, N + 1).filter(i -> i + (i & -i) <= N + 2 && (bit[i + (i & -i)] += bit[i]) != Integer.MIN_VALUE).count() >= 0
            && ((IntBinaryOperator) (i0, val) -> (c[0] = i0) * 0 + (bit[c[0]] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), N + 2)] += val) * 0) instanceof IntBinaryOperator add
            && ((IntUnaryOperator) a0 -> (c[0] = a0) * 0 + bit[c[0]] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1]) instanceof IntUnaryOperator pre
            && ((IntBinaryOperator) (node, val) -> add.applyAsInt(tin[node], val) + add.applyAsInt(tin[node] + sz[node] + 1, -val)) instanceof IntBinaryOperator upd
            && new boolean[k] instanceof boolean[] on && IntStream.range(0, k).map(i -> (on[i] = true) ? 1 : 0).max().isPresent()
            && new long[nq + 1] instanceof long[] res && new long[1] instanceof long[] acc && new int[5] instanceof int[] w
            && IntStream.range(st[k + 2], len).filter(i -> raw[i] > 32
                ? raw[i - 1] <= 32
                    ? (w[0] = raw[i] == 63 ? 1 : 2) > 0 && (w[1] = raw[i] == 43 ? 1 : 0) >= 0 && (w[2] = 0) == 0 && (w[3] = 0) == 0 && (acc[0] = 0) == 0
                    : w[0] == 1
                        ? (w[3] = go[w[3] * 26 + raw[i] - 97]) >= 0 && (acc[0] += pre.applyAsInt(tin[w[3]])) >= 0
                        : (w[2] = w[2] * 10 + raw[i] - 48) >= 0
                : raw[i - 1] > 32 && (w[0] == 1
                    ? (res[w[4]++] = acc[0]) >= 0
                    : (w[1] == 1) == on[w[2] - 1] || ((on[w[2] - 1] = w[1] == 1) | true) && upd.applyAsInt(leaf[w[2] - 1], w[1] == 1 ? 1 : -1) * 0 == 0)).count() >= 0
            ? IntStream.range(0, w[4]).mapToObj(i -> Long.toString(res[i])).collect(Collectors.joining("\n")) : "");
    }
}
