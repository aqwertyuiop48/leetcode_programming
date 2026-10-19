import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && Integer.valueOf(nums[0]) instanceof Integer n
            && Integer.valueOf(nums[1]) instanceof Integer m
            && new double[m * n] instanceof double[] P
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j ->
                (P[j * n + i] = nums[2 + i * m + j] / 1000.0) >= 0))
            && new double[m * (n + 1)] instanceof double[] F
            && new double[m] instanceof double[] S
            && new double[2] instanceof double[] tmp
            && new double[1] instanceof double[] ans
            && IntStream.range(0, m).allMatch(j ->
                (F[j * (n + 1)] = 1) > 0
                && IntStream.rangeClosed(1, n).allMatch(i -> (F[j * (n + 1) + i] = F[j * (n + 1) + i - 1] * (1 - P[j * n + i - 1])) >= 0)
                && (S[j] = F[j * (n + 1) + n]) >= 0)
            && IntStream.range(0, n).allMatch(step ->
                (Integer) IntStream.range(0, m).reduce((x, y) -> S[y] < S[x] ? y : x).getAsInt() instanceof Integer j
                && Integer.valueOf(j * (n + 1)) instanceof Integer b
                && (ans[0] += 1 - S[j]) >= 0
                && (tmp[0] = F[b]) >= 0
                && (F[b] = 0) == 0
                && IntStream.rangeClosed(1, n).allMatch(i ->
                    (tmp[1] = F[b + i]) >= 0
                    && (F[b + i] = F[b + i - 1] * (1 - P[j * n + i - 1]) + tmp[0] * P[j * n + i - 1]) >= 0
                    && (tmp[0] = tmp[1]) >= 0)
                && (S[j] += F[b + n]) >= 0)
            ? String.format(java.util.Locale.ROOT, "%.12f", ans[0])
            : "");
    }
}
