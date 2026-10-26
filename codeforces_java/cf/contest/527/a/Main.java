import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long a && (Long) s.nextLong() instanceof Long b
            ? Stream.iterate(new long[]{a, b, 0}, st -> st[1] > 0, st -> new long[]{st[1], st[0] % st[1], st[2] + st[0] / st[1]}).map(st -> st[0] / st[1]).mapToLong(x -> x).sum() : 0);
    }
}
