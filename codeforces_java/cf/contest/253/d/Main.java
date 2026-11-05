import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new StringTokenizer(new String(io.getKey())) instanceof StringTokenizer sc
            && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer m && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer r
            && IntStream.range(0, n).mapToObj(i -> sc.nextToken()).collect(Collectors.joining()).getBytes() instanceof byte[] g
            && new int[(n + 2) * m + 1] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(i -> (P[i + m] = P[i] + (g[i] == 'a' ? 1 : 0)) >= 0)
            && new int[55] instanceof int[] A && new long[1] instanceof long[] rr
            && IntStream.range(1, n).allMatch(b -> IntStream.range(0, b).allMatch(t -> IntStream.range(0, 55).filter(w -> (A[w] = w == 54 ? P[(b + 1) * m] - P[t * m] : 0) < 0).count() == 0
                && (IntStream.range(0, 2 * m + 2).allMatch(z -> A[54] > r
                    ? (A[54] -= P[(b + 1) * m + A[53]] - P[t * m + A[53]]) >= 0 && (g[b * m + A[53]] != g[t * m + A[53]] || ++A[26 + g[t * m + A[53]] - 'a'] > 0) && ++A[53] > 0
                    : (g[b * m + A[52]] != g[t * m + A[52]] || ((rr[0] += Math.max(0, A[g[t * m + A[52]] - 'a'] - A[26 + g[t * m + A[52]] - 'a'])) >= 0 && ++A[g[t * m + A[52]] - 'a'] > 0))
                        && ++A[52] < m && (A[54] += P[(b + 1) * m + A[52]] - P[t * m + A[52]]) >= 0) || true)))
            ? rr[0] : ""));
    }
}

