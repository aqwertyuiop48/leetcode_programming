import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] == '-' ? (ps[3] = 1) > 0 && (ps[2] = 1) > 0
                : i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) > -99999 && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && IntStream.range(0, n).map(i -> g0[1 + 2 * i]).toArray() instanceof int[] xs
            && IntStream.range(0, n).map(i -> g0[2 + 2 * i]).toArray() instanceof int[] ys
            && Integer.valueOf(n * (n - 1) / 2) instanceof Integer E
            && new int[40003] instanceof int[] cnt
            && new int[40003] instanceof int[] start
            && new int[40003] instanceof int[] ptr
            && new int[E] instanceof int[] codes
            && new int[1] instanceof int[] acc
            && IntStream.range(0, n).filter(i -> IntStream.range(i + 1, n)
                .filter(j -> cnt[Math.abs(xs[i] - xs[j]) + Math.abs(ys[i] - ys[j])]++ < 0).count() < 0).count() >= 0
            && IntStream.rangeClosed(0, 40001).filter(z -> (start[40001 - z] = acc[0]) < 0 || (ptr[40001 - z] = acc[0]) < 0
                || (acc[0] += cnt[40001 - z]) < 0).count() >= 0
            && IntStream.range(0, n).filter(i -> IntStream.range(i + 1, n)
                .filter(j -> (codes[ptr[Math.abs(xs[i] - xs[j]) + Math.abs(ys[i] - ys[j])]++] = i << 13 | j) < 0).count() < 0).count() >= 0
            && new int[n] instanceof int[] par
            && new int[n] instanceof int[] sz
            && new int[n] instanceof int[] pr
            && new int[2] instanceof int[] sc
            && new int[1] instanceof int[] cf
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh
            && (fh[0] = v -> par[v] == v ? v << 1 : fh[0].applyAsInt(par[v]) ^ pr[v]) != null
            && ((IntPredicate) code -> (sc[0] = fh[0].applyAsInt(code >> 13)) >= 0 && (sc[1] = fh[0].applyAsInt(code & 8191)) >= 0
                && (sc[0] >> 1 == sc[1] >> 1
                    ? (cf[0] = (sc[0] & 1) == (sc[1] & 1) ? code : cf[0]) < 0
                    : sz[sc[0] >> 1] >= sz[sc[1] >> 1]
                        ? (par[sc[1] >> 1] = sc[0] >> 1) >= 0 && (pr[sc[1] >> 1] = (sc[0] ^ sc[1] ^ 1) & 1) >= 0 && (sz[sc[0] >> 1] += sz[sc[1] >> 1]) > 0
                        : (par[sc[0] >> 1] = sc[1] >> 1) >= 0 && (pr[sc[0] >> 1] = (sc[0] ^ sc[1] ^ 1) & 1) >= 0 && (sz[sc[1] >> 1] += sz[sc[0] >> 1]) > 0)) instanceof IntPredicate uni
            && IntStream.range(0, n).filter(i -> (par[i] = i) < 0 || (sz[i] = 1) < 0 || (pr[i] = 0) < 0).count() >= 0
            && IntStream.range(0, start[0]).filter(e -> cf[0] == 0 && uni.test(codes[e]) && false).count() >= 0
            && Integer.valueOf(cf[0] == 0 ? 0 : Math.abs(xs[cf[0] >> 13] - xs[cf[0] & 8191]) + Math.abs(ys[cf[0] >> 13] - ys[cf[0] & 8191])) instanceof Integer w
            && IntStream.range(0, n).filter(i -> (par[i] = i) < 0 || (sz[i] = 1) < 0 || (pr[i] = 0) < 0).count() >= 0
            && Integer.valueOf((int) IntStream.range(0, start[w]).filter(e -> uni.test(codes[e])).count()) instanceof Integer merges
            ? w + "\n" + BigInteger.TWO.modPow(BigInteger.valueOf(n - merges), BigInteger.valueOf(1000000007)) : "");
    }
}

