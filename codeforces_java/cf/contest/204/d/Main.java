import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && sc.next() instanceof String s && Long.valueOf(1000000007L) instanceof Long M
            && new int[n + 1] instanceof int[] pw && new int[n + 1] instanceof int[] pb
            && IntStream.rangeClosed(1, n).allMatch(i -> (pw[i] = pw[i - 1] + (s.charAt(i - 1) == 'W' ? 1 : 0)) >= 0 && (pb[i] = pb[i - 1] + (s.charAt(i - 1) == 'B' ? 1 : 0)) >= 0)
            && new long[n + 2] instanceof long[] a && new long[n + 2] instanceof long[] f && (a[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> (f[i] = i < k || pw[i] - pw[i - k] != 0 ? 0 : i == k ? 1 : s.charAt(i - k - 1) != 'B' ? a[i - k - 1] : 0) >= 0
                && (a[i] = ((a[i - 1] * (s.charAt(i - 1) == 'X' ? 2 : 1) - f[i]) % M + M) % M) >= 0)
            && new long[n + 3] instanceof long[] b && new long[n + 3] instanceof long[] t && (b[n + 1] = 1) == 1 && (t[n + 1] = 1) == 1
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(j -> (t[j] = t[j + 1] * (s.charAt(j - 1) == 'X' ? 2 : 1) % M) >= 0
                && (b[j] = ((b[j + 1] * (s.charAt(j - 1) == 'X' ? 2 : 1) - (j + k - 1 > n || pb[j + k - 1] - pb[j - 1] != 0 ? 0 : j + k == n + 1 ? 1 : s.charAt(j + k - 1) != 'W' ? b[j + k + 1] : 0)) % M + M) % M) >= 0)
            ? IntStream.rangeClosed(1, n).mapToLong(i -> f[i] * ((t[i + 1] - b[i + 1] + M) % M) % M).sum() % M : "");
    }
}
