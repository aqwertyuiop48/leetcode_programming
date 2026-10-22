import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && new int[n] instanceof int[] y && new int[100002] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> cnt[it.nextInt()]++ >= 0 && (y[i] = it.nextInt()) > 0)
            ? IntStream.range(0, n).mapToObj(i -> (n - 1 + cnt[y[i]]) + " " + (n - 1 - cnt[y[i]])).collect(Collectors.joining("\n")) : "");
    }
}
