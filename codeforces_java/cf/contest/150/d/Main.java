
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken())).toArray() instanceof int[] c && tk.nextToken().getBytes() instanceof byte[] s
            && (Integer) (n + 9) instanceof Integer W && (Integer) (n + 2) instanceof Integer H
            && new int[(n + 1) * H * W] instanceof int[] P && new int[(n + 1) * H * W] instanceof int[] Q
            && IntStream.rangeClosed(0, n).allMatch(i -> (P[i * H * W + i] = 1000000000) > 0 && (Q[i * H * W + i] = 1000000000) > 0)
            && new int[W * W] instanceof int[] can && new int[W * W] instanceof int[] canT
            && new int[n + 2] instanceof int[] off && new int[1] instanceof int[] cnt
            && (Integer) IntStream.rangeClosed(1, n).map(len -> IntStream.range(1, len).map(k -> (len - k + 7) / 8).sum()).sum() instanceof Integer tot
            && new int[tot + 1] instanceof int[] pk
            && IntStream.rangeClosed(1, n).allMatch(len -> (off[len] = cnt[0]) >= 0 && IntStream.range(1, len).allMatch(k -> IntStream.range(0, (len - k + 7) / 8).allMatch(b -> (pk[cnt[0]++] = k << 8 | b * 8) > 0)))
            && (off[n + 1] = cnt[0]) >= 0
            && new int[n + 2] instanceof int[] acc
            && ((IntUnaryOperator) x -> x < -500000000 ? -1000000000 : x) instanceof IntUnaryOperator cl && ((IntUnaryOperator) x -> x < 500000000 ? 0 : x) instanceof IntUnaryOperator cs
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(l -> (Integer) (l + len) instanceof Integer r
                && (Integer) (l * W + l + 1) instanceof Integer a1 && (Integer) (r * H * W + l + 1) instanceof Integer a2 && (Integer) (l * H * W + l) instanceof Integer b1 && (Integer) (r * W + l) instanceof Integer b2
                && Arrays.stream(pk, off[len], off[len + 1]).map(p -> (acc[p >> 8] = Math.max((p & 255) == 0 ? 0 : acc[p >> 8], Math.max(Math.max(Math.max(Math.max(can[a1 + (p & 255)] + P[a2 + (p >> 8) * W + (p & 255)], Q[b1 + (p >> 8) * (W + 1) + (p & 255)] + canT[b2 + (p >> 8) + (p & 255)]), Math.max(can[a1 + (p & 255) + 1] + P[a2 + (p >> 8) * W + (p & 255) + 1], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 1] + canT[b2 + (p >> 8) + (p & 255) + 1])), Math.max(Math.max(can[a1 + (p & 255) + 2] + P[a2 + (p >> 8) * W + (p & 255) + 2], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 2] + canT[b2 + (p >> 8) + (p & 255) + 2]), Math.max(can[a1 + (p & 255) + 3] + P[a2 + (p >> 8) * W + (p & 255) + 3], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 3] + canT[b2 + (p >> 8) + (p & 255) + 3]))), Math.max(Math.max(Math.max(can[a1 + (p & 255) + 4] + P[a2 + (p >> 8) * W + (p & 255) + 4], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 4] + canT[b2 + (p >> 8) + (p & 255) + 4]), Math.max(can[a1 + (p & 255) + 5] + P[a2 + (p >> 8) * W + (p & 255) + 5], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 5] + canT[b2 + (p >> 8) + (p & 255) + 5])), Math.max(Math.max(can[a1 + (p & 255) + 6] + P[a2 + (p >> 8) * W + (p & 255) + 6], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 6] + canT[b2 + (p >> 8) + (p & 255) + 6]), Math.max(can[a1 + (p & 255) + 7] + P[a2 + (p >> 8) * W + (p & 255) + 7], Q[b1 + (p >> 8) * (W + 1) + (p & 255) + 7] + canT[b2 + (p >> 8) + (p & 255) + 7]))))))).sum() >= Integer.MIN_VALUE
                && (Integer) IntStream.rangeClosed(1, len).map(k -> 0 * (Q[(l * H + k) * W + r] = (P[(r * H + k) * W + l] = cs.applyAsInt(Math.max(k < len ? acc[k] : 0, len >= 2 && k >= 2 && s[l] == s[r - 1] ? Q[((l + 1) * H + k - 2) * W + r - 1] : len == 1 && k == 1 ? 1000000000 : 0))))
                    + Math.max(c[k] != -1 ? Q[(l * H + k) * W + r] - 1000000000 + c[k] : -1000000000, k < len ? can[l * W + l + k] + can[(l + k) * W + r] : -1000000000)).max().getAsInt() instanceof Integer b0
                && (Integer) cl.applyAsInt(b0) instanceof Integer cv
                && (can[l * W + r] = cv) < Integer.MAX_VALUE && (canT[r * W + l] = cv) < Integer.MAX_VALUE
                && (P[(r * H) * W + l] = cv < -500000000 ? 0 : cv + 1000000000) >= 0 && (Q[(l * H) * W + r] = cv < -500000000 ? 0 : cv + 1000000000) >= 0))
            && new int[n + 1] instanceof int[] bp && IntStream.rangeClosed(1, n).allMatch(i -> (bp[i] = Math.max(bp[i - 1], IntStream.range(0, i).filter(j -> can[j * W + i] > -500000000).map(j -> bp[j] + can[j * W + i]).max().orElse(0))) >= 0)
            ? bp[n] : -1);
    }
}



