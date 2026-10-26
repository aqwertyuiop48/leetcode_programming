import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] ed && new int[2 * m + 1] instanceof int[] nxt && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && IntStream.range(0, 2 * m).allMatch(j -> (nxt[j] = head[ed[j]]) >= -1 && (head[ed[j]] = j) >= 0)
            && IntStream.rangeClosed(1, n).toArray() instanceof int[] rest && new int[n + 1] instanceof int[] q && new int[n + 2] instanceof int[] cs && new int[n + 1] instanceof int[] mark
            && new int[]{n, 0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, 2 * n + 5).anyMatch(z -> st[1] < st[2]
                ? (Integer) q[st[1]++] instanceof Integer v && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> (mark[ed[e ^ 1]] = v) > 0) && (st[4] = 0) == 0
                    && IntStream.range(0, st[0]).allMatch(i -> mark[rest[i]] == v ? (rest[st[4]++] = rest[i]) > 0 : (q[st[2]++] = rest[i]) > 0) && (st[0] = st[4]) >= 0 ? false : false
                : st[0] > 0 ? !((cs[st[3]++] = st[2]) >= 0 && (q[st[2]++] = rest[--st[0]]) > 0)
                : true)
            ? st[3] + "\n" + IntStream.range(0, st[3]).mapToObj(c -> Stream.of(0).peek(w -> Arrays.sort(q, cs[c], c + 1 < st[3] ? cs[c + 1] : n)).findFirst().isPresent()
                ? ((c + 1 < st[3] ? cs[c + 1] : n) - cs[c]) + " " + IntStream.range(cs[c], c + 1 < st[3] ? cs[c + 1] : n).mapToObj(i -> String.valueOf(q[i])).collect(Collectors.joining(" ")) : "").collect(Collectors.joining("\n")) : "");
    }
}
