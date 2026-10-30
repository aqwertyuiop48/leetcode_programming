import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) Long.parseLong(tk.nextToken()) instanceof Long x1 && (Long) Long.parseLong(tk.nextToken()) instanceof Long x2
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken())}).map(a -> new long[]{a[0] * x1 + a[1], a[0] * x2 + a[1]})
                .sorted(Comparator.<long[]>comparingLong(a -> a[0]).thenComparingLong(a -> a[1])).toArray(long[][]::new) instanceof long[][] arr
            ? (IntStream.range(0, n - 1).anyMatch(i -> arr[i][1] > arr[i + 1][1]) ? "YES" : "NO") : "");
    }
}
