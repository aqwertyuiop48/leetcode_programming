import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer m
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer c
            && IntStream.range(0, n).map(i -> Integer.parseInt((String) it.next())).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> Integer.parseInt((String) it.next())).toArray() instanceof int[] b
            && IntStream.rangeClosed(0, m).map(i -> i == 0 ? 0 : 0).toArray() instanceof int[] pre
            && IntStream.range(0, m).allMatch(i -> (pre[i + 1] = (pre[i] + b[i]) % c) >= 0)
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf((a[i] + pre[Math.min(i, m - 1) + 1] - pre[Math.max(0, i - (n - m))] + c) % c)).collect(Collectors.joining(" "))
            : "");
    }
}
