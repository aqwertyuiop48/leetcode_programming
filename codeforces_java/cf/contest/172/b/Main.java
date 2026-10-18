import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long a
            && Long.valueOf(s.nextLong()) instanceof Long b
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new long[]{s.nextLong()} instanceof long[] st
            && IntStream.generate(() -> -1).limit(m).toArray() instanceof int[] seen
            ? IntStream.iterate(0, i -> true, i -> i + 1).filter(i -> seen[(int) st[0]] >= 0 || !((seen[(int) st[0]] = i) >= 0 && (st[0] = (a * st[0] + b) % m) >= 0)).findFirst().getAsInt() - seen[(int) st[0]]
            : 0);
    }
}
