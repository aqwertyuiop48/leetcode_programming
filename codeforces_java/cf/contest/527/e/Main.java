import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[m + n + 3] instanceof int[] ea && new int[m + n + 3] instanceof int[] eb && new int[n + 1] instanceof int[] deg
            && IntStream.range(0, m).allMatch(i -> (ea[i] = Integer.parseInt(tk.nextToken())) > 0 && (eb[i] = Integer.parseInt(tk.nextToken())) > 0 && ++deg[ea[i]] > 0 && ++deg[eb[i]] > 0)
            && IntStream.rangeClosed(1, n).filter(v -> deg[v] % 2 == 1).toArray() instanceof int[] odd
            && IntStream.range(0, odd.length / 2).allMatch(i -> (ea[m + i] = odd[2 * i]) > 0 && (eb[m + i] = odd[2 * i + 1]) > 0)
            && (Integer) (m + odd.length / 2) instanceof Integer m2
            && (Integer) (m2 % 2 == 1 && (ea[m2] = 1) > 0 && (eb[m2] = 1) > 0 ? m2 + 1 : m2) instanceof Integer tot
            && new int[2 * tot] instanceof int[] to && new int[2 * tot] instanceof int[] nxt && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, tot).allMatch(i -> (to[2 * i] = eb[i]) > 0 && (nxt[2 * i] = head[ea[i]]) >= -1 && (head[ea[i]] = 2 * i) >= 0
                && (to[2 * i + 1] = ea[i]) > 0 && (nxt[2 * i + 1] = head[eb[i]]) >= -1 && (head[eb[i]] = 2 * i + 1) >= 0)
            && new boolean[tot] instanceof boolean[] used && new int[tot + 2] instanceof int[] stV && new int[tot + 2] instanceof int[] stE && new int[tot + 1] instanceof int[] circ && new int[]{1, 0} instanceof int[] sp
            && (stV[0] = 1) > 0 && (stE[0] = -1) < 0
            && Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z -> (Integer) stV[sp[0] - 1] instanceof Integer v
                && (Integer) IntStream.iterate(head[v], e -> e >= 0 && used[e >> 1], e -> nxt[e]).reduce(-1, (x, y) -> y) instanceof Integer skip
                && (Integer) (skip < 0 ? head[v] : nxt[skip]) instanceof Integer nx && (head[v] = nx) >= -1
                && (nx >= 0 ? (used[nx >> 1] = true) && (stV[sp[0]] = to[nx]) > 0 && (stE[sp[0]] = nx) >= 0 && ++sp[0] > 0
                    : stE[sp[0] - 1] < 0 ? --sp[0] >= 0 : (circ[sp[1]++] = stE[--sp[0]]) >= 0))
            ? tot + "\n" + IntStream.range(0, tot).mapToObj(i -> ((circ[i] & 1) == 0) == (i % 2 == 1)
                ? ea[circ[i] >> 1] + " " + eb[circ[i] >> 1] : eb[circ[i] >> 1] + " " + ea[circ[i] >> 1]).collect(Collectors.joining("\n")) : "");
    }
}
