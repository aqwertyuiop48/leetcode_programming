import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken())).toArray() instanceof int[] pw && (Integer) ((int) Math.sqrt(n) + 1) instanceof Integer S
            && new int[n + 2] instanceof int[] jump && new int[n + 2] instanceof int[] to && new int[n + 2] instanceof int[] last
            && ((IntPredicate) i -> (i + pw[i] > Math.min(n, (i - 1) / S * S + S)
                ? (jump[i] = 1) > 0 && (to[i] = i + pw[i]) > 0 && (last[i] = i) > 0
                : (jump[i] = jump[i + pw[i]] + 1) > 0 && (to[i] = to[i + pw[i]]) > 0 && (last[i] = last[i + pw[i]]) > 0)) instanceof IntPredicate re
            && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(re) && new int[2] instanceof int[] st && new IntToLongFunction[1] instanceof IntToLongFunction[] walk && new IntPredicate[1] instanceof IntPredicate[] fix
            && (walk[0] = x -> to[x] > n ? ((long) jump[x] << 20) | last[x] : to[to[x]] > n ? ((long) (jump[x] + jump[to[x]]) << 20) | last[to[x]] : to[to[to[x]]] > n ? ((long) (jump[x] + jump[to[x]] + jump[to[to[x]]]) << 20) | last[to[to[x]]] : walk[0].applyAsLong(to[to[to[x]]]) + ((long) (jump[x] + jump[to[x]] + jump[to[to[x]]]) << 20)) != null
            && (fix[0] = j -> j < st[1] || (re.test(j) && (j - 1 < st[1] || (re.test(j - 1) && (j - 2 < st[1] || (re.test(j - 2) && (j - 3 < st[1] || (re.test(j - 3) && fix[0].test(j - 4))))))))) != null
            ? IntStream.range(0, m).mapToObj(q -> Integer.parseInt(tk.nextToken()) == 0
                    ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (pw[a] = Integer.parseInt(tk.nextToken())) > 0 && (st[1] = (a - 1) / S * S + 1) > 0 && fix[0].test(a) ? "" : ""
                    : (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer c && (Long) walk[0].applyAsLong(c) instanceof Long w ? (w & 1048575) + " " + (w >> 20) : "")
                .filter(z -> !z.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}


