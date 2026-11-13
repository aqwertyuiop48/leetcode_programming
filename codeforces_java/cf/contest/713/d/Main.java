import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] all && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48
                ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 && (ps[2] = 1) > 0
                : ps[2] == 0 || ((all[ps[0]++] = ps[1]) >= 0 && (ps[1] = 0) == 0 && (ps[2] = 0) == 0))
            && Integer.valueOf(all[0]) instanceof Integer n && Integer.valueOf(all[1]) instanceof Integer m
            && Integer.valueOf(32 - Integer.numberOfLeadingZeros(n)) instanceof Integer LA && Integer.valueOf(32 - Integer.numberOfLeadingZeros(m)) instanceof Integer LB
            && new short[LA * LB][] instanceof short[][] T
            && IntStream.range(0, LA * LB).allMatch(x -> (T[x] = new short[(n - (1 << (x / LB)) + 1) * (m - (1 << (x % LB)) + 1)]) != null)
            && IntStream.range(0, n * m).allMatch(idx -> (T[0][idx] = (short) (all[2 + idx] == 0 ? 0
                : idx / m == 0 || idx % m == 0 ? 1 : 1 + Math.min(T[0][idx - m - 1], Math.min(T[0][idx - m], T[0][idx - 1])))) >= 0)
            && Stream.of(0).peek(z0 -> IntStream.range(1, LB).forEach(x -> IntStream.range(0, n).parallel().forEach(i -> IntStream.range(0, m - (1 << x) + 1).forEach(j -> T[x][i * (m - (1 << x) + 1) + j] = (short) Math.max(T[x - 1][i * (m - (1 << (x - 1)) + 1) + j], T[x - 1][i * (m - (1 << (x - 1)) + 1) + j + (1 << (x - 1))])))))
                .findFirst().isPresent()
            && Stream.of(0).peek(z0 -> IntStream.range(LB, LA * LB).forEach(x -> IntStream.range(0, T[x].length).parallel().forEach(c -> T[x][c] = (short) Math.max(T[x - LB][c], T[x - LB][c + (1 << (x / LB - 1)) * (m - (1 << (x % LB)) + 1)]))))
                .findFirst().isPresent()
            && new int[Math.max(n, m) + 2] instanceof int[] lg
            && IntStream.range(2, lg.length).allMatch(i -> (lg[i] = lg[i / 2] + 1) > 0)
            && ((ToIntFunction<int[]>) q -> Integer.valueOf(lg[q[2] - q[0] + 1]) instanceof Integer a && Integer.valueOf(lg[q[3] - q[1] + 1]) instanceof Integer b
                && T[a * LB + b] instanceof short[] arr && Integer.valueOf(m - (1 << b) + 1) instanceof Integer cb
                && Integer.valueOf(q[2] - (1 << a) + 1) instanceof Integer ra && Integer.valueOf(q[3] - (1 << b) + 1) instanceof Integer cc
                ? Math.max(Math.max(arr[q[0] * cb + q[1]], arr[ra * cb + q[1]]), Math.max(arr[q[0] * cb + cc], arr[ra * cb + cc])) : 0) instanceof ToIntFunction<int[]> qmax
            && Integer.valueOf(all[2 + n * m]) instanceof Integer t && new int[t] instanceof int[] res
            && IntStream.range(0, t).parallel().allMatch(qi -> Integer.valueOf(3 + n * m + 4 * qi) instanceof Integer o
                && Integer.valueOf(all[o] - 1) instanceof Integer r1 && Integer.valueOf(all[o + 1] - 1) instanceof Integer c1
                && Integer.valueOf(all[o + 2] - 1) instanceof Integer r2 && Integer.valueOf(all[o + 3] - 1) instanceof Integer c2
                && new int[]{0, Math.min(r2 - r1 + 1, c2 - c1 + 1)} instanceof int[] bs
                && IntStream.range(0, 11).allMatch(z -> bs[0] >= bs[1]
                    || (qmax.applyAsInt(new int[]{r1 + (bs[0] + bs[1] + 1) / 2 - 1, c1 + (bs[0] + bs[1] + 1) / 2 - 1, r2, c2}) >= (bs[0] + bs[1] + 1) / 2
                        ? (bs[0] = (bs[0] + bs[1] + 1) / 2) >= 0 : (bs[1] = (bs[0] + bs[1] + 1) / 2 - 1) >= 0))
                && (res[qi] = bs[0]) >= 0)
            ? Arrays.stream(res).mapToObj(Integer::toString).collect(Collectors.joining("\n")) : "");
    }
}
