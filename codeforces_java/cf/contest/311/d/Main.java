import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n
            && new int[2 * n][] instanceof int[][] base && new int[1] instanceof int[] tmp
            && Stream.of(0).peek(z -> Arrays.setAll(base, i -> new int[48])).findFirst().isPresent() && new int[2 * n] instanceof int[] off && new int[2 * n] instanceof int[] lz
            && new int[2 * n] instanceof int[] lo && new int[2 * n] instanceof int[] hi && new int[2 * n] instanceof int[] rc && new int[2] instanceof int[] qr
            && new IntPredicate[4] instanceof IntPredicate[] fn && new IntToLongFunction[1] instanceof IntToLongFunction[] fq
            && ((IntBinaryOperator) (c, k) -> (off[c] = (off[c] + k) % 48) + (lz[c] = (lz[c] + k) % 48)) instanceof IntBinaryOperator apply
            && ((IntPredicate) node -> base[node + 1] instanceof int[] L && base[rc[node]] instanceof int[] R && Integer.valueOf(off[node + 1]) instanceof Integer o1 && Integer.valueOf(off[rc[node]]) instanceof Integer o2
                && Stream.of(0).peek(z -> Arrays.setAll(base[node], j -> (tmp[0] = L[j + o1 >= 48 ? j + o1 - 48 : j + o1] + R[j + o2 >= 48 ? j + o2 - 48 : j + o2]) >= 95542721 ? tmp[0] - 95542721 : tmp[0])).findFirst().isPresent()
                && (off[node] = 0) == 0) instanceof IntPredicate pull
            && ((IntPredicate) node -> lz[node] == 0 || (apply.applyAsInt(node + 1, lz[node]) >= 0 && apply.applyAsInt(rc[node], lz[node]) >= 0 && (lz[node] = 0) == 0)) instanceof IntPredicate push
            && (fn[0] = node -> lo[node] == hi[node]
                ? new long[] {nm[1 + lo[node]] % 95542721, 0} instanceof long[] v && Stream.of(0).peek(z -> Arrays.setAll(base[node], j -> (int) ((v[1] = v[0]) + 0 * (v[0] = v[0] * v[0] % 95542721 * v[0] % 95542721)))).findFirst().isPresent()
                : Integer.valueOf((lo[node] + hi[node]) / 2) instanceof Integer mid
                    && (rc[node] = node + 2 * (mid - lo[node] + 1)) > 0
                    && (lo[node + 1] = lo[node]) >= 0 && (hi[node + 1] = mid) >= 0 && (lo[rc[node]] = mid + 1) > 0 && (hi[rc[node]] = hi[node]) >= 0
                    && fn[0].test(node + 1) && fn[0].test(rc[node]) && pull.test(node)) instanceof IntPredicate
            && (fn[1] = node -> qr[0] <= lo[node] && hi[node] <= qr[1]
                ? apply.applyAsInt(node, 1) >= 0
                : push.test(node) && (qr[0] > hi[node + 1] || fn[1].test(node + 1)) && (qr[1] <= hi[node + 1] || fn[1].test(rc[node])) && pull.test(node)) instanceof IntPredicate
            && (fq[0] = node -> qr[0] <= lo[node] && hi[node] <= qr[1]
                ? (long) base[node][off[node]]
                : push.test(node) ? (qr[0] > hi[node + 1] ? 0L : fq[0].applyAsLong(node + 1)) + (qr[1] <= hi[node + 1] ? 0L : fq[0].applyAsLong(rc[node])) : 0L) instanceof IntToLongFunction
            && (hi[0] = n - 1) >= 0 && fn[0].test(0)
            ? IntStream.range(0, nm[1 + n]).mapToObj(i -> (qr[0] = nm[3 + n + 3 * i] - 1) >= 0 && (qr[1] = nm[4 + n + 3 * i] - 1) >= 0
                ? nm[2 + n + 3 * i] == 1 ? String.valueOf(fq[0].applyAsLong(0) % 95542721) : fn[1].test(0) ? (String) null : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}
