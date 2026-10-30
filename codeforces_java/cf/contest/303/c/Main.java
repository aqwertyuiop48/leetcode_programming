import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= '0' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0 : st[2] == 0 || (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k
            && new short[1000001] instanceof short[] cnt && new int[1000002] instanceof int[] sm && new int[1000002] instanceof int[] stamp
            && IntStream.range(0, n).filter(i -> Stream.of(0).peek(z -> IntStream.range(i + 1, n).forEach(j -> ++cnt[Math.abs(v[2 + i] - v[2 + j])])).findFirst().isPresent()).count() >= 0
            && IntStream.rangeClosed(1, 1000).filter(t -> Stream.of(0).peek(z -> IntStream.rangeClosed(1, 1000000 / t).forEach(m -> sm[m] += cnt[t * m])).findFirst().isPresent()).count() >= 0
            && IntStream.rangeClosed(1, 1000).filter(m -> Stream.of(0).peek(z -> IntStream.rangeClosed(1001, 1000000 / m).forEach(t -> sm[m] += cnt[t * m])).findFirst().isPresent()).count() >= 0
            ? IntStream.rangeClosed(Math.max(1, n - k), 1000001)
                .filter(m -> sm[m] <= k * (k + 1) / 2 && IntStream.range(0, n).filter(i -> stamp[v[2 + i] % m] != m && (stamp[v[2 + i] % m] = m) > 0).count() >= n - k)
                .findFirst().getAsInt() : "");
    }
}
