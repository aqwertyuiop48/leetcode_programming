import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer k && tk.nextToken().getBytes() instanceof byte[] t
            && new int[k] instanceof int[] last && new long[k] instanceof long[] g && new long[]{1} instanceof long[] f
            && IntStream.range(0, k).filter(c -> (last[c] = -1) > 0).count() == 0
            && IntStream.range(0, t.length).filter(i -> (last[t[i] - 'a'] = i) < 0).count() == 0
            && IntStream.range(0, k).boxed().sorted(Comparator.comparingInt(c -> last[c])).mapToInt(c -> c).toArray() instanceof int[] ord
            && IntStream.range(0, t.length + n).filter(i -> Integer.valueOf(i < t.length ? t[i] - 'a' : ord[(i - t.length) % k]) instanceof Integer c
                && (f[0] = (2 * f[0] - g[c] + 1000000007L + 0 * (g[c] = f[0])) % 1000000007L) < 0).count() == 0
            ? f[0] : "");
    }
}
