import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer m
            && Integer.valueOf(IntStream.range(0, m).map(i -> it.nextInt()).min().getAsInt()) instanceof Integer k
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> -it.nextInt()).sorted().map(x -> -x).toArray() instanceof int[] a
            ? IntStream.range(0, n).filter(i -> i % (k + 2) < k).map(i -> a[i]).sum() : "");
    }
}
