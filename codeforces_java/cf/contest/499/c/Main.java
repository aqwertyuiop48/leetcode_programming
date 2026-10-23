import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long x1
            && Long.valueOf(sc.nextLong()) instanceof Long y1
            && Long.valueOf(sc.nextLong()) instanceof Long x2
            && Long.valueOf(sc.nextLong()) instanceof Long y2
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).filter(i ->
                new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong()} instanceof long[] l
                && (l[0] * x1 + l[1] * y1 + l[2] > 0) != (l[0] * x2 + l[1] * y2 + l[2] > 0)).count()
            : 0);
    }
}
