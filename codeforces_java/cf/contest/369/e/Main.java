
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m && Integer.valueOf(1000000) instanceof Integer MX
            && new int[n] instanceof int[] sl && new int[n] instanceof int[] sr && new int[MX + 2] instanceof int[] cS && new int[n] instanceof int[] ordS
            && IntStream.range(0, n).filter(i -> (sl[i] = tok[2 + 2 * i]) > 0 & (sr[i] = tok[3 + 2 * i]) > 0 & ++cS[sr[i] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, MX + 1).filter(x -> (cS[x] += cS[x - 1]) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (ordS[cS[sr[i]]++] = i) >= 0).count() >= 0
            && Integer.valueOf(st[0] - 2 - 2 * n) instanceof Integer G
            && new int[G] instanceof int[] gl && new int[G] instanceof int[] gR && new int[G] instanceof int[] gq && new int[G] instanceof int[] ordG && new int[MX + 2] instanceof int[] cG && new int[]{0, 2 + 2 * n} instanceof int[] gc
            && IntStream.range(0, m).filter(qi -> Integer.valueOf(tok[gc[1]]) instanceof Integer cnt && Integer.valueOf(gc[1]) instanceof Integer base
                && IntStream.rangeClosed(0, cnt).filter(j -> Integer.valueOf(j == 0 ? 1 : tok[base + j] + 1) instanceof Integer L && Integer.valueOf(j == cnt ? MX : tok[base + j + 1] - 1) instanceof Integer R
                    && (L > R || (gl[gc[0]] = L) > 0 & (gR[gc[0]] = R) > 0 & (gq[gc[0]] = qi) >= 0 & ++cG[R + 1] > 0 & ++gc[0] > 0)).count() >= 0
                && (gc[1] += cnt + 1) > 0).count() >= 0
            && IntStream.rangeClosed(1, MX + 1).filter(x -> (cG[x] += cG[x - 1]) >= 0).count() >= 0
            && IntStream.range(0, gc[0]).filter(g -> (ordG[cG[gR[g]]++] = g) >= 0).count() >= 0
            && new int[MX + 2] instanceof int[] bit && new long[m] instanceof long[] ans && new int[]{0, 0, 0} instanceof int[] ptr && new IntUnaryOperator[2] instanceof IntUnaryOperator[] f
            && (f[0] = i -> i > MX ? 0 : ++bit[i] > 0 ? f[0].applyAsInt(i + (i & -i)) : 0) != null
            && (f[1] = i -> i <= 0 ? 0 : bit[i] + f[1].applyAsInt(i - (i & -i))) != null
            && IntStream.range(0, n + gc[0]).filter(e -> ptr[0] < n && (ptr[1] >= gc[0] || sr[ordS[ptr[0]]] <= gR[ordG[ptr[1]]])
                ? f[0].applyAsInt(sl[ordS[ptr[0]++]]) >= 0 & ++ptr[2] > 0
                : (ans[gq[ordG[ptr[1]]]] += ptr[2] - f[1].applyAsInt(gl[ordG[ptr[1]++]] - 1)) >= 0).count() >= 0
            ? Arrays.stream(ans).mapToObj(v -> String.valueOf(n - v)).collect(Collectors.joining("\n")) : "");
    }
}



