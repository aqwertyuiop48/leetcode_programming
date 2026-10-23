import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer p && (Integer) s.nextInt() instanceof Integer n && new boolean[p] instanceof boolean[] used
            ? IntStream.rangeClosed(1, n).filter(i -> (Integer) (s.nextInt() % p) instanceof Integer b && (used[b] || !(used[b] = true))).findFirst().orElse(-1) : 0);
    }
}
