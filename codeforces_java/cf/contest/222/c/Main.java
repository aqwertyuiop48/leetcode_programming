import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> it.next()).toArray() instanceof int[] b
            && Integer.valueOf(Math.max(Arrays.stream(a).max().getAsInt(), Arrays.stream(b).max().getAsInt())) instanceof Integer MX
            && new int[MX + 1] instanceof int[] spf
            && IntStream.rangeClosed(2, MX).allMatch(i -> spf[i] != 0 || (spf[i] = i) > 0 && ((long) i * i > MX || IntStream.iterate(i * i, j -> j <= MX, j -> j + i).allMatch(j -> spf[j] != 0 || (spf[j] = i) > 0)))
            && new int[MX + 1] instanceof int[] ca && new int[MX + 1] instanceof int[] cb
            && Arrays.stream(a).allMatch(v -> IntStream.iterate(v, x -> x > 1, x -> x / spf[x]).allMatch(x -> ++ca[spf[x]] > 0))
            && Arrays.stream(b).allMatch(v -> IntStream.iterate(v, x -> x > 1, x -> x / spf[x]).allMatch(x -> ++cb[spf[x]] > 0))
            && IntStream.rangeClosed(2, MX).allMatch(p -> (ca[p] = cb[p] = Math.min(ca[p], cb[p])) >= 0)
            ? n + " " + m + "\n"
                + Arrays.stream(a).map(v -> IntStream.iterate(v, x -> x > 1, x -> x / spf[x]).reduce(v, (res, x) -> ca[spf[x]] > 0 && --ca[spf[x]] >= 0 ? res / spf[x] : res)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n"
                + Arrays.stream(b).map(v -> IntStream.iterate(v, x -> x > 1, x -> x / spf[x]).reduce(v, (res, x) -> cb[spf[x]] > 0 && --cb[spf[x]] >= 0 ? res / spf[x] : res)).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
