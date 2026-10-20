import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && IntStream.range(1, n + 1).map(i -> Integer.parseInt(t[i])).sorted().toArray() instanceof int[] a
            ? n - IntStream.range(n / 2, n).reduce(0, (i, j) -> i < n / 2 && 2 * a[i] <= a[j] ? i + 1 : i) : "");
    }
}
