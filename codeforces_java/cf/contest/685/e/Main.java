import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[2] instanceof int[] ix && new int[1] instanceof int[] cu
            && IntStream.range(0, raw.length).filter(p -> (v[ix[0] += (raw[p] < 48 && p > 0 && raw[p - 1] >= 48 ? 1 : 0)] = cu[0] = raw[p] >= 48 ? cu[0] * 10 + raw[p] - 48 : 0) < 0).count() == 0
            && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m && (Integer) v[2] instanceof Integer q
            && new int[n * n] instanceof int[] dd && new int[m + 2] instanceof int[] head && new int[q] instanceof int[] nxt && new boolean[q] instanceof boolean[] res
            && IntStream.range(0, n * n).filter(k -> (dd[k] = k / n == k % n ? 0 : 1 << 29) < 0).count() == 0
            && IntStream.rangeClosed(0, m + 1).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, q).filter(j -> (nxt[j] = head[v[3 + 2 * m + 4 * j]]) + (head[v[3 + 2 * m + 4 * j]] = j) < -1).count() == 0
            && IntStream.range(0, m).map(k -> m - k).filter(i -> (Integer) ((v[1 + 2 * i] - 1) * n) instanceof Integer ab && (Integer) ((v[2 + 2 * i] - 1) * n) instanceof Integer bb
                && (Stream.of(0).peek(z -> IntStream.range(0, n).forEach(u -> dd[ab + u] = dd[bb + u] = Math.min(dd[ab + u], dd[bb + u]))).findFirst().isPresent() ? 0 : 1)
                    + (dd[ab + v[1 + 2 * i] - 1] = 0) + (dd[bb + v[2 + 2 * i] - 1] = 0) + (dd[ab + v[2 + 2 * i] - 1] = i) + (dd[bb + v[1 + 2 * i] - 1] = i)
                    + IntStream.iterate(head[i], j -> j >= 0, j -> nxt[j]).filter(j -> res[j] = dd[(v[5 + 2 * m + 4 * j] - 1) * n + v[6 + 2 * m + 4 * j] - 1] <= v[4 + 2 * m + 4 * j]).count() < 0).count() == 0
            ? IntStream.range(0, q).mapToObj(j -> res[j] ? "Yes" : "No").collect(Collectors.joining("\n")) : "");
    }
}
