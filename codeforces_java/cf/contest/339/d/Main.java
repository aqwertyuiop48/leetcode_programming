import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, 1 << n).map(i -> Integer.parseInt(it.next())).toArray() instanceof int[] a && new int[2 << n] instanceof int[] t
            && IntStream.range(0, 1 << n).allMatch(i -> (t[(1 << n) + i] = a[i]) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(k -> IntStream.range(1 << (n - k), 2 << (n - k)).allMatch(i -> (t[i] = (k & 1) == 1 ? t[2 * i] | t[2 * i + 1] : t[2 * i] ^ t[2 * i + 1]) >= 0))
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(Integer.parseInt(it.next()) - 1 + (1 << n)) instanceof Integer p && Integer.valueOf(it.next()) instanceof Integer b && (t[p] = b) >= 0
                && IntStream.rangeClosed(1, n).allMatch(k -> (t[p >> k] = (k & 1) == 1 ? t[2 * (p >> k)] | t[2 * (p >> k) + 1] : t[2 * (p >> k)] ^ t[2 * (p >> k) + 1]) >= 0) ? String.valueOf(t[1]) : "").collect(Collectors.joining("\n")) : "");
    }
}
