import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && new int[n * m + (n - 1) * (m - 1) + 5] instanceof int[] q && new int[]{0, 0} instanceof int[] st
            && ((IntPredicate) b -> (g[b] == '.' ? 1 : 0) + (g[b + 1] == '.' ? 1 : 0) + (g[b + m] == '.' ? 1 : 0) + (g[b + m + 1] == '.' ? 1 : 0) == 3
                && (Integer) (g[b] == '*' ? b : g[b + 1] == '*' ? b + 1 : g[b + m] == '*' ? b + m : b + m + 1) instanceof Integer w && (g[w] = '.') == '.' && (q[st[1]++] = w) >= 0) instanceof IntPredicate chk
            && IntStream.range(0, (n - 1) * m).filter(b -> b % m < m - 1).allMatch(b -> chk.test(b) || true)
            && Stream.generate(() -> 0).takeWhile(z -> st[0] < st[1]).allMatch(z -> (Integer) q[st[0]++] instanceof Integer x
                && IntStream.of(x - m - 1, x - m, x - 1, x).filter(b -> b >= 0 && b % m < m - 1 && b / m < n - 1).allMatch(b -> chk.test(b) || true))
            ? IntStream.range(0, n).mapToObj(i -> new String(g, i * m, m)).collect(Collectors.joining("\n")) : "");
    }
}
