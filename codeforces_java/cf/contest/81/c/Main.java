import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer a
            && Integer.valueOf(g0[2]) instanceof Integer b
            && Integer.valueOf(Math.min(a, b)) instanceof Integer k
            && Integer.valueOf(a < b ? 1 : 2) instanceof Integer lab
            && new int[7] instanceof int[] cnt
            && new int[7] instanceof int[] ge
            && new int[7] instanceof int[] seen
            && IntStream.range(0, n).allMatch(i -> cnt[g0[3 + i]]++ >= 0)
            && IntStream.rangeClosed(1, 5).allMatch(j -> (ge[6 - j] = ge[7 - j] + cnt[6 - j]) >= 0)
            && Integer.valueOf(IntStream.rangeClosed(1, 5).filter(v -> ge[v] >= k).max().getAsInt()) instanceof Integer th
            && Integer.valueOf(k - ge[th + 1]) instanceof Integer take
            && new byte[2 * n] instanceof byte[] o
            && IntStream.range(0, n).allMatch(i ->
                Integer.valueOf(g0[3 + i]) instanceof Integer v
                && Integer.valueOf(seen[v]++) instanceof Integer pos
                && (o[2 * i] = (byte) ('0' + (a.equals(b) ? (i < a ? 1 : 2)
                    : v > th || v == th && (lab == 1 ? pos < take : pos >= cnt[v] - take) ? lab : 3 - lab))) > 0
                && (o[2 * i + 1] = ' ') > 0)
            ? new String(o, 0, 2 * n - 1) : "");
    }
}

