import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer q
            && new int[n + 2] instanceof int[] nx && new int[n + 2] instanceof int[] pv && new int[n + 2] instanceof int[] v
            && IntStream.rangeClosed(0, n + 1).allMatch(i -> (nx[i] = i + 1) > 0 && (pv[i] = i - 1) < n + 5 && (i < 1 || i > n || (v[i] = tk[2].charAt(i - 1) == '<' ? -1 : tk[2].charAt(i - 1) == '>' ? -2 : tk[2].charAt(i - 1) - '0') != 99))
            && new int[]{1, 1, 0, 0, 1} instanceof int[] S && new int[10] instanceof int[] cnt && new int[n + 2] instanceof int[] stk
            && new int[n + 2] instanceof int[] ft && new int[n + 2][] instanceof int[][] fs
            && IntStream.generate(() -> Integer.MAX_VALUE).limit(n + 2).toArray() instanceof int[] et && new int[n + 2][] instanceof int[][] es
            && (IntPredicate) (p -> (nx[pv[p]] = nx[p]) >= 0 && (pv[nx[p]] = pv[p]) >= 0) instanceof IntPredicate erase
            && (IntPredicate) (x -> x != S[4] || (ft[x] = S[2]) >= 0 && (fs[x] = cnt.clone()) != null && (stk[S[3]++] = x) > 0 && ++S[4] > 0) instanceof IntPredicate arrive
            && (IntPredicate) (x -> IntStream.iterate(0, z -> S[3] > 0 && stk[S[3] - 1] > x, z -> z + 1).allMatch(z -> (et[stk[S[3] - 1]] = S[2]) >= 0 && (es[stk[S[3] - 1]] = cnt.clone()) != null && --S[3] >= 0)) instanceof IntPredicate pop
            && (IntPredicate) (x -> (x >= S[0] || pop.test(x)) && (x > 0 ? (S[0] = x) > 0 : (S[0] = Math.min(S[4], n + 1)) > 0 && (S[1] = 1) > 0 && (pv[S[0]] = 0) == 0) && arrive.test(S[0])) instanceof IntPredicate move
            && (IntPredicate) (p -> ++S[2] > 0 && (v[p] >= 0
                ? ++cnt[v[p]] > 0 && Integer.valueOf(S[1] > 0 ? nx[p] : pv[p]) instanceof Integer q1 && (v[p] > 0 ? --v[p] >= 0 : erase.test(p)) && move.test(q1)
                : (S[1] = v[p] == -1 ? -1 : 1) != 0 && Integer.valueOf(S[1] > 0 ? nx[p] : pv[p]) instanceof Integer q2 && (!(q2 >= 1 && q2 <= n && v[q2] < 0) || erase.test(p)) && move.test(q2))) instanceof IntPredicate step
            && arrive.test(1)
            && IntStream.iterate(0, z -> S[0] >= 1 && S[0] <= n, z -> z + 1).allMatch(z -> step.test(S[0]))
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(tk[3 + 2 * i]) instanceof Integer l && Integer.valueOf(tk[4 + 2 * i]) instanceof Integer r
                && (ft[r + 1] <= et[l] ? fs[r + 1] : es[l]) instanceof int[] e
                ? IntStream.range(0, 10).mapToObj(d -> String.valueOf(e[d] - fs[l][d])).collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n")) : "");
    }
}
