import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n] instanceof int[] par && new String[n] instanceof String[] st && (st[0] = "") != null
            && IntStream.range(1, n).allMatch(i -> (par[i] = Integer.parseInt(tk.nextToken()) - 1) >= 0 && (st[i] = tk.nextToken()) != null)
            && tk.nextToken() instanceof String s && Integer.valueOf(s.length()) instanceof Integer L
            && new int[(L + 1) * 26] instanceof int[] aut && new int[L + 2] instanceof int[] f
            && IntStream.range(0, (L + 1) * 26).allMatch(z -> (aut[z] = z / 26 < L && s.charAt(z / 26) - 'a' == z % 26 ? z / 26 + 1 : z < 26 ? 0 : aut[f[z / 26] * 26 + z % 26]) >= 0
                && (z % 26 != 25 || z / 26 >= L || (f[z / 26 + 1] = z < 26 ? 0 : aut[f[z / 26] * 26 + s.charAt(z / 26) - 'a']) >= 0))
            && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && IntStream.range(1, n).allMatch(i -> (nxt[i] = head[par[i]]) >= 0 && (head[par[i]] = i + 1) > 0)
            && new int[n] instanceof int[] state && new int[n] instanceof int[] queue && new int[]{1} instanceof int[] qt && new long[1] instanceof long[] ans
            && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> Integer.valueOf(queue[i]) instanceof Integer x
                && (x.intValue() == 0 || (state[x] = IntStream.range(0, st[x].length()).reduce(state[par[x]], (cur, j) -> (ans[0] += aut[cur * 26 + st[x].charAt(j) - 'a'] == L ? 1 : 0) >= 0 ? aut[cur * 26 + st[x].charAt(j) - 'a'] : 0)) >= 0)
                && IntStream.iterate(head[x], e -> e != 0, e -> nxt[e - 1]).allMatch(e -> (queue[qt[0]++] = e - 1) >= 0))
            ? ans[0] : "");
    }
}
