import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] seen
            && IntStream.range(0, n).map(i -> a[i] >= 1 && a[i] <= n && seen[a[i]]++ == 0 ? a[i] : 0).toArray() instanceof int[] res
            && IntStream.rangeClosed(1, n).filter(v -> seen[v] == 0).toArray() instanceof int[] u
            && new int[1] instanceof int[] k
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf(res[i] != 0 ? res[i] : u[k[0]++])).collect(Collectors.joining(" "))
            : "");
    }
}
