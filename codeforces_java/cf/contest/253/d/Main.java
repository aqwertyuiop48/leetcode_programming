import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 1) * m] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[m + 1] instanceof int[] S && new int[m] instanceof int[] lt && new int[26] instanceof int[] cnt
            && new int[6] instanceof int[] s
            && new long[1] instanceof long[] rr
            && ((IntPredicate) st -> s[0] < m && (s[1] < s[0] && s[2] + P[s[5] + s[0]] - P[s[3] + s[0]] - S[s[1]] > k
                ? (lt[s[1]] < 0 || --cnt[lt[s[1]]] >= 0) && ++s[1] > 0
                : (S[s[0] + 1] = s[2] += P[s[5] + s[0]] - P[s[3] + s[0]]) >= 0
                    && ((lt[s[0]] = g[s[3] + s[0]] == g[s[4] + s[0]] ? g[s[3] + s[0]] - 'a' : -1) < 0 || (rr[0] += cnt[lt[s[0]]]++) >= 0)
                    && ++s[0] > 0)) instanceof IntPredicate step
            && Stream.of(0).peek(z -> IntStream.range(0, n).forEach(r1 -> IntStream.range(r1 + 1, n).forEach(r2 -> IntStream.of(0).peek(w -> Arrays.setAll(s, ix -> ix == 3 ? r1 * m : ix == 4 ? r2 * m : ix == 5 ? (r2 + 1) * m : 0)).peek(w -> Arrays.fill(cnt, 0)).forEach(w -> IntStream.range(0, 2 * m).forEach(st -> step.test(st)))))).findFirst().isPresent()
            ? rr[0] : ""));
    }
}

