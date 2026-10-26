import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && new boolean[n] instanceof boolean[] bb && new boolean[m] instanceof boolean[] gg
            && IntStream.range(0, s.nextInt()).allMatch(i -> (bb[s.nextInt()] = true))
            && IntStream.range(0, s.nextInt()).allMatch(i -> (gg[s.nextInt()] = true))
            && IntStream.range(0, 2 * n * m + 5).allMatch(i -> (bb[i % n] || gg[i % m]) && (bb[i % n] = gg[i % m] = true) || true)
            ? IntStream.range(0, n).allMatch(i -> bb[i]) && IntStream.range(0, m).allMatch(j -> gg[j]) ? "Yes" : "No" : "");
    }
}
