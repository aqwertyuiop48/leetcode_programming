import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t
            && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(t.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, n).filter(i -> a[i] == 0).toArray() instanceof int[] z
            && new int[n + 1] instanceof int[] p
            && IntStream.range(0, n).filter(i -> (p[i + 1] = p[i] + 1 - a[i]) >= 0).count() >= 0
            && new int[]{-1, 0, 0} instanceof int[] best
            && IntStream.range(0, n).filter(r -> Integer.valueOf(p[r + 1] <= k ? 0 : z[p[r + 1] - k - 1] + 1) instanceof Integer l
                && r - l + 1 > best[0] && (best[0] = r - l + 1) >= 0 && (best[1] = l) >= 0 && (best[2] = r) >= 0).count() >= 0
            ? Math.max(best[0], 0) + "\n" + IntStream.range(0, n).mapToObj(i -> String.valueOf(best[0] > 0 && i >= best[1] && i <= best[2] ? 1 : a[i])).collect(Collectors.joining(" "))
            : "");
    }
}
