import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Long) s.nextLong() instanceof Long m
            && new long[n + 1] instanceof long[] pw && (pw[0] = 1 % m) >= 0 && IntStream.rangeClosed(1, n).allMatch(i -> (pw[i] = pw[i - 1] * 10 % m) >= 0)
            && new int[n + 1] instanceof int[] pk && (pk[0] = 1 % k) >= 0 && IntStream.rangeClosed(1, n).allMatch(i -> (pk[i] = pk[i - 1] * 10 % k) >= 0)
            && new long[k + 1] instanceof long[] cur && new long[k + 1] instanceof long[] nw && (cur[k] = 1) > 0 && new long[1] instanceof long[] ans
            && IntStream.range(0, n).allMatch(i -> (Long) (n - 1 - i == 0 ? 1L % m : 9 * pw[n - 2 - i] % m) instanceof Long fr
                && IntStream.range(0, k + 1).allMatch(j -> (nw[j] = j == k ? 1 : 0) >= 0)
                && IntStream.range(0, (k + 1) * 10).allMatch(t -> cur[t / 10] == 0 || t % 10 < (t / 10 == k ? 1 : (i == n - 1 ? 1 : 0))
                    || ((t / 10 == k ? 0 : t / 10) + t % 10 * pk[i]) % k == 0
                        && (ans[0] = (ans[0] + cur[t / 10] * fr) % m) >= 0
                    || ((t / 10 == k ? 0 : t / 10) + t % 10 * pk[i]) % k != 0
                        && (nw[((t / 10 == k ? 0 : t / 10) + t % 10 * pk[i]) % k] = (nw[((t / 10 == k ? 0 : t / 10) + t % 10 * pk[i]) % k] + cur[t / 10]) % m) >= 0)
                && IntStream.range(0, k).allMatch(j -> (cur[j] = nw[j]) >= 0))
            ? ans[0] % m : 0);
    }
}
