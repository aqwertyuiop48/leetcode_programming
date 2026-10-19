import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> sc.next().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            && new int[n + 1][m] instanceof int[][] P
            && IntStream.range(0, n).allMatch(r -> IntStream.range(0, m).allMatch(c -> (P[r + 1][c] = P[r][c] + (g[r][c] == 'a' ? 1 : 0)) >= 0))
            && new int[m + 1] instanceof int[] S && new int[26] instanceof int[] cnt && new int[]{0, 0} instanceof int[] st && new long[]{0} instanceof long[] res
            ? IntStream.range(0, n).mapToLong(r1 -> IntStream.range(r1 + 1, n).mapToLong(r2 -> IntStream.range(0, 26).allMatch(i -> (cnt[i] = 0) == 0)
                && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (res[0] = 0) == 0
                && IntStream.range(0, m).allMatch(c -> (S[c + 1] = S[c] + P[r2 + 1][c] - P[r1][c]) >= 0)
                && IntStream.range(0, 2 * m).allMatch(t -> st[1] >= m || (S[st[1] + 1] - S[st[0]] > k
                    ? (st[0] < st[1] && g[r1][st[0]] == g[r2][st[0]] ? cnt[g[r1][st[0]] - 'a']-- : 0) >= 0 && ++st[0] > 0
                    : (g[r1][st[1]] == g[r2][st[1]] ? (res[0] += cnt[g[r1][st[1]] - 'a']) >= 0 && (st[0] > st[1] || ++cnt[g[r1][st[1]] - 'a'] > 0) : true) && ++st[1] > 0))
                ? res[0] : 0).sum()).sum() : "");
    }
}
