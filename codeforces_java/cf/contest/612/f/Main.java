import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer s
            && IntStream.range(0, n).mapToLong(i -> ((long) v[2 + i] << 11) | i).sorted().toArray() instanceof long[] key
            && new int[n + 1] instanceof int[] PP && (PP[0] = s - 1) >= 0 && IntStream.range(0, n).allMatch(j -> (PP[1 + j] = (int) (key[j] & 2047)) >= 0)
            && IntStream.concat(IntStream.of(0, 1), IntStream.concat(IntStream.range(1, n).filter(j -> key[j] >> 11 != key[j - 1] >> 11).map(j -> j + 1), IntStream.of(n + 1))).toArray() instanceof int[] bnd
            && Integer.valueOf(bnd.length - 2) instanceof Integer G && new int[n + 1] instanceof int[] D
            && ((IntBinaryOperator) (x, L) -> ((x - L) % n + n) % n) instanceof IntBinaryOperator of
            && IntStream.range(0, G).allMatch(g -> Integer.valueOf(bnd[g + 1]) instanceof Integer lo && Integer.valueOf(bnd[g + 2]) instanceof Integer hi && Integer.valueOf(bnd[g]) instanceof Integer plo
                && Integer.valueOf(hi - lo) instanceof Integer k
                && IntStream.range(lo, hi).allMatch(e -> (D[e] = 1000000000) > 0)
                && IntStream.range(lo, hi).allMatch(t -> Integer.valueOf(PP[t]) instanceof Integer L
                    && Integer.valueOf(of.applyAsInt(PP[lo + (t - lo + k - 1) % k], L)) instanceof Integer wp
                    && new int[]{1000000000, 1000000000, 1000000000, 1000000000} instanceof int[] M
                    && IntStream.range(plo, lo).allMatch(p -> Integer.valueOf(of.applyAsInt(PP[p], L)) instanceof Integer op
                        && (op <= wp
                            ? (M[0] = Math.min(M[0], D[p] + op)) >= 0 && (M[1] = Math.min(M[1], D[p] - op)) > -2000000000
                            : (M[2] = Math.min(M[2], D[p] + 3 * op)) >= 0 && (M[3] = Math.min(M[3], D[p] + op)) >= 0))
                    && IntStream.range(lo, hi).allMatch(e -> Integer.valueOf(of.applyAsInt(PP[e], L)) instanceof Integer oe
                        && (D[e] = Math.min(D[e], Math.min(Math.min(2 * wp + M[0] - oe, 2 * wp + M[1] + oe), Math.min(M[2] - oe, M[3] + oe)))) > -2000000000))
                && IntStream.range(plo, lo).allMatch(p -> Integer.valueOf(IntStream.range(lo, hi).map(e -> of.applyAsInt(PP[e], PP[p])).max().getAsInt()) instanceof Integer wP
                    && IntStream.range(lo, hi).allMatch(e -> (D[e] = Math.min(D[e], D[p] + 2 * wP - of.applyAsInt(PP[e], PP[p]))) > -2000000000)))
            && IntStream.range(bnd[G], bnd[G + 1]).boxed().min(Comparator.comparingInt(e -> D[e])).get() instanceof Integer eStar
            && new int[G] instanceof int[] cfgC && new int[G] instanceof int[] cfgE && new int[]{eStar} instanceof int[] cur
            && IntStream.range(0, G).map(r -> G - 1 - r).allMatch(g -> Integer.valueOf(bnd[g + 1]) instanceof Integer lo && Integer.valueOf(bnd[g + 2]) instanceof Integer hi && Integer.valueOf(bnd[g]) instanceof Integer plo
                && Integer.valueOf(hi - lo) instanceof Integer k && Integer.valueOf(cur[0]) instanceof Integer ee && (cfgE[g] = ee) > 0
                && IntStream.range(0, (lo - plo) * (k + 1) * 2).filter(c -> Integer.valueOf(plo + c / 2 / (k + 1)) instanceof Integer p && Integer.valueOf(c / 2 % (k + 1)) instanceof Integer ti
                    && Integer.valueOf(ti < k ? PP[lo + ti] : PP[p]) instanceof Integer L
                    && Integer.valueOf(of.applyAsInt(PP[p], L)) instanceof Integer op && Integer.valueOf(of.applyAsInt(PP[ee], L)) instanceof Integer oe
                    && Integer.valueOf(ti < k ? Math.max(of.applyAsInt(PP[lo + (ti + k - 1) % k], L), op) : IntStream.range(lo, hi).map(x -> of.applyAsInt(PP[x], PP[p])).max().getAsInt()) instanceof Integer W
                    && D[p] + (c % 2 == 0 ? op + 2 * W - oe : 2 * W - op + oe) == D[ee]).findFirst() instanceof OptionalInt c0
                && c0.isPresent() && (cfgC[g] = c0.getAsInt()) >= 0 && (cur[0] = plo + c0.getAsInt() / 2 / (k + 1)) >= 0)
            && new StringBuilder() instanceof StringBuilder sb && new int[]{s - 1} instanceof int[] prev
            && IntStream.range(0, G).allMatch(g -> Integer.valueOf(bnd[g + 1]) instanceof Integer lo && Integer.valueOf(bnd[g + 2]) instanceof Integer hi && Integer.valueOf(bnd[g]) instanceof Integer plo
                && Integer.valueOf(hi - lo) instanceof Integer k && Integer.valueOf(cfgC[g]) instanceof Integer c
                && Integer.valueOf(plo + c / 2 / (k + 1)) instanceof Integer p && Integer.valueOf(c / 2 % (k + 1)) instanceof Integer ti
                && Integer.valueOf(ti < k ? PP[lo + ti] : PP[p]) instanceof Integer L && Integer.valueOf(of.applyAsInt(PP[p], L)) instanceof Integer op
                && IntStream.range(lo, hi).mapToLong(x -> ((x == cfgE[g] ? 10000000L : (long) (c % 2 == 0 ? (of.applyAsInt(PP[x], L) <= op ? -of.applyAsInt(PP[x], L) : of.applyAsInt(PP[x], L)) : (of.applyAsInt(PP[x], L) >= op ? of.applyAsInt(PP[x], L) - 10000 : -of.applyAsInt(PP[x], L))) + 2000000L) << 12) | x)
                    .sorted().allMatch(w -> Integer.valueOf(of.applyAsInt(PP[(int) (w & 4095)], prev[0])) instanceof Integer d
                        && sb.append('\n').append(d <= n - d ? "+" + d : "-" + (n - d)) != null && (prev[0] = PP[(int) (w & 4095)]) >= 0))
            ? D[eStar] + "" + sb : "");
    }
}
