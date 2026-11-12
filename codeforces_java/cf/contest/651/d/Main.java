import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && Long.valueOf(tk.nextToken()) instanceof Long a && Long.valueOf(tk.nextToken()) instanceof Long b && Long.valueOf(tk.nextToken()) instanceof Long t
            && tk.nextToken() instanceof String s
            && new long[n] instanceof long[] r && new long[n] instanceof long[] l
            && IntStream.range(1, n).filter(i -> (r[i] = r[i - 1] + 1 + (s.charAt(i) == 'w' ? b : 0)) < 0 || (l[i] = l[i - 1] + 1 + (s.charAt(n - i) == 'w' ? b : 0)) < 0).count() == 0
            && Long.valueOf(1 + (s.charAt(0) == 'w' ? b : 0)) instanceof Long c0 && new long[]{0, n - 1, 0} instanceof long[] st
            && IntStream.range(0, 2 * n + 5).takeWhile(k -> st[0] < n && st[1] >= 0)
                .peek(k -> st[2] = st[0] + st[1] > n - 1 || c0 + r[(int) st[0]] + l[(int) st[1]] + a * Math.min(2 * st[0] + st[1], st[0] + 2 * st[1]) > t
                    ? --st[1] * 0 + st[2] : Math.max(st[2], 1 + st[0] + st[1]) + 0 * ++st[0]).count() >= 0
            ? st[2] : "");
    }
}
