import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && ((java.util.function.IntFunction<int[]>) c -> IntStream.of(c % m > 0 ? c - 1 : -1, c % m < m - 1 ? c + 1 : -1, c >= m ? c - m : -1, c + m < n * m ? c + m : -1).filter(x -> x >= 0 && g[x] == '.').toArray()) instanceof java.util.function.IntFunction<int[]> nbr
            && new int[n * m] instanceof int[] deg && new int[n * m] instanceof int[] q && new int[2] instanceof int[] st
            && IntStream.range(0, n * m).filter(c -> g[c] == '.').allMatch(c -> (deg[c] = nbr.apply(c).length) >= 0 && (deg[c] != 1 || (q[st[1]++] = c) >= 0))
            && Stream.generate(() -> 0).takeWhile(z -> st[0] < st[1]).allMatch(z -> (Integer) q[st[0]++] instanceof Integer c
                && (g[c] != '.' || nbr.apply(c) instanceof int[] f && (f.length == 0 || (Integer) f[0] instanceof Integer p
                    && (g[c] = p == c - 1 ? '>' : p == c + 1 ? '<' : p == c - m ? 'v' : '^') != 0
                    && (g[p] = p == c - 1 ? '<' : p == c + 1 ? '>' : p == c - m ? '^' : 'v') != 0
                    && Arrays.stream(nbr.apply(p)).allMatch(x -> --deg[x] != 1 || (q[st[1]++] = x) >= 0))))
            ? IntStream.range(0, n * m).anyMatch(c -> g[c] == '.') ? "Not unique"
                : IntStream.range(0, n).mapToObj(i -> new String(g, i * m, m)).collect(Collectors.joining("\n")) : "");
    }
}
