import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n + 2).map(i -> i >= 1 && i <= n ? s.nextInt() : 0).toArray() instanceof int[] a
            && new long[]{0} instanceof long[] tot && new boolean[]{true} instanceof boolean[] ok
            ? n < 3 ? -1 : IntStream.iterate(n, j -> j >= 2, j -> j - 1).allMatch(j -> j / 2 * 2 + 1 <= n || a[j] == 0 || !(ok[0] = false) ? (j / 2 * 2 + 1 > n) || a[j] == 0 || (Integer.valueOf(a[j]) instanceof Integer c && (tot[0] += c) >= 0
                    && (a[j / 2] = Math.max(0, a[j / 2] - c)) >= 0 && (a[j ^ 1] = Math.max(0, a[j ^ 1] - c)) >= 0 && (a[j] = 0) == 0) || true : true) && ok[0] ? tot[0] + a[1] : -1 : "");
    }
}
