import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && sc.next() instanceof String str
            && Integer.valueOf(2 * n + 2) instanceof Integer MS && Integer.valueOf(2 * n * 21 + 10) instanceof Integer MN
            && new int[MS * 26] instanceof int[] nxt && new int[MS] instanceof int[] len && new int[MS] instanceof int[] link && new int[MS] instanceof int[] pos && new int[MS] instanceof int[] root
            && new int[MN] instanceof int[] lc && new int[MN] instanceof int[] rc && new int[]{0, 0} instanceof int[] cn && new int[]{0, 0, 0} instanceof int[] sv
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] f && new LongBinaryOperator[1] instanceof LongBinaryOperator[] qf
            && (f[0] = (l, r) -> Integer.valueOf(++cn[0]) instanceof Integer nd && (l == r || (sv[0] <= (l + r) / 2 ? (lc[nd] = f[0].applyAsInt(l, (l + r) / 2)) > 0 : (rc[nd] = f[0].applyAsInt((l + r) / 2 + 1, r)) > 0)) ? nd : 0) != null
            && (f[1] = (a, b) -> a == 0 ? b : b == 0 ? a : Integer.valueOf(++cn[0]) instanceof Integer c && (lc[c] = f[1].applyAsInt(lc[a], lc[b])) >= 0 && (rc[c] = f[1].applyAsInt(rc[a], rc[b])) >= 0 ? c : 0) != null
            && (qf[0] = (nd, lr) -> nd == 0 || (lr >> 18) > sv[2] || (lr & 262143) < sv[1] ? 0 : (lr >> 18) >= sv[1] && (lr & 262143) <= sv[2] ? 1
                : Math.max(qf[0].applyAsLong(lc[(int) nd], ((lr >> 18) << 18) | (((lr >> 18) + (lr & 262143)) / 2)), qf[0].applyAsLong(rc[(int) nd], ((((lr >> 18) + (lr & 262143)) / 2 + 1) << 18) | (lr & 262143)))) != null
            && (link[0] = -1) == -1 && new int[]{0, 0} instanceof int[] sm
            && IntStream.range(0, n).filter(i -> Integer.valueOf(str.charAt(i) - 97) instanceof Integer c && Integer.valueOf(++sm[0]) instanceof Integer cur && (len[cur] = len[sm[1]] + 1) > 0 && (pos[cur] = i) >= 0
                && (sv[0] = i) >= 0 && (root[cur] = f[0].applyAsInt(0, n - 1)) > 0 && new int[]{sm[1]} instanceof int[] pp
                && IntStream.iterate(sm[1], x -> x != -1 && nxt[x * 26 + c] == 0, x -> link[x]).filter(x -> (nxt[x * 26 + c] = cur) > 0 && (pp[0] = link[x]) >= -1).count() >= 0
                && ((pp[0] == -1 ? (link[cur] = 0) >= 0 : Integer.valueOf(nxt[pp[0] * 26 + c]) instanceof Integer q
                    && (len[pp[0]] + 1 == len[q] ? (link[cur] = q) > 0
                        : Integer.valueOf(++sm[0]) instanceof Integer cl && IntStream.range(0, 26).filter(j -> (nxt[cl * 26 + j] = nxt[q * 26 + j]) >= 0).count() >= 0 && (len[cl] = len[pp[0]] + 1) > 0 && (link[cl] = link[q]) >= 0 && (pos[cl] = pos[q]) >= 0
                            && IntStream.iterate(pp[0], x -> x != -1 && nxt[x * 26 + c] == q, x -> link[x]).filter(x -> (nxt[x * 26 + c] = cl) > 0).count() >= 0 && (link[q] = cl) > 0 && (link[cur] = cl) > 0)))
                && (sm[1] = cur) > 0).count() >= 0
            && Integer.valueOf(sm[0] + 1) instanceof Integer S && new int[n + 2] instanceof int[] cl2 && new int[S] instanceof int[] ord
            && IntStream.range(0, S).filter(v -> ++cl2[len[v]] > 0).count() >= 0
            && IntStream.range(1, n + 2).filter(i -> (cl2[i] += cl2[i - 1]) >= 0).count() >= 0
            && IntStream.range(0, S).filter(v -> (ord[--cl2[len[v]]] = v) >= 0).count() >= 0
            && IntStream.range(1, S).filter(i -> Integer.valueOf(ord[S - i]) instanceof Integer v && (root[link[v]] = f[1].applyAsInt(root[link[v]], root[v])) >= 0).count() >= 0
            && new int[S] instanceof int[] dp && new int[S] instanceof int[] top
            && IntStream.range(1, S).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && Integer.valueOf(link[v]) instanceof Integer p
                && (p == 0 ? (dp[v] = 1) > 0 && (top[v] = v) > 0
                    : Integer.valueOf(top[p]) instanceof Integer u && (sv[1] = pos[v] - len[v] + len[u]) > -100 && (sv[2] = pos[v] - 1) > -100
                        && (qf[0].applyAsLong(root[u], n - 1) == 0 ? (dp[v] = dp[u]) > 0 && (top[v] = u) > 0 : (dp[v] = dp[u] + 1) > 0 && (top[v] = v) > 0))).count() >= 0
            ? Arrays.stream(dp).max().getAsInt() : "");
    }
}
