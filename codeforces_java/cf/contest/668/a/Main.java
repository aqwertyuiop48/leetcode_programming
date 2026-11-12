import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m && Integer.valueOf(a[2]) instanceof Integer q
            && new int[q + 1] instanceof int[] off && (off[0] = 3) == 3
            && IntStream.range(0, q).filter(i -> (off[i + 1] = off[i] + (a[off[i]] == 3 ? 4 : 2)) > 0).count() >= 0
            && new int[n][m] instanceof int[][] mat
            && IntStream.range(0, q).map(i -> q - 1 - i).filter(i -> Integer.valueOf(off[i]) instanceof Integer o
                && (a[o] == 1 ? (mat[a[o + 1] - 1] = IntStream.range(0, m).map(j -> mat[a[o + 1] - 1][(j + m - 1) % m]).toArray()) != null
                    : a[o] == 2 ? IntStream.range(0, n).map(r -> mat[(r + n - 1) % n][a[o + 1] - 1]).toArray() instanceof int[] col
                        && IntStream.range(0, n).filter(r -> (mat[r][a[o + 1] - 1] = col[r]) > Integer.MIN_VALUE).count() >= 0
                    : (mat[a[o + 1] - 1][a[o + 2] - 1] = a[o + 3]) > Integer.MIN_VALUE)).count() >= 0
            ? Arrays.stream(mat).map(row -> Arrays.stream(row).mapToObj(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
