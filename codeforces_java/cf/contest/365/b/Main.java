import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && new int[n] instanceof int[] run
            && IntStream.range(2, n).allMatch(i -> (run[i] = a[i] == a[i - 1] + a[i - 2] ? run[i - 1] + 1 : 0) >= 0)
            && Integer.valueOf(Arrays.stream(run).max().orElse(0)) instanceof Integer mx
            ? mx > 0 ? mx + 2 : Math.min(n, 2) : "");
    }
}
