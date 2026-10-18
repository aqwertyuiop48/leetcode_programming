import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m ? IntStream.range(0, n).mapToObj(q -> Optional.of(Integer.parseInt(tk.nextToken())).map(c -> IntStream.generate(() -> Integer.parseInt(tk.nextToken())).limit(c).toArray()).get()).reduce(new int[m + 1], (dp, v) -> Optional.of(IntStream.rangeClosed(0, v.length).map(i -> IntStream.range(0, i).map(z -> v[z]).sum()).toArray()).map(p -> Optional.of(IntStream.rangeClosed(0, v.length).map(k -> IntStream.rangeClosed(0, k).map(l -> p[l] + p[v.length] - p[v.length - (k - l)]).max().getAsInt()).toArray()).map(bs -> IntStream.rangeClosed(0, m).parallel().map(j -> IntStream.rangeClosed(0, Math.min(v.length, j)).map(k -> dp[j - k] + bs[k]).max().getAsInt()).toArray()).get()).get(), (x, y) -> x)[m] : -1);
    }
}
