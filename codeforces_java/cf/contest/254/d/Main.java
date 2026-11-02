import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new String(io.getKey(), StandardCharsets.ISO_8859_1).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m && Integer.valueOf(tk[2]) instanceof Integer d
            && Arrays.stream(tk, 3, 3 + n).collect(Collectors.joining()).toCharArray() instanceof char[] g
            && IntStream.range(0, n * m).filter(x -> g[x] == 'R').toArray() instanceof int[] rats
            ? rats.length > 2 * (2 * d * d + 2 * d + 1) || rats.length == 0 ? "-1"
                : Integer.valueOf(rats.length) instanceof Integer R && Integer.valueOf((R + 63) / 64) instanceof Integer W && Integer.valueOf(2 * d * d + 2 * d + 2) instanceof Integer B
                && new int[R * B] instanceof int[] ball && new int[R] instanceof int[] bs && new int[n * m] instanceof int[] seen && new int[n * m] instanceof int[] id && new int[]{0} instanceof int[] ids
                && new long[(R * B + 1) * W] instanceof long[] bits && new int[B] instanceof int[] dd && new int[]{-1, 1, 0, 0} instanceof int[] dr && new int[]{0, 0, -1, 1} instanceof int[] dc
                && IntStream.range(0, R).allMatch(i -> (ball[i * B] = rats[i]) >= 0 && (seen[rats[i]] = i + 1) > 0 && (bs[i] = 1) > 0 && (dd[0] = 0) == 0
                    && IntStream.iterate(0, h -> h < bs[i], h -> h + 1).allMatch(h -> dd[h] >= d || IntStream.range(0, 4).allMatch(q -> Integer.valueOf(ball[i * B + h] / m + dr[q]) instanceof Integer nr && Integer.valueOf(ball[i * B + h] % m + dc[q]) instanceof Integer nc
                        && (nr < 0 || nc < 0 || nr >= n || nc >= m || g[nr * m + nc] == 'X' || seen[nr * m + nc] == i + 1
                            || (seen[nr * m + nc] = i + 1) > 0 && (ball[i * B + bs[i]] = nr * m + nc) >= 0 && (dd[bs[i]++] = dd[h] + 1) > 0 || true)))
                    && IntStream.range(0, bs[i]).allMatch(k -> (id[ball[i * B + k]] > 0 || (id[ball[i * B + k]] = ++ids[0]) > 0) && (bits[id[ball[i * B + k]] * W + i / 64] |= 1L << i) != 0))
                ? IntStream.range(0, bs[0]).mapToObj(a -> Integer.valueOf(ball[a]) instanceof Integer c1 && Integer.valueOf(id[c1]) instanceof Integer id1
                    && IntStream.range(0, R).filter(i -> (bits[id1 * W + i / 64] >>> (i % 64) & 1) == 0).findFirst() instanceof OptionalInt rem
                    ? rem.isEmpty() ? (c1 / m + 1) + " " + (c1 % m + 1) + " " + (Integer.valueOf(IntStream.range(0, n * m).filter(x -> g[x] != 'X' && x != c1).findFirst().orElse(c1)) instanceof Integer c2 ? (c2 / m + 1) + " " + (c2 % m + 1) : "")
                        : IntStream.range(0, bs[rem.getAsInt()]).map(k -> ball[rem.getAsInt() * B + k])
                            .filter(c2 -> IntStream.range(0, W).allMatch(w -> (bits[id1 * W + w] | bits[id[c2] * W + w]) == (R - 64 * w >= 64 ? -1L : (1L << (R - 64 * w)) - 1)))
                            .mapToObj(c2 -> (c1 / m + 1) + " " + (c1 % m + 1) + " " + (c2 / m + 1) + " " + (c2 % m + 1)).findFirst().orElse(null)
                    : null).filter(Objects::nonNull).findFirst().orElse("-1") : "" : ""));
    }
}
