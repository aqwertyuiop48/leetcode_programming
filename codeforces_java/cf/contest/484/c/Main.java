import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] <= ' ').findFirst().orElse(raw.length)) instanceof Integer n
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && i > n && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer m
            && new byte[m * (n + 1)] instanceof byte[] out
            && new int[n] instanceof int[] ord
            && new int[n] instanceof int[] buf
            && new int[n] instanceof int[] csArr
            && new int[n] instanceof int[] cycLen
            && new int[n] instanceof int[] vis
            && new int[16] instanceof int[] s
            && IntStream.range(0, 5 * n * m + 1).allMatch(w ->
                s[0] >= m
                || (s[1] == 0
                    ? (s[2] != 0
                            || ((s[3] = g[1 + 2 * s[0]]) > 0 && (s[4] = g[2 + 2 * s[0]]) > 0 && (s[5] = n - s[3] + 1) > 0
                                && (s[6] = s[0] * (n + 1)) >= 0 && (s[7] = 0) == 0 && (s[8] = 0) == 0 && (s[9] = 0) == 0
                                && (s[10] = 0) == 0 && (s[11] = 0) == 0 && (s[13] = 0) == 0))
                        && (s[2] >= s[3]
                            ? (ord[s[2]] = s[2]) >= 0
                            : ((ord[s[2]] = s[8]) >= 0 && ((s[8] += s[4]) < s[3] || (s[8] = ++s[7]) >= 0)))
                        && (++s[2] < n || (s[2] = 0) == 0 && (s[1] = 1) > 0)
                    : s[1] == 1
                    ? (s[13] == 1
                        ? (vis[s[11]] != s[0] + 1
                            ? (s[9] = s[11]) >= 0 && (s[10] = s[2]) >= 0 && (s[13] = 0) == 0
                            : ++s[11] > 0)
                        : ((buf[s[2]] = s[9]) >= 0 && (vis[s[9]] = s[0] + 1) > 0 && (csArr[s[2]] = s[10]) >= 0
                            && Integer.valueOf(s[9] + 1 == n ? ord[0] : ord[s[9] + 1]) instanceof Integer nx
                            && (vis[nx] != s[0] + 1
                                ? (s[9] = nx) >= 0
                                : (cycLen[s[10]] = s[2] + 1 - s[10]) > 0 && (s[13] = 1) > 0)
                            && (++s[2] < n || (s[2] = 0) == 0 && (s[1] = 2) > 0)))
                    : s[1] == 2
                    ? Integer.valueOf(csArr[s[2]]) instanceof Integer cs
                        && Integer.valueOf(cycLen[cs]) instanceof Integer len
                        && (out[s[6] + (buf[s[2]] + s[5]) % n] = raw[buf[cs + (s[2] - cs + s[5]) % len]]) > 0
                        && (++s[2] < n || (s[2] = 0) == 0 && (s[1] = 3) > 0)
                    : (raw[s[2]] = out[s[6] + s[2]]) > 0
                        && (s[2] != 0 || (out[s[6] + n] = '\n') > 0)
                        && (++s[2] < n || (s[2] = 0) == 0 && (s[1] = 0) == 0 && ++s[0] > 0)))
            ? new String(out)
            : "");
    }
}
