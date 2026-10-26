import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] cs
            && IntStream.rangeClosed(2, n).allMatch(i -> (par[i] = Integer.parseInt(tk.nextToken())) > 0 && ++cs[par[i] + 1] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (cs[i + 1] += cs[i]) >= 0) && cs.clone() instanceof int[] fill && new int[n] instanceof int[] ch
            && IntStream.rangeClosed(2, n).allMatch(i -> (ch[fill[par[i]]++] = i) > 0)
            && new long[n + 1] instanceof long[] down && IntStream.rangeClosed(1, n).allMatch(i -> (down[i] = 1) > 0)
            && IntStream.iterate(n, i -> i >= 2, i -> i - 1).allMatch(i -> (down[par[i]] = down[par[i]] * (down[i] + 1) % 1000000007L) >= 0)
            && new long[n + 1] instanceof long[] g
            && IntStream.rangeClosed(1, n).allMatch(p -> (Integer) (cs[p + 1] - cs[p]) instanceof Integer k && new long[k + 2] instanceof long[] pre && new long[k + 2] instanceof long[] suf && (pre[0] = 1) > 0 && (suf[k + 1] = 1) > 0
                && IntStream.rangeClosed(1, k).allMatch(i -> (pre[i] = pre[i - 1] * (down[ch[cs[p] + i - 1]] + 1) % 1000000007L) >= 0)
                && IntStream.iterate(k, i -> i >= 1, i -> i - 1).allMatch(i -> (suf[i] = suf[i + 1] * (down[ch[cs[p] + i - 1]] + 1) % 1000000007L) >= 0)
                && IntStream.rangeClosed(1, k).allMatch(i -> (g[ch[cs[p] + i - 1]] = (p == 1 ? 1 : g[p] + 1) * pre[i - 1] % 1000000007L * suf[i + 1] % 1000000007L) >= 0))
            ? IntStream.rangeClosed(1, n).mapToObj(v -> String.valueOf(down[v] * (v == 1 ? 1 : g[v] + 1) % 1000000007L)).collect(Collectors.joining(" ")) : "");
    }
}
