import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer k && Integer.valueOf(it.nextInt()) instanceof Integer n
            && Integer.valueOf(it.nextInt()) instanceof Integer maxb && Integer.valueOf(it.nextInt()) instanceof Integer t
            ? IntStream.range(0, k).mapToObj(q -> IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] b && new int[maxb + 2] instanceof int[] f
                && Integer.valueOf((int) Arrays.stream(b).distinct().count()) instanceof Integer d
                ? String.valueOf(t >= d ? d : IntStream.range(0, t * n).allMatch(i -> Integer.valueOf(f[b[i % n] - 1] + 1) instanceof Integer v && (f[b[i % n]] >= v || IntStream.iterate(b[i % n], j -> j <= maxb && f[j] < v, j -> j + 1).allMatch(j -> (f[j] = v) > 0)) && f[maxb] < d) || true ? f[maxb] : -1) : "").collect(Collectors.joining("\n")) : "");
    }
}
