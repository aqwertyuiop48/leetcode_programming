import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m && Integer.valueOf(a[2]) instanceof Integer q
            && new int[n][m] instanceof int[][] g && new int[]{3} instanceof int[] st && new int[q] instanceof int[] start
            && IntStream.range(0, q).filter(i -> (start[i] = st[0]) >= 0 && (st[0] += a[st[0]] == 3 ? 4 : 2) >= 0).count() >= 0
            && IntStream.range(0, q).filter(k -> Integer.valueOf(start[q - 1 - k]) instanceof Integer p
                && (a[p] == 1
                    ? Integer.valueOf(a[p + 1] - 1) instanceof Integer r1 && (g[r1] = IntStream.range(0, m).map(j -> g[r1][(j + m - 1) % m]).toArray()) != null
                    : a[p] == 2
                        ? Integer.valueOf(a[p + 1] - 1) instanceof Integer c2 && Arrays.stream(g).mapToInt(row -> row[c2]).toArray() instanceof int[] col
                            && IntStream.range(0, n).filter(i -> (g[i][c2] = col[(i + n - 1) % n]) >= 0).count() >= 0
                        : (g[a[p + 1] - 1][a[p + 2] - 1] = a[p + 3]) >= 0)).count() >= 0
            ? Arrays.stream(g).map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
