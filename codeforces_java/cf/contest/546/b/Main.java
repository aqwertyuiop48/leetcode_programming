import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && new long[]{-1000000000, 0} instanceof long[] st
            ? IntStream.range(0, n).mapToLong(i -> s.nextLong()).sorted().map(x -> (st[0] = Math.max(x, st[0] + 1)) - x).sum() : 0);
    }
}
