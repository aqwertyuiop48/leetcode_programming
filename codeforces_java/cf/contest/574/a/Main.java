import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            ? IntStream.iterate(0, x -> x + 1).filter(x -> (Integer) IntStream.range(1, n).reduce((p, q) -> a[p] >= a[q] ? p : q).orElse(-1) instanceof Integer j && (j < 0 || a[0] > a[j] || ((a[0]++ | a[j]--) < 0 && false))).findFirst().getAsInt() : -1);
    }
}
