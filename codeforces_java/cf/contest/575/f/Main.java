import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x0
            && new long[]{x0, x0, 0L} instanceof long[] s
            && IntStream.range(0, n).filter(t -> (Long) Long.parseLong(tk.nextToken()) instanceof Long l && (Long) Long.parseLong(tk.nextToken()) instanceof Long r
                && Arrays.stream(new long[]{s[0], s[1], l, r}).sorted().toArray() instanceof long[] p
                && (s[2] += Math.max(0L, s[0] - p[1]) + Math.max(0L, p[1] - s[1]) + Math.max(0L, l - p[1]) + Math.max(0L, p[1] - r)) >= 0 && (s[0] = p[1]) >= 0 && (s[1] = p[2]) >= 0 && false).count() >= 0
            ? s[2] : -1L);
    }
}
