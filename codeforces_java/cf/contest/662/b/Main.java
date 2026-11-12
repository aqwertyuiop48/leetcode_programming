import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer m
            && new int[m] instanceof int[] U && new int[m] instanceof int[] V && new int[m] instanceof int[] C
            && IntStream.range(0, m).filter(i -> (U[i] = Integer.parseInt(tk.nextToken())) > 0 && (V[i] = Integer.parseInt(tk.nextToken())) > 0 && (C[i] = tk.nextToken().charAt(0) == 'R' ? 0 : 1) >= 0).count() >= 0
            && new int[n + 1] instanceof int[] head && new int[2 * m + 2] instanceof int[] nxt
            && IntStream.range(0, m).filter(i -> (nxt[2 * i + 1] = head[U[i]]) >= 0 && (head[U[i]] = 2 * i + 1) > 0 && (nxt[2 * i + 2] = head[V[i]]) >= 0 && (head[V[i]] = 2 * i + 2) > 0).count() >= 0
            ? IntStream.range(0, 2).mapToObj(t -> IntStream.rangeClosed(0, n).map(i -> -1).toArray() instanceof int[] val && new int[n + 1] instanceof int[] q && new int[n + 1] instanceof int[] res
                && new int[3] instanceof int[] st
                && IntStream.rangeClosed(1, n).filter(s -> val[s] < 0 && (val[s] = 0) == 0 && Integer.valueOf(st[0]) instanceof Integer b && (q[st[0]++] = s) > 0
                    && IntStream.iterate(b, h -> h < st[0], h -> h + 1).filter(h -> Integer.valueOf(q[h]) instanceof Integer x
                        && IntStream.iterate(head[x], p -> p != 0, p -> nxt[p]).filter(p -> Integer.valueOf(((p - 1) & 1) == 0 ? V[(p - 1) >> 1] : U[(p - 1) >> 1]) instanceof Integer y
                            && (val[y] < 0 ? (val[y] = val[x] ^ C[(p - 1) >> 1] ^ t) >= 0 && (q[st[0]++] = y) > 0 : val[y] == (val[x] ^ C[(p - 1) >> 1] ^ t) || (st[1] = 1) > 0)).count() >= 0).count() >= 0
                    && Long.valueOf(IntStream.range(b, st[0]).filter(h -> val[q[h]] == 1).count()) instanceof Long ones
                    && Integer.valueOf(ones <= st[0] - b - ones ? 1 : 0) instanceof Integer ch
                    && IntStream.range(b, st[0]).filter(h -> val[q[h]] == ch.intValue() && (res[st[2]++] = q[h]) > 0).count() >= 0).count() >= 0
                ? st[1] == 1 ? "" : st[2] + "\n" + IntStream.range(0, st[2]).mapToObj(i -> "" + res[i]).collect(Collectors.joining(" "))
                : "").filter(s -> !s.isEmpty()).min(Comparator.comparingInt(s -> Integer.parseInt(s.substring(0, s.indexOf('\n'))))).orElse("-1")
            : "");
    }
}
