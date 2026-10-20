import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n + 1] instanceof int[] p
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + (it.next() > 0 ? 1 : 0)) >= 0)
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r
               
                ? (r - l) % 2 == 1 && p[n] >= (r - l + 1) / 2 && n - p[n] >= (r - l + 1) / 2 ? "1" : "0" : "").collect(Collectors.joining("\n")) : "");
    }
}
