import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry(new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in, new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new Scanner(io.getKey()) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> sc.next()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 1) * m] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[m + 1] instanceof int[] S && new int[m] instanceof int[] lt && new int[26] instanceof int[] cnt
            && new int[2] instanceof int[] s
            && new long[1] instanceof long[] rr
            && IntStream.range(0, n).allMatch(r1 -> IntStream.range(r1 + 1, n).allMatch(r2 ->
                IntStream.of(0).peek(z -> Arrays.setAll(S, c -> c == 0 ? 0 : S[c - 1] + P[(r2 + 1) * m + c - 1] - P[r1 * m + c - 1]))
                    .peek(z -> Arrays.setAll(lt, c -> g[r1 * m + c] == g[r2 * m + c] ? g[r1 * m + c] - 'a' : -1))
                    .peek(z -> Arrays.setAll(cnt, c -> 0)).peek(z -> Arrays.setAll(s, c -> 0)).sum() == 0
                && IntStream.range(0, 2 * m).allMatch(t -> s[1] < m
                    && (S[s[1] + 1] - S[s[0]] <= k
                        ? (lt[s[1]] < 0 || (rr[0] += cnt[lt[s[1]]]) >= 0 && ++cnt[lt[s[1]]] > 0) && ++s[1] > 0
                        : s[0] < s[1]
                            ? (lt[s[0]] < 0 || --cnt[lt[s[0]]] >= 0) && ++s[0] > 0
                            : ++s[0] > 0 && ++s[1] > 0)) | true))
            ? rr[0] : ""));
    }
}
