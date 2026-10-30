import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            ? IntStream.range(0, n).mapToLong(i -> (Integer) s.nextInt() instanceof Integer x1 && (Integer) s.nextInt() instanceof Integer y1 && (Integer) s.nextInt() instanceof Integer x2 && (Integer) s.nextInt() instanceof Integer y2
                ? (long) (x2 - x1 + 1) * (y2 - y1 + 1) : 0L).sum() : 0);
    }
}
