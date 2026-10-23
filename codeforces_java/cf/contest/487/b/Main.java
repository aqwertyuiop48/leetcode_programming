import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] == '-'
                    ? (ps[3] = 1) > 0
                    : i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) > Integer.MIN_VALUE && (ps[0] = 0) == 0 && (ps[3] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer lim
            && Integer.valueOf(g[2]) instanceof Integer l
            && new int[n + 2] instanceof int[] mx
            && new int[n + 2] instanceof int[] mn
            && new int[n + 2] instanceof int[] dq
            && new int[n + 2] instanceof int[] dp
            && new int[] {1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0} instanceof int[] s
            && IntStream.range(0, 12 * n + 12).allMatch(w ->
                s[0] > n
                || (s[8] >= 0
                    ? (s[3] > s[2] && g[3 + mx[s[3] - 1]] <= g[3 + s[8]]
                        ? --s[3] >= 0
                        : s[5] > s[4] && g[3 + mn[s[5] - 1]] >= g[3 + s[8]]
                        ? --s[5] >= 0
                        : (mx[s[3]++] = s[8]) >= 0 && (mn[s[5]++] = s[8]) >= 0 && (s[8] = -1) < 0)
                    : s[9] >= 0
                    ? (s[7] > s[6] && dp[dq[s[7] - 1]] >= dp[s[9]]
                        ? --s[7] >= 0
                        : (dq[s[7]++] = s[9]) >= 0 && (s[9] = -1) < 0)
                    : s[10] == 1
                    ? (s[6] < s[7] && dq[s[6]] < s[1]
                        ? ++s[6] > 0
                        : (dp[s[0]] = s[6] < s[7] ? dp[dq[s[6]]] + 1 : 1 << 29) >= 0 && (s[10] = 0) == 0 && ++s[0] > 0 && (s[0] > n || (s[8] = s[0] - 1) >= 0))
                    : (long) g[3 + mx[s[2]]] - g[3 + mn[s[4]]] > lim
                    ? (++s[1] > 0 && (mx[s[2]] >= s[1] || ++s[2] > 0) && (mn[s[4]] >= s[1] || ++s[4] > 0))
                    : (s[9] = s[0] - l >= 0 && dp[s[0] - l] < (1 << 29) ? s[0] - l : -1) < (1 << 30) && (s[10] = 1) > 0))
            ? dp[n] >= (1 << 29) ? -1 : dp[n]
            : -2);
    }
}
