import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Arrays.stream(t, 1, n + 1).sorted().toArray() instanceof long[] a
            && IntStream.range(0, n - 1).mapToLong(i -> a[i + 1] - a[i]).toArray() instanceof long[] d
            ? (n == 1 ? "-1" : Long.valueOf(Arrays.stream(d).min().getAsLong()) instanceof Long m && IntStream.range(0, n - 1).filter(i -> d[i] != m).toArray() instanceof int[] bad
                ? (m == 0 ? (bad.length == 0 ? "1\n" + a[0] : "0")
                    : bad.length == 0 ? (n == 2 && m % 2 == 0 ? "3\n" + (a[0] - m) + " " + (a[0] + m / 2) + " " + (a[1] + m) : "2\n" + (a[0] - m) + " " + (a[n - 1] + m))
                    : bad.length == 1 && d[bad[0]] == 2 * m ? "1\n" + (a[bad[0]] + m) : "0") : "") : "");
    }
}
