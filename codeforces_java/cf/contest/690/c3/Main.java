import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && new int[18 * n] instanceof int[] up
            && new int[n] instanceof int[] dep
            && new int[3] instanceof int[] s
            && ((IntBinaryOperator) (x, y) -> new int[]{dep[x] >= dep[y] ? x : y, dep[x] >= dep[y] ? y : x} instanceof int[] w
                && Integer.valueOf(dep[w[0]] - dep[w[1]]) instanceof Integer diff
                && IntStream.range(0, 18).allMatch(j -> ((diff >> j) & 1) == 0 || (w[0] = up[j * n + w[0]]) >= 0)
                ? (w[0] == w[1] ? w[0] : IntStream.range(0, 18).allMatch(t -> Integer.valueOf(17 - t) instanceof Integer j
                    && (up[j * n + w[0]] == up[j * n + w[1]] || ((w[0] = up[j * n + w[0]]) >= 0 && (w[1] = up[j * n + w[1]]) >= 0))) ? up[w[0]] : -1) : -1) instanceof IntBinaryOperator lca
            ? IntStream.range(1, n).mapToObj(k -> Integer.valueOf(Integer.parseInt(st.nextToken()) - 1) instanceof Integer p
                && (dep[k] = dep[p] + 1) > 0
                && (up[k] = p) >= 0
                && IntStream.range(1, 18).allMatch(j -> (up[j * n + k] = up[(j - 1) * n + up[(j - 1) * n + k]]) >= 0)
                && Integer.valueOf(dep[k] + dep[s[0]] - 2 * dep[lca.applyAsInt(k, s[0])]) instanceof Integer da
                && Integer.valueOf(dep[k] + dep[s[1]] - 2 * dep[lca.applyAsInt(k, s[1])]) instanceof Integer db
                && (Math.max(da, db) <= s[2] || (da >= db ? (s[1] = k) * 0 + (s[2] = da) : (s[0] = k) * 0 + (s[2] = db)) > 0)
                ? String.valueOf(s[2]) : "").collect(Collectors.joining(" ")) : "");
    }
}
