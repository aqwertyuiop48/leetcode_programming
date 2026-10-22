import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            ? IntStream.range(0, k).map(r -> Integer.valueOf((int) IntStream.range(0, n / k).filter(j -> a[r + j * k] == 1).count()) instanceof Integer c ? Math.min(c, n / k - c) : 0).sum() : "");
    }
}
