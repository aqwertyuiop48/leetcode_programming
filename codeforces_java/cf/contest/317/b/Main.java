import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] nm && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] == 45 ? (st[3] = 1) > 0
                : i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((nm[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != 0x7fffffff & (st[0] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0)) || true)
            && Integer.valueOf(nm[0]) instanceof Integer n && Integer.valueOf(nm[1]) instanceof Integer t
            && Integer.valueOf(200) instanceof Integer R && Integer.valueOf(2 * R + 1) instanceof Integer W
            && new int[W * W] instanceof int[] cnt && new int[W * W] instanceof int[] ring && new int[2] instanceof int[] qp && (cnt[R * W + R] = n) == n && (ring[0] = R * W + R) >= 0 && (qp[1] = 1) == 1
            && ((IntBinaryOperator) (v, k) -> (cnt[v] += k) >= 4 && cnt[v] - k < 4 && (ring[qp[1]] = v) >= 0 && (qp[1] = qp[1] + 1 == W * W ? 0 : qp[1] + 1) >= 0 ? 1 : 0) instanceof IntBinaryOperator nb
            && IntStream.generate(() -> 0).anyMatch(z -> qp[0] == qp[1] || (Integer.valueOf(ring[qp[0]]) instanceof Integer u && (qp[0] = qp[0] + 1 == W * W ? 0 : qp[0] + 1) >= 0
                && Integer.valueOf(cnt[u] / 4) instanceof Integer k && (cnt[u] -= 4 * k) >= 0
                && nb.applyAsInt(u - 1, k) + nb.applyAsInt(u + 1, k) + nb.applyAsInt(u - W, k) + nb.applyAsInt(u + W, k) >= 0 && false))
            ? IntStream.range(0, t).mapToObj(i -> Math.abs(nm[2 + 2 * i]) > R || Math.abs(nm[3 + 2 * i]) > R ? "0"
                : String.valueOf(cnt[(nm[3 + 2 * i] + R) * W + nm[2 + 2 * i] + R])).collect(Collectors.joining("\n")) : "");
    }
}
