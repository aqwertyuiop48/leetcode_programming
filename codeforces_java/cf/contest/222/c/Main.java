import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && (Integer) Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt()) instanceof Integer mx
            && new int[mx + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, (int) Math.sqrt(mx) + 1).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p * p, j -> j <= mx, j -> j + p).allMatch(j -> spf[j] != 0 || (spf[j] = p) > 0))
            && new int[mx + 1] instanceof int[] ca && new int[mx + 1] instanceof int[] cb
            && Arrays.stream(a).allMatch(v -> IntStream.iterate(v, x -> x > 1, x -> x / (spf[x] == 0 ? x : spf[x])).allMatch(x -> ++ca[spf[x] == 0 ? x : spf[x]] > 0))
            && Arrays.stream(b).allMatch(v -> IntStream.iterate(v, x -> x > 1, x -> x / (spf[x] == 0 ? x : spf[x])).allMatch(x -> ++cb[spf[x] == 0 ? x : spf[x]] > 0))
            && IntStream.rangeClosed(2, mx).filter(p -> ca[p] != 0 || cb[p] != 0).allMatch(p -> (ca[p] = cb[p] = Math.min(ca[p], cb[p])) >= 0)
            ? n + " " + m + "\n"
                + Arrays.stream(a).map(v -> IntStream.iterate(v, x -> x > 1, x -> x / (spf[x] == 0 ? x : spf[x])).reduce(v, (res, x) -> ca[spf[x] == 0 ? x : spf[x]] > 0 && --ca[spf[x] == 0 ? x : spf[x]] >= 0 ? res / (spf[x] == 0 ? x : spf[x]) : res)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n"
                + Arrays.stream(b).map(v -> IntStream.iterate(v, x -> x > 1, x -> x / (spf[x] == 0 ? x : spf[x])).reduce(v, (res, x) -> cb[spf[x] == 0 ? x : spf[x]] > 0 && --cb[spf[x] == 0 ? x : spf[x]] >= 0 ? res / (spf[x] == 0 ? x : spf[x]) : res)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
