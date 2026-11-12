import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n + 1] instanceof int[] col
            && IntStream.rangeClosed(1, n).allMatch(i -> (col[i] = Integer.parseInt(tk.nextToken())) != 0 || true)
            && new int[n + 1] instanceof int[] head && new int[Math.max(2, 2 * n)] instanceof int[] nx && new int[Math.max(2, 2 * n)] instanceof int[] to
            && Arrays.stream(new int[]{0}).peek(z -> Arrays.fill(head, -1)).sum() == 0
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer a
                && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nx[2 * i] = head[a]) > -5 && (head[a] = 2 * i) >= 0
                && (to[2 * i + 1] = a) > 0 && (nx[2 * i + 1] = head[b]) > -5 && (head[b] = 2 * i + 1) >= 0 || true)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] ptr
            && IntStream.rangeClosed(1, n).allMatch(i -> (ptr[i] = head[i]) > -5 || true)
            && new int[4 * n + 8] instanceof int[] out && new int[n + 2] instanceof int[] stk
            && new int[]{1, 1} instanceof int[] st
            && (out[0] = 1) == 1 && (stk[0] = 1) == 1
            && ((IntPredicate) x -> (out[st[1]++] = x) > 0 && (col[x] = -col[x]) != 0) instanceof IntPredicate app
            && IntStream.range(0, 3 * n + 5).allMatch(it -> st[0] > 0 && Integer.valueOf(stk[st[0] - 1]) instanceof Integer v
                && (ptr[v] >= 0
                    ? (Integer.valueOf(ptr[v]) instanceof Integer e && (ptr[v] = nx[e]) > -5
                        && (to[e] == par[v] || (par[to[e]] = v) >= 0 && (stk[st[0]++] = to[e]) > 0 && app.test(to[e])))
                    : (st[0]-- > 0
                        && (par[v] != 0
                            ? (col[v] == -1 ? app.test(par[v]) && app.test(v) && app.test(par[v]) : app.test(par[v]))
                            : (col[v] != -1 || head[v] < 0 || app.test(to[head[v]]) && app.test(v) && app.test(to[head[v]])))))
                || true)
            ? "1 " + IntStream.range(1, st[1]).mapToObj(i -> String.valueOf(out[i])).collect(Collectors.joining(" ")) : "");
    }
}
