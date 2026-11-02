import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] t && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] > 47
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0
                : st[2] == 0 || ((t[st[1]++] = st[0]) >= 0 & (st[0] = 0) == 0 & (st[2] = 0) == 0)) || true)
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(3002) instanceof Integer W
            && Integer.valueOf(W * W) instanceof Integer N
            && new int[N] instanceof int[] pf && new short[N] instanceof short[] tr && new short[N] instanceof short[] lr
            && new short[N] instanceof short[] br && new short[N] instanceof short[] rr
            && IntStream.range(0, n).allMatch(r -> (pf[(t[1 + 4 * r] + 1) * W + t[2 + 4 * r] + 1] += 1) > Integer.MIN_VALUE
                && (pf[(t[3 + 4 * r] + 1) * W + t[2 + 4 * r] + 1] -= 1) > Integer.MIN_VALUE
                && (pf[(t[1 + 4 * r] + 1) * W + t[4 + 4 * r] + 1] -= 1) > Integer.MIN_VALUE
                && (pf[(t[3 + 4 * r] + 1) * W + t[4 + 4 * r] + 1] += 1) > Integer.MIN_VALUE
                && IntStream.range(t[2 + 4 * r], t[4 + 4 * r]).allMatch(j -> (tr[(t[1 + 4 * r] + 1) * W + j + 1] = 1) > 0 && (br[t[3 + 4 * r] * W + j + 1] = 1) > 0)
                && IntStream.range(t[1 + 4 * r], t[3 + 4 * r]).allMatch(i -> (lr[(i + 1) * W + t[2 + 4 * r] + 1] = 1) > 0 && (rr[(i + 1) * W + t[4 + 4 * r]] = 1) > 0))
            && IntStream.range(1, W).allMatch(i -> IntStream.range(1, W).allMatch(j -> (pf[i * W + j] += pf[(i - 1) * W + j] + pf[i * W + j - 1] - pf[(i - 1) * W + j - 1]) > Integer.MIN_VALUE))
            && IntStream.range(1, W).allMatch(i -> IntStream.range(1, W).allMatch(j -> (pf[i * W + j] += pf[(i - 1) * W + j] + pf[i * W + j - 1] - pf[(i - 1) * W + j - 1]) > Integer.MIN_VALUE))
            && IntStream.range(0, N - W).allMatch(z -> Integer.valueOf(N - W - 1 - z) instanceof Integer d
                && (tr[d] = (short) (tr[d] == 0 ? 0 : 1 + tr[d + 1])) >= 0 && (lr[d] = (short) (lr[d] == 0 ? 0 : 1 + lr[d + W])) >= 0)
            && IntStream.range(W, N).allMatch(d -> (br[d] = (short) (br[d] == 0 ? 0 : 1 + br[d - 1])) >= 0 && (rr[d] = (short) (rr[d] == 0 ? 0 : 1 + rr[d - W])) >= 0)
            && IntStream.range(0, n).mapToObj(r -> Integer.valueOf(t[1 + 4 * r]) instanceof Integer x && Integer.valueOf(t[2 + 4 * r]) instanceof Integer y
                && IntStream.rangeClosed(1, Math.min(tr[(x + 1) * W + y + 1], lr[(x + 1) * W + y + 1]))
                    .takeWhile(s -> pf[(x + s) * W + y + s] - pf[x * W + y + s] - pf[(x + s) * W + y] + pf[x * W + y] == s * s)
                    .filter(s -> br[(x + s) * W + y + s] >= s && rr[(x + s) * W + y + s] >= s).findFirst() instanceof OptionalInt os && os.isPresent()
                ? new int[]{x, y, os.getAsInt()} : null).filter(Objects::nonNull).findFirst() instanceof Optional<int[]> res
            ? res.isPresent() ? IntStream.range(0, n).filter(r -> t[1 + 4 * r] >= res.get()[0] && t[2 + 4 * r] >= res.get()[1] && t[3 + 4 * r] <= res.get()[0] + res.get()[2] && t[4 + 4 * r] <= res.get()[1] + res.get()[2])
                .mapToObj(r -> String.valueOf(r + 1)).collect(Collectors.toList()) instanceof List<String> ids ? "YES " + ids.size() + "\n" + String.join(" ", ids) : "" : "NO" : "");
    }
}
