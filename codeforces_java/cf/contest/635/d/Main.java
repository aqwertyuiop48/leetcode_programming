import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k
            && Long.valueOf(v[2]) instanceof Long hi && Long.valueOf(v[3]) instanceof Long lo && Integer.valueOf(v[4]) instanceof Integer q
            && new long[n + 1] instanceof long[] fb && new long[n + 1] instanceof long[] fa && new long[n + 1] instanceof long[] o
            && new long[]{0, 0} instanceof long[] par && new long[]{0, 0, 0} instanceof long[] acc && new int[]{5} instanceof int[] ps
            && ((IntUnaryOperator) (j -> j > n ? j : (fb[j] += par[0]) + (fa[j] += par[1]) < Long.MIN_VALUE ? 0 : j + (j & -j))) instanceof IntUnaryOperator u1
            && u1.andThen(u1) instanceof IntUnaryOperator u2 && u2.andThen(u2) instanceof IntUnaryOperator u4
            && u4.andThen(u4) instanceof IntUnaryOperator u8 && u8.andThen(u8) instanceof IntUnaryOperator u16 && u16.andThen(u2) instanceof IntUnaryOperator upd
            && ((IntUnaryOperator) (j -> j > 0 ? (acc[0] += fb[j]) < Long.MIN_VALUE ? 0 : j - (j & -j) : 0)) instanceof IntUnaryOperator b1
            && b1.andThen(b1) instanceof IntUnaryOperator b2 && b2.andThen(b2) instanceof IntUnaryOperator b4
            && b4.andThen(b4) instanceof IntUnaryOperator b8 && b8.andThen(b8) instanceof IntUnaryOperator b16 && b16.andThen(b2) instanceof IntUnaryOperator preB
            && ((IntUnaryOperator) (j -> j > 0 ? (acc[1] += fa[j]) < Long.MIN_VALUE ? 0 : j - (j & -j) : 0)) instanceof IntUnaryOperator a1
            && a1.andThen(a1) instanceof IntUnaryOperator a2 && a2.andThen(a2) instanceof IntUnaryOperator a4
            && a4.andThen(a4) instanceof IntUnaryOperator a8 && a8.andThen(a8) instanceof IntUnaryOperator a16 && a16.andThen(a2) instanceof IntUnaryOperator preA
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(v[ps[0]]) instanceof Integer t && Integer.valueOf(v[ps[0] + 1]) instanceof Integer x
                && Integer.valueOf(t == 1 ? v[ps[0] + 2] : 0) instanceof Integer y
                && Integer.valueOf(ps[0] += t == 1 ? 3 : 2) instanceof Integer adv
                ? (t == 1
                    ? Long.valueOf((par[0] = Math.min(lo, o[x] + y) - Math.min(lo, o[x])) + (par[1] = Math.min(hi, o[x] + y) - Math.min(hi, o[x]))
                        + (acc[2] += par[1]) + upd.applyAsInt(x) + (o[x] += y)) == null ? "" : (String) null
                    : Long.valueOf((acc[0] = 0) + (acc[1] = 0) + preB.applyAsInt(x - 1) + preA.applyAsInt(Math.min(n, x + k - 1))) == null
                        ? "" : String.valueOf(acc[0] + acc[2] - acc[1]))
                : "").filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }
}
