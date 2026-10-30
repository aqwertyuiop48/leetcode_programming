import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && (Integer) ((n - a[0]) % n) instanceof Integer sh
            && IntStream.range(0, n).allMatch(i -> i % 2 == 0 ? (a[i] + sh) % n == i : ((a[i] - sh) % n + n) % n == i) ? "Yes" : "No");
    }
}
