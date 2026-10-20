import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(3000) instanceof Integer N
            && new int[N * N] instanceof int[] id
            && IntStream.range(0, n).allMatch(r -> IntStream.range(t[1 + 4 * r], t[3 + 4 * r]).allMatch(i -> IntStream.range(t[2 + 4 * r], t[4 + 4 * r]).allMatch(j -> (id[i * N + j] = r + 1) > 0)))
            && new short[N * N] instanceof short[] bR && new short[N * N] instanceof short[] lU && new short[N * N] instanceof short[] tL && new short[N * N] instanceof short[] rD
            && IntStream.iterate(N - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.iterate(N - 1, j -> j >= 0, j -> j - 1).allMatch(j -> id[i * N + j] > 0
                ? (bR[i * N + j] = t[2 + 4 * (id[i * N + j] - 1)] == j ? (short) (1 + (i + 1 < N ? bR[(i + 1) * N + j] : 0)) : 0) >= 0
                    & (lU[i * N + j] = t[1 + 4 * (id[i * N + j] - 1)] == i ? (short) (1 + (j + 1 < N ? lU[i * N + j + 1] : 0)) : 0) >= 0 : true))
            && IntStream.range(0, N).allMatch(i -> IntStream.range(0, N).allMatch(j -> id[i * N + j] > 0
                ? (tL[i * N + j] = t[4 + 4 * (id[i * N + j] - 1)] == j + 1 ? (short) (1 + (i > 0 ? tL[(i - 1) * N + j] : 0)) : 0) >= 0
                    & (rD[i * N + j] = t[3 + 4 * (id[i * N + j] - 1)] == i + 1 ? (short) (1 + (j > 0 ? rD[i * N + j - 1] : 0)) : 0) >= 0 : true))
            && new int[(N + 1) * (N + 1)] instanceof int[] pf
            && IntStream.range(0, N).allMatch(i -> IntStream.range(0, N).allMatch(j -> (pf[(i + 1) * (N + 1) + j + 1] = (id[i * N + j] > 0 ? 1 : 0) + pf[i * (N + 1) + j + 1] + pf[(i + 1) * (N + 1) + j] - pf[i * (N + 1) + j]) >= 0))
            && IntStream.range(0, n).mapToObj(r -> Integer.valueOf(t[1 + 4 * r]) instanceof Integer x && Integer.valueOf(t[2 + 4 * r]) instanceof Integer y
                && IntStream.rangeClosed(1, Math.min(bR[x * N + y], lU[x * N + y])).takeWhile(s -> pf[(x + s) * (N + 1) + y + s] - pf[x * (N + 1) + y + s] - pf[(x + s) * (N + 1) + y] + pf[x * (N + 1) + y] == s * s)
                    .filter(s -> tL[(x + s - 1) * N + y + s - 1] >= s && rD[(x + s - 1) * N + y + s - 1] >= s).findFirst() instanceof OptionalInt os && os.isPresent()
                ? new int[]{x, y, os.getAsInt()} : null).filter(Objects::nonNull).findFirst() instanceof Optional<int[]> res
            ? res.isPresent() ? IntStream.range(0, n).filter(r -> t[1 + 4 * r] >= res.get()[0] && t[2 + 4 * r] >= res.get()[1] && t[3 + 4 * r] <= res.get()[0] + res.get()[2] && t[4 + 4 * r] <= res.get()[1] + res.get()[2])
                .mapToObj(r -> String.valueOf(r + 1)).collect(Collectors.toList()) instanceof List<String> ids ? "YES " + ids.size() + "\n" + String.join(" ", ids) : "" : "NO" : "");
    }
}
