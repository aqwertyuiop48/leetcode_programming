import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new long[n + 1] instanceof long[] stk && new int[1] instanceof int[] sz && new long[1] instanceof long[] tot
            && IntStream.range(0, n).allMatch(i -> (Long) Long.parseLong(tk.nextToken()) instanceof Long a
                && (IntStream.range(0, n).anyMatch(k -> !(sz[0] >= 2 && stk[sz[0] - 1] <= stk[sz[0] - 2] && stk[sz[0] - 1] <= a && (tot[0] += Math.min(stk[sz[0] - 2], a)) >= 0 && --sz[0] >= 0)) || true)
                && (stk[sz[0]++] = a) >= 0)
            ? tot[0] + (sz[0] >= 2 ? Arrays.stream(stk, 0, sz[0]).sorted().limit(sz[0] - 2).sum() : 0) : 0);
    }
}
