import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new boolean[n + 1] instanceof boolean[] rr && new boolean[n + 1] instanceof boolean[] cc
            && IntStream.range(0, m).allMatch(i -> (rr[it.next()] = true) && (cc[it.next()] = true))
            && Integer.valueOf(n - (int) IntStream.rangeClosed(1, n).filter(i -> rr[i]).count()) instanceof Integer r
            && Integer.valueOf(n - (int) IntStream.rangeClosed(1, n).filter(i -> cc[i]).count()) instanceof Integer c
            && new double[r + 1][c + 1] instanceof double[][] e && Double.valueOf((double) n * n) instanceof Double nn
            && IntStream.rangeClosed(0, r).allMatch(i -> IntStream.rangeClosed(0, c).allMatch(j -> i + j == 0
                || (e[i][j] = (nn + (double) i * j * e[Math.max(i - 1, 0)][Math.max(j - 1, 0)] + (double) i * (n - j) * e[Math.max(i - 1, 0)][j] + (double) (n - i) * j * e[i][Math.max(j - 1, 0)])
                    / (nn - (double) (n - i) * (n - j))) >= 0))
            ? String.format(Locale.ROOT, "%.10f", e[r][c]) : "");
    }
}
