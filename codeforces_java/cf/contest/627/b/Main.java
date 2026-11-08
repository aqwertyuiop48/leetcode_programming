import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k && Integer.valueOf(tok[2]) instanceof Integer a && Integer.valueOf(tok[3]) instanceof Integer b && Integer.valueOf(tok[4]) instanceof Integer q
            && new long[n + 1] instanceof long[] fa && new long[n + 1] instanceof long[] fb && new int[n + 1] instanceof int[] o && new int[]{5} instanceof int[] ps && new long[]{0, 0, 0} instanceof long[] dl
            && new IntToLongFunction[2] instanceof IntToLongFunction[] qf && (qf[0] = i -> i <= 0 ? 0 : fa[i] + qf[0].applyAsLong(i - (i & -i))) != null && (qf[1] = i -> i <= 0 ? 0 : fb[i] + qf[1].applyAsLong(i - (i & -i))) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] uf && (uf[0] = i -> i > n ? 0 : (fa[i] += dl[0]) + (fb[i] += dl[1]) > Long.MIN_VALUE ? uf[0].applyAsInt(i + (i & -i)) : 0) != null
            ? IntStream.range(0, q).mapToObj(z -> Integer.valueOf(tok[ps[0]++]) instanceof Integer ty
                ? (ty == 1 ? Integer.valueOf(tok[ps[0]++]) instanceof Integer d && Integer.valueOf(tok[ps[0]++]) instanceof Integer c && Integer.valueOf(o[d]) instanceof Integer old && (o[d] += c) > 0
                    && (dl[0] = Math.min(a, o[d]) - Math.min(a, old)) >= 0 && (dl[1] = Math.min(b, o[d]) - Math.min(b, old)) >= 0 && (dl[2] += dl[0]) >= 0 && uf[0].applyAsInt(d) >= 0 ? "" : ""
                    : Integer.valueOf(tok[ps[0]++]) instanceof Integer p ? String.valueOf(qf[1].applyAsLong(p - 1) + dl[2] - qf[0].applyAsLong(Math.min(n, p + k - 1))) : "")
                : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
