import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m
            ? (IntStream.range(0, m).anyMatch(x -> IntStream.range(x, m).anyMatch(y -> IntStream.range(0, n).allMatch(r ->
                IntStream.range(0, m).filter(c -> a[2 + r * m + (c == x ? y : c == y ? x : c)] != c + 1).count() <= 2))) ? "YES" : "NO") : "");
    }
}
