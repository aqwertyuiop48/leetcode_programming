import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[3] instanceof int[] cur
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48
                ? (cur[0] = cur[0] * 10 + raw[i] - 48) >= 0 && (cur[1] = 1) == 1
                : cur[1] == 0 || ((t[cur[2]++] = cur[0]) >= 0 && (cur[0] = 0) == 0 && (cur[1] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer k
            && new int[1000001] instanceof int[] cnt && new int[4] instanceof int[] st
            && IntStream.range(0, n).allMatch(r -> (st[1] += cnt[t[2 + r]]++ == 0 ? 1 : 0) >= 0
                && IntStream.iterate(0, x -> st[1] > k, x -> x + 1).allMatch(x -> (st[1] -= --cnt[t[2 + st[0]++]] == 0 ? 1 : 0) >= 0)
                && (r - st[0] + 1 > st[2] ? (st[2] = r - st[0] + 1) > 0 && (st[3] = st[0]) >= 0 : true) || true)
            ? (st[3] + 1) + " " + (st[3] + st[2]) : "");
    }
}
