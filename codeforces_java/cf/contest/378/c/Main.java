import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer k
            && String.join("", Arrays.copyOfRange(t, 3, 3 + n)).toCharArray() instanceof char[] g
            && Integer.valueOf(new String(g).indexOf(46)) instanceof Integer s
            && new int[n * m] instanceof int[] ord && new boolean[n * m] instanceof boolean[] seen && new int[]{1} instanceof int[] tl
            && (ord[0] = s) >= 0 && (seen[s] = true)
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).allMatch(i -> IntStream.of(-m, m, -1, 1).map(d -> ord[i] + d)
                .filter(u -> u >= 0 && u < n * m && !seen[u] && g[u] == 46 && Math.abs(u % m - ord[i] % m) <= 1 && (u / m == ord[i] / m || u % m == ord[i] % m))
                .allMatch(u -> (seen[u] = true) && (ord[tl[0]++] = u) >= 0))
            && IntStream.range(tl[0] - k, tl[0]).allMatch(i -> (g[ord[i]] = 88) > 0)
            ? IntStream.range(0, n).mapToObj(i -> new String(g, i * m, m)).collect(Collectors.joining("\n")) : "");
    }
}
