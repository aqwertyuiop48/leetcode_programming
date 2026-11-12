
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && m % 2 == 0
            && IntStream.range(0, n + 1).map(x -> -1).toArray() instanceof int[] hd && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = hd[a]) >= -1 && (hd[a] = 2 * i) >= 0
                && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = hd[b]) >= -1 && (hd[b] = 2 * i + 1) >= 0)
            && new boolean[m] instanceof boolean[] used && new boolean[n + 1] instanceof boolean[] vis && new StringBuilder() instanceof StringBuilder sb
            && new int[n + 1] instanceof int[] wait && new int[n + 1] instanceof int[] par && new int[n + 2] instanceof int[] stk && new int[1] instanceof int[] sp
            && ((IntBinaryOperator) (v, u) -> wait[v] > 0 ? sb.append(wait[v]).append(' ').append(v).append(' ').append(u).append('\n').length() * 0 + (wait[v] = 0) : (wait[v] = u) * 0) instanceof IntBinaryOperator add
            && (vis[1] = true) && (stk[0] = 1) == 1 && (sp[0] = 1) == 1
            && (IntStream.range(0, 2 * m + n + 5).allMatch(step -> sp[0] == 0 ? false : (Integer) stk[sp[0] - 1] instanceof Integer v
                && (hd[v] < 0
                    ? ((sp[0]-- > 0) && (par[v] == 0 || (wait[v] > 0 ? sb.append(wait[v]).append(' ').append(v).append(' ').append(par[v]).append('\n').length() > 0 : add.applyAsInt(par[v], v) == 0)))
                    : (Integer) hd[v] instanceof Integer e && (hd[v] = nxt[e]) >= -1 && (used[e >> 1] || ((used[e >> 1] = true) && (Integer) to[e] instanceof Integer u && (vis[u] ? add.applyAsInt(v, u) == 0 : (vis[u] = true) && (par[u] = v) > 0 && (stk[sp[0]++] = u) > 0))))) || true)
            ? sb.toString().trim() : "No solution");
    }
}



