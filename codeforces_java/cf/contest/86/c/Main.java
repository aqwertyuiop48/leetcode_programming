import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer m
            && new int[102][4] instanceof int[][] go
            && new int[102] instanceof int[] fail
            && new int[102] instanceof int[] best
            && new int[]{1} instanceof int[] sz
            && IntStream.range(0, m).allMatch(w -> s.next() instanceof String word
                && new int[]{0} instanceof int[] cur
                && word.chars().allMatch(ch -> (Integer) "ACGT".indexOf(ch) instanceof Integer c
                    && (cur[0] = go[cur[0]][c] == 0 ? (go[cur[0]][c] = sz[0]++) : go[cur[0]][c]) >= 0)
                && (best[cur[0]] = Math.max(best[cur[0]], word.length())) > 0)
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> q
            && IntStream.range(0, 4).map(c -> go[0][c]).filter(v -> v != 0).boxed().allMatch(q::add)
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.range(0, 4).allMatch(c -> go[u][c] != 0
                ? (fail[go[u][c]] = go[fail[u]][c]) >= 0 & (best[go[u][c]] = Math.max(best[go[u][c]], best[fail[go[u][c]]])) >= 0 & q.add(go[u][c])
                : (go[u][c] = go[fail[u]][c]) >= 0))
            && new long[n + 1][sz[0]][11] instanceof long[][][] dp
            && (dp[0][0][0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, sz[0]).allMatch(u -> IntStream.range(0, 11).allMatch(k -> dp[i][u][k] == 0
                || IntStream.range(0, 4).allMatch(c -> (Integer) go[u][c] instanceof Integer v
                    && (Integer) (best[v] >= k + 1 ? 0 : k + 1) instanceof Integer nk
                    && (nk > 10 || (dp[i + 1][v][nk] = (dp[i + 1][v][nk] + dp[i][u][k]) % 1000000009L) >= 0)))))
            ? IntStream.range(0, sz[0]).mapToLong(u -> dp[n][u][0]).sum() % 1000000009L
            : 0));
    }
}
