import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(t.length - 2 - n) instanceof Integer tc
            && String.join("", Arrays.copyOfRange(t, 2, 2 + n)) instanceof String g
            && Integer.valueOf(n * m) instanceof Integer N
            && Integer.valueOf(tc + (int) g.chars().filter(c -> c == 66).count()) instanceof Integer k
            && new int[k] instanceof int[] ox && new int[k] instanceof int[] oy && new int[]{tc} instanceof int[] bi
            && IntStream.range(0, N).filter(v -> g.charAt(v) == 66 || Character.isDigit(g.charAt(v))).allMatch(v -> Integer.valueOf(g.charAt(v) == 66 ? bi[0]++ : g.charAt(v) - 49) instanceof Integer o && (ox[o] = v / m) >= 0 && (oy[o] = v % m) >= 0)
            && ((java.util.function.IntBinaryOperator) (lo, y) -> IntStream.range(0, k).filter(i -> ox[i] == lo && oy[i] < y).map(i -> 1 << i).sum()) instanceof java.util.function.IntBinaryOperator tgm
            && IntStream.generate(() -> -1).limit(N * 256).toArray() instanceof int[] dist
            && new int[N * 256] instanceof int[] qu && new int[]{1} instanceof int[] tl
            && (dist[g.indexOf(83) * 256] = 0) == 0 && (qu[0] = g.indexOf(83) * 256) >= 0
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).allMatch(i -> Integer.valueOf(qu[i] >> 8) instanceof Integer v && Integer.valueOf(qu[i] & 255) instanceof Integer mk
                && IntStream.range(0, 4).allMatch(d -> Integer.valueOf(v / m + (d == 0 ? -1 : d == 1 ? 1 : 0)) instanceof Integer nx && Integer.valueOf(v % m + (d == 2 ? -1 : d == 3 ? 1 : 0)) instanceof Integer ny
                    && (nx < 0 || ny < 0 || nx >= n || ny >= m || g.charAt(nx * m + ny) != 46 && g.charAt(nx * m + ny) != 83
                        || Integer.valueOf((nx * m + ny) * 256 + (mk ^ (nx != v / m ? tgm.applyAsInt(Math.min(nx, v / m), v % m) : 0))) instanceof Integer ne && (dist[ne] >= 0
                            || (dist[ne] = dist[qu[i]] + 1) >= 0 && (qu[tl[0]++] = ne) >= 0))))
            ? Math.max(0, IntStream.range(0, 1 << k).filter(mk -> dist[g.indexOf(83) * 256 + mk] >= 0 && mk >> tc == 0).map(mk -> IntStream.range(0, tc).filter(b -> (mk >> b & 1) == 1).map(b -> Integer.parseInt(t[2 + n + b])).sum() - dist[g.indexOf(83) * 256 + mk]).max().orElse(0)) : "");
    }
}
