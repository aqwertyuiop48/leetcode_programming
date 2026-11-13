import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 3] instanceof int[] tok && new long[]{0, 0, 0} instanceof long[] z
            && IntStream.range(0, raw.length + 1).filter(p -> p < raw.length && raw[p] >= 48 ? (z[0] = z[0] * 10 + raw[p] - 48) >= 0 && (z[1] = 1) > 0
                : z[1] == 1 && (tok[(int) z[2]++] = (int) z[0]) >= 0 && (z[0] = 0) == 0 && (z[1] = 0) == 0).count() >= 0
            && (Integer) tok[0] instanceof Integer n
            && new int[n + 3] instanceof int[] cnt && new int[n + 3] instanceof int[] start && new int[n + 3] instanceof int[] pos && new int[n] instanceof int[] bids
            && new int[n + 3] instanceof int[] seen && new int[n + 3] instanceof int[] order && new int[]{0} instanceof int[] mm && new int[n + 3] instanceof int[] stamp && new int[]{0} instanceof int[] ptr
            && IntStream.range(0, n).filter(j -> ++cnt[tok[1 + 2 * j]] > 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(a -> (start[a + 1] = start[a] + cnt[a]) >= 0 && (pos[a] = start[a]) >= 0).count() >= 0
            && IntStream.range(0, n).filter(j -> (bids[pos[tok[1 + 2 * j]]++] = tok[2 + 2 * j]) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> seen[tok[1 + 2 * (n - 1 - i)]] == 0 && (seen[tok[1 + 2 * (n - 1 - i)]] = 1) > 0 && (order[mm[0]++] = tok[1 + 2 * (n - 1 - i)]) > 0).count() >= 0
            && (Integer) mm[0] instanceof Integer m && (Integer) tok[1 + 2 * n] instanceof Integer q && (ptr[0] = 2 + 2 * n) > 0
            ? IntStream.rangeClosed(1, q).mapToObj(qi -> (Integer) tok[ptr[0]] instanceof Integer kk
                && IntStream.range(0, kk).filter(j -> (stamp[tok[ptr[0] + 1 + j]] = qi) > 0).count() >= 0 && (ptr[0] += kk + 1) > 0
                && (Integer) IntStream.range(0, m).filter(i -> stamp[order[i]] != qi).findFirst().orElse(m) instanceof Integer w
                && (Integer) IntStream.range(Math.min(w + 1, m), m).filter(i -> stamp[order[i]] != qi).findFirst().orElse(m) instanceof Integer w2
                ? (w >= m ? "0 0" : order[w] + " " + (w2 >= m ? bids[start[order[w]]] : bids[-Arrays.binarySearch(bids, start[order[w]], start[order[w] + 1], bids[start[order[w2] + 1] - 1]) - 1])) : "")
                .collect(Collectors.joining("\n")) : "");
    }
}
