import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long a && Long.valueOf(sc.nextLong()) instanceof Long b
            && sc.next() instanceof String s
            && s.chars().mapToLong(c -> c == 'R' ? 1 : c == 'L' ? -1 : 0).toArray() instanceof long[] dx
            && s.chars().mapToLong(c -> c == 'U' ? 1 : c == 'D' ? -1 : 0).toArray() instanceof long[] dy
            && Long.valueOf(LongStream.of(dx).sum()) instanceof Long tx && Long.valueOf(LongStream.of(dy).sum()) instanceof Long ty
            ? IntStream.rangeClosed(0, s.length()).anyMatch(k -> Long.valueOf(a - Arrays.stream(dx, 0, k).sum()) instanceof Long ra
                && Long.valueOf(b - Arrays.stream(dy, 0, k).sum()) instanceof Long rb
                && (tx == 0 && ty == 0 ? ra == 0 && rb == 0
                    : tx != 0 ? ra % tx == 0 && ra / tx >= 0 && rb == ra / tx * ty
                    : ra == 0 && rb % ty == 0 && rb / ty >= 0)) ? "Yes" : "No" : "");
    }
}
