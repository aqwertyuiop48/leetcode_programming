import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String w && Integer.valueOf(w.length()) instanceof Integer n && new int[n + 1] instanceof int[] nx && (nx[n] = n + 10) > 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (nx[i] = w.startsWith("bear", i) ? i : nx[i + 1]) >= 0)
            ? IntStream.range(0, n).mapToLong(i -> nx[i] + 4 <= n ? n - (nx[i] + 3) : 0).sum() : "");
    }
}
