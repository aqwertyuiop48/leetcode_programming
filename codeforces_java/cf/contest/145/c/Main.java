import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer k && Stream.generate(tk::nextToken).limit(n).toList() instanceof List<String> xs && xs.stream().filter(x -> x.matches("[47]+")).collect(Collectors.groupingBy(x -> x, Collectors.counting())).values().stream().mapToLong(c -> c).toArray() instanceof long[] cs && new long[cs.length + 2] instanceof long[] dp && (dp[0] = 1) == 1 && Arrays.stream(cs).allMatch(c -> IntStream.iterate(cs.length, j -> j >= 1, j -> j - 1).allMatch(j -> (dp[j] = (dp[j] + dp[j - 1] * c) % 1000000007L) >= 0)) && new long[n + 2] instanceof long[] iv && (iv[1] = 1) == 1 && IntStream.rangeClosed(2, n + 1).allMatch(i -> (iv[i] = (1000000007L - (1000000007L / i) * iv[(int) (1000000007L % i)] % 1000000007L) % 1000000007L) >= 0) && Long.valueOf(n - Arrays.stream(cs).sum()) instanceof Long u && new long[n + 2] instanceof long[] cb && (cb[0] = 1) == 1 && IntStream.rangeClosed(1, n + 1).allMatch(t -> (cb[t] = cb[t - 1] * ((u - t + 1) % 1000000007L) % 1000000007L * iv[t] % 1000000007L) >= 0) ? IntStream.rangeClosed(0, Math.min(cs.length, k)).mapToLong(j -> dp[j] * cb[k - j] % 1000000007L).sum() % 1000000007L : -1);
    }
}
