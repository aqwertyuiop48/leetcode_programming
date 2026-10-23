import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && (Integer) (1 << (k - 1)) instanceof Integer M && new long[M] instanceof long[] cur && new long[M] instanceof long[] nx && (cur[0] = 1) == 1
            && new long[n + 2] instanceof long[] p2 && (p2[0] = 1) == 1 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0)
            && new int[n + 1] instanceof int[] zafter && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (zafter[i] = zafter[i + 1] + (a[i] == 0 ? 1 : 0)) >= 0)
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, M).allMatch(m -> cur[m] == 0 || IntStream.of(2, 4).filter(t -> a[i] == 0 || a[i] == t).allMatch(t -> (Integer) (t == 2 ? m + 1 : (m & 1) == 1 ? 2 : m + 2) instanceof Integer nm
                && (nm >= M ? (ans[0] = (ans[0] + cur[m] * p2[zafter[i + 1]]) % 1000000007L) >= 0 : (nx[nm] = (nx[nm] + cur[m]) % 1000000007L) >= 0)))
                && IntStream.range(0, M).allMatch(m -> (cur[m] = nx[m]) >= 0 && (nx[m] = 0) == 0))
            ? ans[0] : 0);
    }
}
