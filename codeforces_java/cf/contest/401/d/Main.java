
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && (Integer) Integer.parseInt(t[1]) instanceof Integer m
            && new int[10] instanceof int[] cnt
            && t[0].chars().allMatch(c -> ++cnt[c - '0'] > 0)
            && new int[11] instanceof int[] mult && (mult[0] = 1) > 0
            && IntStream.range(0, 10).allMatch(d -> (mult[d + 1] = mult[d] * (cnt[d] + 1)) > 0)
            && new long[mult[10] * m] instanceof long[] dp && (dp[0] = 1) > 0
            && IntStream.range(0, mult[10]).allMatch(s -> IntStream.range(0, 10).allMatch(d ->
                s / mult[d] % (cnt[d] + 1) >= cnt[d] || (s == 0 && d == 0)
                || IntStream.range(0, m).allMatch(r -> (dp[(s + mult[d]) * m + (r * 10 + d) % m] += dp[s * m + r]) >= 0)))
            ? dp[(mult[10] - 1) * m] : 0);
    }
}



