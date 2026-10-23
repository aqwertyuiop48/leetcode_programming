import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer v
            && new long[3003] instanceof long[] cnt && IntStream.range(0, n).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (cnt[a] += s.nextInt()) > 0)
            && new long[3003] instanceof long[] rem && new long[1] instanceof long[] tot
            && IntStream.rangeClosed(1, 3001).allMatch(d -> (Long) Math.min(v, rem[d - 1]) instanceof Long x && (Long) Math.min(v - x, cnt[d]) instanceof Long y && (rem[d] = cnt[d] - y) >= 0 && (tot[0] += x + y) >= 0)
            ? tot[0] : 0);
    }
}
