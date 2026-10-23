import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[n] instanceof int[] res && new boolean[k + 1] instanceof boolean[] lk && new int[k + 1] instanceof int[] cnt
            && IntStream.range(0, m).allMatch(j -> IntStream.range(0, n).allMatch(i -> !(res[i] == 0 && a[i * m + j] > 0 && lk[a[i * m + j]]) || (res[i] = j + 1) > 0)
                && IntStream.range(0, k + 1).allMatch(x -> (cnt[x] = 0) == 0)
                && IntStream.range(0, n).allMatch(i -> res[i] > 0 || a[i * m + j] == 0 || ++cnt[a[i * m + j]] > 0)
                && IntStream.range(0, n).allMatch(i -> res[i] > 0 || a[i * m + j] == 0 || cnt[a[i * m + j]] < 2 || ((res[i] = j + 1) > 0 && (lk[a[i * m + j]] = true))))
            ? IntStream.of(res).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}
