
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new long[2][100001] instanceof long[][] pk && new long[100001] instanceof long[] up
            && IntStream.range(0, n * 17).filter(t -> (a[t / 17] >> (t % 17)) > 0).mapToLong(t -> pk[t % 17 == 0 || ((a[t / 17] >> (t % 17 - 1)) & 1) == 1 ? 1 : 0][a[t / 17] >> (t % 17)] += 1 + ((long) (t % 17) << 20)).max().isPresent()
            && IntStream.rangeClosed(1, 100000).mapToLong(v -> up[v] = pk[1][v] + (v % 2 == 0 ? up[v / 2] + ((up[v / 2] & 1048575) << 20) : 0)).max().isPresent()
            ? IntStream.rangeClosed(1, 100000).filter(v -> (up[v] & 1048575) + (pk[0][v] & 1048575) == n).mapToLong(v -> (up[v] >> 20) + (pk[0][v] >> 20)).min().getAsLong() : "");
    }
}



