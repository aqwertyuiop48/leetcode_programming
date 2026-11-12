import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && new StringTokenizer(L.get(0)) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m0
            && Integer.valueOf(m0 + 2) instanceof Integer w && Integer.valueOf((n + 2) * w) instanceof Integer N && Integer.valueOf(N * N) instanceof Integer S
            && new boolean[N] instanceof boolean[] wall && new int[3] instanceof int[] pos && new int[]{-w, w, -1, 1} instanceof int[] dl
            && IntStream.range(0, N).filter(x -> (wall[x] = true)).count() >= 0
            && IntStream.range(0, n * m0).filter(x -> Character.valueOf(L.get(1 + x / m0).charAt(x % m0)) instanceof Character ch && Integer.valueOf((x / m0 + 1) * w + x % m0 + 1) instanceof Integer cc
                && (wall[cc] = ch == 'X') == (ch == 'X') && ((ch == 'Y' ? (pos[0] = cc) : ch == 'B' ? (pos[1] = cc) : ch == 'T' ? (pos[2] = cc) : 0) >= 0)).count() >= 0
            && Integer.valueOf(pos[1] * N + pos[0]) instanceof Integer s0
            && new int[S] instanceof int[] tm && new int[S] instanceof int[] tl && new int[S] instanceof int[] par && new boolean[S] instanceof boolean[] done && new int[3][S] instanceof int[][] q
            && new int[]{0, 1, 0, 0, 0, 0, -1} instanceof int[] c && new int[4] instanceof int[] r
            && Stream.of(0).peek(z -> Arrays.fill(tl, -1)).findFirst().isPresent()
            && (q[0][0] = s0) >= 0 && (tl[s0] = 0) == 0 && (par[s0] = -1) == -1
            && IntStream.generate(() -> 0).takeWhile(z -> c[6] < 0 && c[1] > 0).filter(z ->
                IntStream.generate(() -> 0).takeWhile(y -> c[6] < 0 && (c[0] < c[1] || c[2] < c[3])).filter(y ->
                    (r[3] = (c[2] >= c[3] || (c[0] < c[1] && tm[q[c[5] & 1][c[0]]] <= tm[q[2][c[2]]])) ? q[c[5] & 1][c[0]++] : q[2][c[2]++]) >= 0
                    && !done[r[3]] && (done[r[3]] = true) && (r[0] = r[3] / N) >= 0 && (r[1] = r[3] % N) >= 0 && (r[2] = tm[r[3]]) >= 0
                    && (r[0] == pos[2] ? (c[6] = r[3]) >= 0
                        : IntStream.range(0, 4).filter(d -> ((!wall[r[1] + dl[d]] && r[1] + dl[d] != r[0] && !done[(r[0] * N + r[1] + dl[d])] && (tl[(r[0] * N + r[1] + dl[d])] != c[5] || tm[(r[0] * N + r[1] + dl[d])] > r[2] + 1) && (tl[(r[0] * N + r[1] + dl[d])] = c[5]) == c[5] && (tm[(r[0] * N + r[1] + dl[d])] = r[2] + 1) > 0 && (par[(r[0] * N + r[1] + dl[d])] = r[3]) >= 0 && (q[2][c[3]++] = (r[0] * N + r[1] + dl[d])) >= 0) || true)
                            && ((r[1] + dl[d] == r[0] && !wall[r[0] + dl[d]] && !done[((r[0] + dl[d]) * N + r[0])] && tl[((r[0] + dl[d]) * N + r[0])] != c[5] && tl[((r[0] + dl[d]) * N + r[0])] != c[5] + 1 && (tl[((r[0] + dl[d]) * N + r[0])] = c[5] + 1) > 0 && (tm[((r[0] + dl[d]) * N + r[0])] = r[2]) >= 0 && (par[((r[0] + dl[d]) * N + r[0])] = r[3]) >= 0 && (q[(c[5] + 1) & 1][c[4]++] = ((r[0] + dl[d]) * N + r[0])) >= 0) || true)).count() >= 0)).count() >= 0
                && (c[0] = 0) == 0 && (c[1] = c[4]) >= 0 && (c[4] = 0) == 0 && (c[2] = 0) == 0 && (c[3] = 0) == 0 && ++c[5] > 0).count() >= 0
            ? (c[6] < 0 ? "NO" : "YES\n" + new StringBuilder(IntStream.iterate(c[6], x -> x != s0, x -> par[x]).mapToObj(x -> String.valueOf(
                (x / N != par[x] / N ? Character.toUpperCase(x % N - par[x] % N == -w ? 'n' : x % N - par[x] % N == w ? 's' : x % N - par[x] % N == -1 ? 'w' : 'e')
                    : (x % N - par[x] % N == -w ? 'n' : x % N - par[x] % N == w ? 's' : x % N - par[x] % N == -1 ? 'w' : 'e')))).collect(Collectors.joining())).reverse()) : "");
    }
}
