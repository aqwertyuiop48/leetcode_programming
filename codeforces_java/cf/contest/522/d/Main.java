import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[m] instanceof int[] ql && new int[m] instanceof int[] qn && new int[n + 1] instanceof int[] qh && IntStream.rangeClosed(0, n).allMatch(i -> (qh[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (ql[i] = Integer.parseInt(tk.nextToken())) > 0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r && (qn[i] = qh[r]) >= -1 && (qh[r] = i) >= 0)
            && new int[n + 2] instanceof int[] bit && IntStream.range(0, n + 2).allMatch(i -> (bit[i] = Integer.MAX_VALUE) > 0)
            && new int[500002] instanceof int[] last && new int[m] instanceof int[] ans
            && IntStream.rangeClosed(1, n).allMatch(i -> (Integer) a[i - 1] instanceof Integer v
                && (last[v] == 0 || IntStream.iterate(n + 1 - last[v], j -> j <= n, j -> j + (j & -j)).peek(j -> bit[j] = Math.min(bit[j], i - last[v])).count() >= 0)
                && (last[v] = i) > 0
                && IntStream.iterate(qh[i], q -> q >= 0, q -> qn[q]).allMatch(q -> (ans[q] = IntStream.iterate(n + 1 - ql[q], j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).min().orElse(Integer.MAX_VALUE)) != 0))
            ? Arrays.stream(ans).mapToObj(x -> x == Integer.MAX_VALUE ? "-1" : String.valueOf(x)).collect(Collectors.joining("\n")) : "");
    }
}
