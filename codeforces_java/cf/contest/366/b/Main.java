import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && new long[k] instanceof long[] s && IntStream.range(0, n).allMatch(i -> (s[i % k] += it.next()) >= 0)
            ? IntStream.range(0, k).boxed().min(Comparator.comparingLong(r -> s[r])).get() + 1 : "");
    }
}
