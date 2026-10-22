import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long M && new int[1 << 20] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> cnt[it.next()]++ >= 0)
            && IntStream.range(0, 20).allMatch(b -> IntStream.range(0, 1 << 20).filter(m -> (m >> b & 1) == 0).allMatch(m -> (cnt[m] += cnt[m | 1 << b]) >= 0))
            && new long[n + 1] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.rangeClosed(1, n).allMatch(i -> (pw[i] = pw[i - 1] * 2 % M) > 0)
            ? (IntStream.range(0, 1 << 20).mapToLong(m -> Integer.bitCount(m) % 2 == 0 ? pw[cnt[m]] : -pw[cnt[m]]).sum() % M + M) % M : "");
    }
}
