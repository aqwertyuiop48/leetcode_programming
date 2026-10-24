import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] buf
            && new int[buf.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] sc
            && IntStream.rangeClosed(0, buf.length).allMatch(i ->
                i < buf.length && buf[i] >= '0' && buf[i] <= '9'
                    ? (sc[0] = sc[0] * 10 + buf[i] - '0') >= 0 && (sc[2] = 1) > 0
                    : (sc[2] != 1 || ((t[sc[1]++] = sc[0]) >= 0 && (sc[0] = 0) == 0)) && (sc[2] = 0) == 0)
            && (Integer) t[0] instanceof Integer cows
            && (Integer) t[cows + 1] instanceof Integer plans
            && (Integer) (cows + 2) instanceof Integer qo
            && new int[cows + 2] instanceof int[] first
            && IntStream.range(0, plans).allMatch(k -> ++first[t[qo + 2 * k + 1] + 1] > 0)
            && IntStream.rangeClosed(1, cows + 1).allMatch(s -> (first[s] += first[s - 1]) >= 0)
            && Arrays.copyOf(first, cows + 2) instanceof int[] fill
            && new int[plans] instanceof int[] by
            && IntStream.range(0, plans).allMatch(k -> (by[fill[t[qo + 2 * k + 1]]++] = k) >= 0)
            && new long[2 * cows + 2] instanceof long[] suf
            && new long[plans] instanceof long[] res
            && IntStream.rangeClosed(1, cows).allMatch(step ->
                first[step] == first[step + 1]
                || ((Long) IntStream.range(first[step], first[step + 1]).mapToLong(j -> (cows - t[qo + 2 * by[j]]) / step + 1).sum() instanceof Long work
                    && (Integer) (IntStream.range(first[step], first[step + 1]).map(j -> t[qo + 2 * by[j]]).min().getAsInt() - 1) instanceof Integer low
                    && (3 * work > cows - low
                        ? IntStream.range(0, cows - low).mapToLong(u -> suf[cows - 1 - u] = t[cows - u] + suf[cows - 1 - u + step]).sum() >= Long.MIN_VALUE
                            && IntStream.range(first[step], first[step + 1]).allMatch(j -> (res[by[j]] = suf[t[qo + 2 * by[j]] - 1]) >= 0)
                        : IntStream.range(first[step], first[step + 1]).allMatch(j ->
                            (Integer) t[qo + 2 * by[j]] instanceof Integer from
                            && (res[by[j]] = IntStream.range(0, (cows - from) / step + 1).mapToLong(u -> t[from + u * step]).sum()) >= 0))))
            && new StringBuilder() instanceof StringBuilder out
            && Arrays.stream(res).allMatch(x -> out.append(x).append('\n') != null)
            ? out
            : "");
    }


}
