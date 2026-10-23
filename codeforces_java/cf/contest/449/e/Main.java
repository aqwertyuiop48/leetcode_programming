import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new int[1000001] instanceof int[] phi && IntStream.rangeClosed(0, 1000000).allMatch(i -> (phi[i] = i) >= 0)
            && IntStream.rangeClosed(2, 1000000).allMatch(i -> phi[i] != i || IntStream.iterate(i, j -> j <= 1000000, j -> j + i).allMatch(j -> (phi[j] -= phi[j] / i) >= 0))
            && new long[1000001] instanceof long[] pil && IntStream.rangeClosed(1, 1000000).allMatch(d -> IntStream.iterate(d, m -> m <= 1000000, m -> m + d).allMatch(m -> (pil[m] += (long) d * phi[m / d]) > 0))
            && new long[1000001] instanceof long[] g0 && new long[1000001] instanceof long[] g1 && new long[1000001] instanceof long[] g2
            && IntStream.rangeClosed(1, 1000000).allMatch(s -> (Long) ((((long) s * (2L * s * s + 1) / 3 - 2L * s * s + 2 * pil[s]) % 1000000007L + 1000000007L) % 1000000007L) instanceof Long g
                && (g0[s] = (g0[s - 1] + g) % 1000000007L) >= 0 && (g1[s] = (g1[s - 1] + g * s) % 1000000007L) >= 0 && (g2[s] = (g2[s - 1] + g * s % 1000000007L * s) % 1000000007L) >= 0)
            ? IntStream.range(0, q).mapToObj(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long n && (Long) Long.parseLong(tk.nextToken()) instanceof Long m && (Integer) (int) Math.min(n, m) instanceof Integer t
                ? String.valueOf((((n + 1) * (m + 1) % 1000000007L * g0[t] - (n + m + 2) * g1[t] % 1000000007L + g2[t]) % 1000000007L + 1000000007L) % 1000000007L) : "").collect(Collectors.joining("\n")) : "");
    }
}
