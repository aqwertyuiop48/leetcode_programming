import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && new int[n][n] instanceof int[][] a
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (a[i][j] = it.next()) > Integer.MIN_VALUE))
            ? IntStream.range(0, 2 * n).mapToObj(r -> IntStream.range(0, n).mapToObj(j -> String.format(Locale.ROOT, "%.8f", r < n ? (a[r][j] + a[j][r]) / 2.0 : (a[r - n][j] - a[j][r - n]) / 2.0)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
