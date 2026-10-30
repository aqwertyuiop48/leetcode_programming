import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] v
            ? IntStream.range(0, 4).anyMatch(m -> (Integer) (m % 2 == 0 ? v[2] : v[3]) instanceof Integer w1 && (Integer) (m % 2 == 0 ? v[3] : v[2]) instanceof Integer h1 && (Integer) (m / 2 == 0 ? v[4] : v[5]) instanceof Integer w2 && (Integer) (m / 2 == 0 ? v[5] : v[4]) instanceof Integer h2
                && (w1 + w2 <= v[0] && Math.max(h1, h2) <= v[1] || h1 + h2 <= v[1] && Math.max(w1, w2) <= v[0])) ? "YES" : "NO" : "");
    }
}
