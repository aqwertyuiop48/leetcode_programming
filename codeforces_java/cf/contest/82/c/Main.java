import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head
            && new int[2 * n + 2] instanceof int[] nxt
            && new int[2 * n + 2] instanceof int[] to
            && new int[2 * n + 2] instanceof int[] cw
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] pc
            && new int[n + 1] instanceof int[] order
            && new int[n + 1] instanceof int[] top
            && new int[]{1} instanceof int[] tl
            && IntStream.range(0, n - 1).filter(j -> (to[2 * j + 1] = g0[n + 2 + 3 * j]) > 0
                && (cw[2 * j + 1] = g0[n + 3 + 3 * j]) > 0 && (nxt[2 * j + 1] = head[g0[n + 1 + 3 * j]]) >= 0 && (head[g0[n + 1 + 3 * j]] = 2 * j + 1) > 0
                && (to[2 * j + 2] = g0[n + 1 + 3 * j]) > 0 && (cw[2 * j + 2] = g0[n + 3 + 3 * j]) > 0 && (nxt[2 * j + 2] = head[g0[n + 2 + 3 * j]]) >= 0
                && (head[g0[n + 2 + 3 * j]] = 2 * j + 2) > 0 && false).count() >= 0
            && (order[0] = 1) > 0
            && IntStream.range(0, n).filter(i -> i < tl[0]
                && IntStream.iterate(head[order[i]], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[order[i]]
                    && (par[to[e]] = order[i]) > 0 && (pc[to[e]] = cw[e]) > 0 && (order[tl[0]++] = to[e]) < 0).count() >= 0
                && false).count() >= 0
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingInt((Integer i) -> g0[i])).mapToInt(i -> i).toArray() instanceof int[] byRank
            && new int[n] instanceof int[] arr
            && new int[n + 1] instanceof int[] posOf
            && IntStream.range(0, n).filter(p -> (posOf[byRank[p]] = p) < 0).count() >= 0
            && IntStream.range(0, 3 * n + 12).toArray() instanceof int[] idn
            && new int[1][] instanceof int[][] ufh
            && new int[1][] instanceof int[][] usd
            && new int[n + 1][] instanceof int[][] lst
            && new int[1] instanceof int[] ds
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> ufh[0][x] == x ? x : (ufh[0][x] = fh[0].applyAsInt(ufh[0][x]))) != null
            && IntStream.range(0, n).filter(j -> Integer.valueOf(order[n - 1 - j]) instanceof Integer v
                && IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[v]).boxed()
                    .max(Comparator.comparingInt((Integer e) -> lst[to[e]].length)) instanceof Optional<Integer> ho
                && (lst[v] = ho.isEmpty() ? new int[]{posOf[v]}
                    : lst[to[ho.get()]] instanceof int[] hv
                        && IntStream.concat(IntStream.of(posOf[v]), IntStream.iterate(head[v], e -> e > 0, e -> nxt[e])
                            .filter(e -> to[e] != par[v] && e != ho.get()).flatMap(e -> Arrays.stream(lst[to[e]]))).sorted().toArray() instanceof int[] lt
                        && Arrays.stream(lt).map(x -> -Arrays.binarySearch(hv, x) - 1).toArray() instanceof int[] ip
                        ? IntStream.range(0, lt.length + 1).flatMap(i -> IntStream.concat(
                            Arrays.stream(hv, i == 0 ? 0 : ip[i - 1], i < lt.length ? ip[i] : hv.length),
                            i < lt.length ? IntStream.of(lt[i]) : IntStream.empty())).toArray()
                        : null) != null
                && IntStream.iterate(head[v], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[v] && (lst[to[e]] = null) != null).count() >= 0
                && (v == 1 || Integer.valueOf(pc[v]) instanceof Integer cap
                    && Integer.valueOf(top[v] + lst[v].length + 3) instanceof Integer lim
                    && (ufh[0] = Arrays.copyOf(idn, lim + 1)) != null
                    && (usd[0] = new int[lim + 1]) != null
                    && Arrays.stream(lst[v]).mapToLong(p -> (ds[0] = fh[0].applyAsInt(arr[p])) >= 0
                        && (++usd[0][ds[0]] < cap || (ufh[0][ds[0]] = ds[0] + 1) > 0)
                        && (arr[p] = ds[0] + 1) > 0
                        && (top[par[v]] = Math.max(top[par[v]], ds[0] + 1)) < 0 ? 1L : 0L).sum() >= 0)
                && false).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(arr[posOf[i]])).collect(Collectors.joining(" ")) : "");
    }
}
