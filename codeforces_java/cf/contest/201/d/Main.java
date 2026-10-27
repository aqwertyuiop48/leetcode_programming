import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> id && IntStream.range(0, n).allMatch(i -> id.put(tk.nextToken(), i) == null)
            && (Integer) (n * (n - 1) / 2 + 1) instanceof Integer inv0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[(1 << n) * inv0] instanceof int[] dp
            ? IntStream.rangeClosed(1, m).mapToObj(idx -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
                && IntStream.range(0, k).mapToObj(i -> tk.nextToken()).map(id::get).filter(Objects::nonNull).mapToInt(Integer::intValue).toArray() instanceof int[] arr
                && (Integer) arr.length instanceof Integer len
                && IntStream.range(0, n).allMatch(j -> IntStream.of(arr).anyMatch(x -> x == j))
                && new int[(len + 1) * n] instanceof int[] nxt
                && IntStream.range(0, n).allMatch(j -> (nxt[len * n + j] = len) >= 0)
                && IntStream.iterate(len - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, n).allMatch(j -> (nxt[i * n + j] = arr[i] == j ? i : nxt[(i + 1) * n + j]) >= 0))
                && IntStream.range(0, dp.length).allMatch(i -> (dp[i] = len + 1) > 0) && (dp[0] = 0) == 0
                && IntStream.range(0, 1 << n).allMatch(mask -> IntStream.rangeClosed(0, Math.min(inv0 - 1, Integer.bitCount(mask) * (Integer.bitCount(mask) - 1) / 2)).allMatch(iv ->
                    dp[mask * inv0 + iv] > len || IntStream.range(0, n).filter(j -> (mask >> j & 1) == 0 && nxt[dp[mask * inv0 + iv] * n + j] < len).allMatch(j ->
                        (dp[(mask | 1 << j) * inv0 + iv + Integer.bitCount(mask >> (j + 1))] = Math.min(dp[(mask | 1 << j) * inv0 + iv + Integer.bitCount(mask >> (j + 1))], nxt[dp[mask * inv0 + iv] * n + j] + 1)) > 0)))
                && (Integer) IntStream.range(0, inv0).filter(iv -> dp[((1 << n) - 1) * inv0 + iv] <= len).findFirst().orElse(-1) instanceof Integer x && x >= 0
                ? new int[]{idx, n * (n - 1) / 2 - x + 1} : null)
                .filter(Objects::nonNull).max(Comparator.<int[]>comparingInt(r -> r[1]).thenComparingInt(r -> -r[0]))
                .map(r -> r[0] + "\n[:" + "|".repeat(r[1]) + ":]").orElse("Brand new problem!") : "");
    }


}
