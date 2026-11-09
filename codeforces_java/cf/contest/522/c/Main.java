import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && IntStream.generate(() -> Integer.parseInt(tk.nextToken())).limit(tk.countTokens()).toArray() instanceof int[] z
            && new int[]{1} instanceof int[] pos
            ? IntStream.range(0, z[0]).mapToObj(tc -> (Integer) pos[0] instanceof Integer b && (Integer) z[b] instanceof Integer m && (Integer) z[b + 1] instanceof Integer k
                && (Integer) (b + 2 + k) instanceof Integer pb && (pos[0] = pb + 2 * (m - 1)) > 0
                && new int[]{-1, 0, 0} instanceof int[] st && new int[k + 1] instanceof int[] cb && new int[k + 1] instanceof int[] ct
                && IntStream.range(0, m - 1).allMatch(i -> (st[0] >= 0 || z[pb + 2 * i + 1] != 1 || (st[0] = i) >= 0)
                    && (z[pb + 2 * i] == 0 ? (st[0] >= 0 || ++st[1] > 0) && ++st[2] > 0 : (st[0] >= 0 || ++cb[z[pb + 2 * i]] > 0) && ++ct[z[pb + 2 * i]] > 0))
                && (Integer) (st[0] < 0 ? m - 1 : st[0]) instanceof Integer p && (Integer) st[1] instanceof Integer up && (Integer) st[2] instanceof Integer ut
                && (Integer) (p == m - 1 ? 0 : IntStream.rangeClosed(1, k).filter(d -> z[b + 1 + d] - cb[d] <= up && ct[d] == cb[d]).map(d -> Math.max(0, z[b + 1 + d] - cb[d])).min().orElse(0)) instanceof Integer mn
                ? new String(IntStream.rangeClosed(1, k).map(e -> p < m - 1 && z[b + 1 + e] - cb[e] <= up && ct[e] == cb[e] || z[b + 1 + e] - ct[e] <= ut - mn ? 'Y' : 'N').toArray(), 0, k) : "").collect(Collectors.joining("\n")) : "");
    }
}
