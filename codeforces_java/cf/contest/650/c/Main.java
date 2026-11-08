import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n && Integer.valueOf((int) tk[1]) instanceof Integer m && Integer.valueOf(n * m) instanceof Integer N
            && IntStream.range(0, N).mapToLong(i -> (tk[2 + i] << 20) | i).sorted().toArray() instanceof long[] so
            && IntStream.range(0, N).filter(j -> j == 0 || (so[j] >> 20) != (so[j - 1] >> 20)).toArray() instanceof int[] gs
            && IntStream.range(0, N).map(j -> (int) (so[j] & 1048575L)).toArray() instanceof int[] cid
            && IntStream.range(0, N).map(j -> cid[j] / m).toArray() instanceof int[] rr
            && IntStream.range(0, N).map(j -> n + cid[j] % m).toArray() instanceof int[] cc
            && new int[n + m] instanceof int[] val && new int[N] instanceof int[] ans
            && new int[n + m] instanceof int[] stp && new int[n + m] instanceof int[] par && new int[n + m] instanceof int[] sz && new int[n + m] instanceof int[] comp
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] f && (f[0] = x -> par[x] == x ? x : (par[x] = f[0].applyAsInt(par[x]))) != null
            && IntStream.range(0, gs.length).filter(g -> IntStream.range(gs[g], g + 1 < gs.length ? gs[g + 1] : N).filter(j -> (stp[rr[j]] != g + 1 ? (stp[rr[j]] = g + 1) > 0 & (par[rr[j]] = rr[j]) >= 0 & (sz[rr[j]] = 1) > 0 & (comp[rr[j]] = 0) == 0 : true)
                    && (stp[cc[j]] != g + 1 ? (stp[cc[j]] = g + 1) > 0 & (par[cc[j]] = cc[j]) >= 0 & (sz[cc[j]] = 1) > 0 & (comp[cc[j]] = 0) == 0 : true)).count() >= 0
                && IntStream.range(gs[g], g + 1 < gs.length ? gs[g + 1] : N).filter(j -> Integer.valueOf(f[0].applyAsInt(rr[j])) instanceof Integer ra && Integer.valueOf(f[0].applyAsInt(cc[j])) instanceof Integer rb
                    && ra != rb && (sz[ra] < sz[rb] ? (par[ra] = rb) + (sz[rb] += sz[ra]) > 0 : (par[rb] = ra) + (sz[ra] += sz[rb]) > 0)).count() >= 0
                && IntStream.range(gs[g], g + 1 < gs.length ? gs[g + 1] : N).filter(j -> (comp[f[0].applyAsInt(rr[j])] = Math.max(comp[f[0].applyAsInt(rr[j])], Math.max(val[rr[j]], val[cc[j]]))) >= 0).count() >= 0
                && IntStream.range(gs[g], g + 1 < gs.length ? gs[g + 1] : N).filter(j -> (ans[cid[j]] = comp[f[0].applyAsInt(rr[j])] + 1) > 0 && (val[rr[j]] = Math.max(val[rr[j]], ans[cid[j]])) > 0 && (val[cc[j]] = Math.max(val[cc[j]], ans[cid[j]])) > 0).count() >= 0).count() >= 0
            ? IntStream.range(0, N).mapToObj(k -> ans[k] + (k + 1 == N ? "" : (k + 1) % m == 0 ? "\n" : " ")).collect(Collectors.joining()) : "");
    }
}
