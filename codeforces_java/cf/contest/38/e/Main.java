import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToLong(Long::parseLong).toArray() instanceof long[] v
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> v[1 + 2 * i])).toList() instanceof List<Integer> ord
            && ord.stream().mapToLong(i -> v[1 + 2 * i]).toArray() instanceof long[] x
            && ord.stream().mapToLong(i -> v[2 + 2 * i]).toArray() instanceof long[] c
            && IntStream.rangeClosed(0, n).mapToLong(i -> IntStream.range(0, i).mapToLong(k -> x[k]).sum()).toArray() instanceof long[] S
            && new long[n] instanceof long[] dp
            && IntStream.range(0, n).allMatch(i -> (dp[i] = c[i] + (i == 0 ? 0 : IntStream.range(0, i).mapToLong(j -> dp[j] + S[i] - S[j + 1] - (i - 1 - j) * x[j]).min().getAsLong())) >= 0)
            ? IntStream.range(0, n).mapToLong(j -> dp[j] + S[n] - S[j + 1] - (n - 1 - j) * x[j]).min().getAsLong()
            : 0L);
    }
}




