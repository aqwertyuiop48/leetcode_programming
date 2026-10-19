import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long y && Long.valueOf(s.nextLong()) instanceof Long n
            && new long[]{-1, 0, 1} instanceof long[] best
            && LongStream.rangeClosed(1, n).allMatch(b -> LongStream.of(x * b / y, x * b / y + 1).allMatch(a ->
                best[0] < 0 || Math.abs(x * b - a * y) * best[2] < best[0] * b
                    ? (best[0] = Math.abs(x * b - a * y)) >= 0 && (best[1] = a) >= 0 && (best[2] = b) > 0 : true))
            ? best[1] + "/" + best[2] : "");
    }
}
