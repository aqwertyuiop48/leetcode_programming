import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 4] instanceof long[] tok && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tok[0]) instanceof Integer n && new int[n + 2] instanceof int[] a && new int[18][n + 2] instanceof int[][] sp && new long[n + 2] instanceof long[] dp && new long[1] instanceof long[] tot
            && IntStream.range(1, n).filter(i -> (a[i] = (int) tok[i]) > 0).count() >= 0 && (a[n] = n) > 0
            && IntStream.rangeClosed(1, n).filter(i -> (sp[0][i] = i) > 0).count() >= 0
            && IntStream.range(1, 18).filter(k -> IntStream.rangeClosed(1, n - (1 << k) + 1).filter(i -> (sp[k][i] = a[sp[k - 1][i]] >= a[sp[k - 1][i + (1 << (k - 1))]] ? sp[k - 1][i] : sp[k - 1][i + (1 << (k - 1))]) > 0).count() >= 0).count() >= 0
            && IntStream.range(1, n).map(q -> n - q).filter(i -> Integer.valueOf(i + 1) instanceof Integer l && Integer.valueOf(a[i]) instanceof Integer r && Integer.valueOf(31 - Integer.numberOfLeadingZeros(r - l + 1)) instanceof Integer k
                && Integer.valueOf(a[sp[k][l]] >= a[sp[k][r - (1 << k) + 1]] ? sp[k][l] : sp[k][r - (1 << k) + 1]) instanceof Integer m
                && (dp[i] = dp[m] - (r - m) + n - i) * 0 == 0 && (tot[0] += dp[i]) * 0 == 0).count() >= 0
            ? tot[0] : "");
    }
}
