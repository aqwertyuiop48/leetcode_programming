import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && (Integer) (n * m) instanceof Integer nm
            && ((IntUnaryOperator) c -> (c % m > 0 && g[c - 1] == '.' ? 1 : 0) + (c % m < m - 1 && g[c + 1] == '.' ? 1 : 0) + (c >= m && g[c - m] == '.' ? 1 : 0) + (c + m < nm && g[c + m] == '.' ? 1 : 0)) instanceof IntUnaryOperator cnt
            && ((IntUnaryOperator) c -> c % m > 0 && g[c - 1] == '.' ? c - 1 : c % m < m - 1 && g[c + 1] == '.' ? c + 1 : c >= m && g[c - m] == '.' ? c - m : c + m < nm && g[c + m] == '.' ? c + m : -1) instanceof IntUnaryOperator one
            && new int[nm] instanceof int[] deg && new int[nm] instanceof int[] q && new int[2] instanceof int[] st
            && ((IntPredicate) x -> x < 0 || g[x] != '.' || --deg[x] != 1 || (q[st[1]++] = x) >= 0) instanceof IntPredicate dec
            && IntStream.range(0, nm).filter(c -> g[c] == '.').allMatch(c -> (deg[c] = cnt.applyAsInt(c)) >= 0 && (deg[c] != 1 || (q[st[1]++] = c) >= 0))
            && (IntStream.range(0, nm).allMatch(z -> st[0] < st[1] ? (Integer) q[st[0]++] instanceof Integer c
                && (g[c] != '.' || (Integer) one.applyAsInt(c) instanceof Integer p && (p < 0
                    || (g[c] = p == c - 1 && m > 1 ? '>' : p == c + 1 && m > 1 ? '<' : p == c - m ? 'v' : '^') != 0
                    && (g[p] = p == c - 1 && m > 1 ? '<' : p == c + 1 && m > 1 ? '>' : p == c - m ? '^' : 'v') != 0
                    && dec.test(p % m > 0 ? p - 1 : -1) && dec.test(p % m < m - 1 ? p + 1 : -1) && dec.test(p >= m ? p - m : -1) && dec.test(p + m < nm ? p + m : -1))) : false) || true)
            ? IntStream.range(0, nm).anyMatch(c -> g[c] == '.') ? "Not unique"
                : IntStream.range(0, n).mapToObj(i -> new String(g, i * m, m)).collect(Collectors.joining("\n")) : "");
    }
}
