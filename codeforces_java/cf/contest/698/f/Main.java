import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long M
            && new int[n + 2] instanceof int[] spf && new int[n + 2] instanceof int[] lp && new int[n + 2] instanceof int[] rad && new int[n + 2] instanceof int[] typ && new int[n + 2] instanceof int[] key
            && IntStream.rangeClosed(2, n).filter(i -> spf[i] == 0 && (spf[i] = i) > 0 && (long) i * i <= n && IntStream.iterate(i * i, j -> j <= n, j -> j + i).filter(j -> spf[j] == 0 && (spf[j] = i) > 0).count() >= 0).count() >= 0
            && (rad[1] = 1) == 1
            && IntStream.rangeClosed(2, n).filter(x -> (lp[x] = Math.max(spf[x], lp[x / spf[x]])) > 0 && (rad[x] = (x / spf[x]) % spf[x] == 0 ? rad[x / spf[x]] : rad[x / spf[x]] * spf[x]) > 0
                && (typ[x] = lp[x] == x && 2L * x > n ? 0 : (long) lp[x] * lp[x] > n ? 2 : 1) >= 0 && (key[x] = typ[x] == 2 ? lp[x] * rad[x / lp[x]] : rad[x]) > 0).count() >= 0
            && new int[n + 2] instanceof int[] cntS && new int[n + 2] instanceof int[] cntL && new int[n + 2] instanceof int[] fixS && new int[n + 2] instanceof int[] fixL && new int[n + 2] instanceof int[] gsz && new int[n + 2] instanceof int[] gf
            && new int[n + 2] instanceof int[] fTo && new int[n + 2] instanceof int[] fFrom && new int[]{1, 0, 0} instanceof int[] cu
            && IntStream.rangeClosed(2, n).filter(x -> typ[x] == 0 ? ++cu[0] > 0 : typ[x] == 1 ? ++cntS[key[x]] > 0 : ++cntL[key[x]] > 0 && (lp[x] != x || ++gsz[n / x] > 0)).count() >= 0
            && new long[n + 2] instanceof long[] fact && (fact[0] = 1) == 1 && IntStream.rangeClosed(1, n + 1).filter(i -> (fact[i] = fact[i - 1] * i % M) > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(i -> tok[i] != 0).allMatch(i -> Integer.valueOf(tok[i]) instanceof Integer v && typ[i] == typ[v]
                && (typ[i] == 0 ? ++cu[1] > 0
                    : typ[i] == 1 ? key[i] == key[v] && ++fixS[key[i]] > 0
                    : n / lp[i] == n / lp[v] && rad[i / lp[i]] == rad[v / lp[v]] && (fTo[lp[i]] == 0 || fTo[lp[i]] == lp[v]) && (fFrom[lp[v]] == 0 || fFrom[lp[v]] == lp[i])
                        && (fTo[lp[i]] != 0 || (fTo[lp[i]] = lp[v]) > 0 && (fFrom[lp[v]] = lp[i]) > 0 && ++gf[n / lp[i]] > 0) && ++fixL[key[i]] > 0))
            ? (new long[]{fact[cu[0] - cu[1]]} instanceof long[] acc
                && IntStream.rangeClosed(1, n).filter(r -> (cntS[r] == 0 || (acc[0] = acc[0] * fact[cntS[r] - fixS[r]] % M) > 0) && (cntL[r] == 0 || (acc[0] = acc[0] * fact[cntL[r] - fixL[r]] % M) > 0) && (gsz[r] == 0 || (acc[0] = acc[0] * fact[gsz[r] - gf[r]] % M) > 0)).count() >= 0
                ? acc[0] : "") : 0);
    }
}
