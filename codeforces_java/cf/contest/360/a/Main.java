import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && new int[m] instanceof int[] t && new int[m] instanceof int[] l && new int[m] instanceof int[] r && new int[m] instanceof int[] v
            && IntStream.range(0, m).allMatch(j -> (t[j] = it.nextInt()) > 0 & (l[j] = it.nextInt() - 1) >= 0 & (r[j] = it.nextInt() - 1) >= 0 & (v[j] = it.nextInt()) > Integer.MIN_VALUE)
            && new int[n] instanceof int[] d && IntStream.generate(() -> 1000000000).limit(n).toArray() instanceof int[] u
            && IntStream.range(0, m).allMatch(j -> t[j] == 1 ? IntStream.rangeClosed(l[j], r[j]).allMatch(i -> (d[i] += v[j]) > Integer.MIN_VALUE)
                : IntStream.rangeClosed(l[j], r[j]).allMatch(i -> (u[i] = Math.min(u[i], v[j] - d[i])) > Integer.MIN_VALUE))
            && u.clone() instanceof int[] cur
            ? Arrays.stream(u).min().getAsInt() >= -1000000000 && IntStream.range(0, m).allMatch(j -> t[j] == 1 ? IntStream.rangeClosed(l[j], r[j]).allMatch(i -> (cur[i] += v[j]) > Integer.MIN_VALUE)
                : IntStream.rangeClosed(l[j], r[j]).map(i -> cur[i]).max().getAsInt() == v[j])
                ? "YES\n" + Arrays.stream(u).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "NO" : "");
    }
}
