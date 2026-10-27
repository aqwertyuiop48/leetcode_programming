import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && Integer.valueOf(g0[2]) instanceof Integer k
            && IntStream.range(0, n).toArray() instanceof int[] par
            && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] sz
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = x -> par[x] == x ? x : (par[x] = fh[0].applyAsInt(par[x]))) != null
            && IntStream.range(0, m).filter(i ->
                (Integer) fh[0].applyAsInt(g0[3 + 2 * i] - 1) instanceof Integer ra
                && (Integer) fh[0].applyAsInt(g0[4 + 2 * i] - 1) instanceof Integer rb
                && (ra - rb == 0
                    || ((par[sz[ra] < sz[rb] ? ra : rb] = sz[ra] < sz[rb] ? rb : ra) >= 0
                        && (sz[sz[ra] < sz[rb] ? rb : ra] += sz[sz[ra] < sz[rb] ? ra : rb]) > 0))).count() >= 0
            && (Long) IntStream.range(0, n).filter(i -> par[i] == i).count() instanceof Long c
            && (Long) IntStream.range(0, n).filter(i -> par[i] == i).mapToLong(i -> Math.min(sz[i], k)).sum() instanceof Long cap
            ? Math.max(0L, k == 1 ? c - 2 : c - 1 - cap / 2)
            : 0L);
    }
}

