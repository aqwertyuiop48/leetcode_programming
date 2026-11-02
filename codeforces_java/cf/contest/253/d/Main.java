import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer r
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 1) * m + 1] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[26 * m + 1] instanceof int[] tree && new int[26] instanceof int[] st && new int[26] instanceof int[] ed
            && new int[7] instanceof int[] s && new long[1] instanceof long[] rr
            && ((IntPredicate) z -> s[0] < m && (s[3] == 0
                ? (s[2] += P[s[4] + s[0]] - P[s[5] + s[0]]) >= 0 && (g[s[6] + s[0]] == g[s[5] + s[0]] ? (s[3] = 1) > 0 : ++s[0] > 0)
                : s[3] == 1
                ? (s[2] > r ? (s[2] -= P[s[4] + s[1]] - P[s[5] + s[1]]) >= 0 && ++s[1] > 0
                    : (tree[(g[s[6] + s[0]] - 'a') * m + ed[g[s[6] + s[0]] - 'a']++] = s[0]) >= 0 && (s[3] = 2) > 0)
                : (s[1] < s[0] && st[g[s[6] + s[0]] - 'a'] < ed[g[s[6] + s[0]] - 'a'] && tree[(g[s[6] + s[0]] - 'a') * m + st[g[s[6] + s[0]] - 'a']] < s[1]
                    ? ++st[g[s[6] + s[0]] - 'a'] > 0
                    : (s[1] >= s[0] || (rr[0] += ed[g[s[6] + s[0]] - 'a'] - st[g[s[6] + s[0]] - 'a'] - 1) >= 0) && (s[3] = 0) == 0 && ++s[0] > 0))) instanceof IntPredicate step
            && Stream.of(0).peek(z0 -> IntStream.range(1, n).allMatch(b -> IntStream.range(0, b).allMatch(t -> IntStream.of(0)
                .peek(w -> Arrays.fill(st, 0)).peek(w -> Arrays.fill(ed, 0))
                .peek(w -> Arrays.setAll(s, ix -> ix == 0 ? 1 : ix == 2 ? P[(b + 1) * m] - P[t * m] : ix == 4 ? (b + 1) * m : ix == 5 ? t * m : ix == 6 ? b * m : 0))
                .filter(w -> g[b * m] == g[t * m] && (tree[(g[b * m] - 'a') * m + ed[g[b * m] - 'a']++] = 0) == 0)
                .count() >= 0 && (IntStream.range(0, 8 * m + 8).allMatch(step) || true)))).findFirst().isPresent()
            ? rr[0] : ""));
    }
}
