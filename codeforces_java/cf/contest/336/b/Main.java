import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long m && Double.valueOf(s.nextDouble()) instanceof Double r
            ? String.format("%.10f", (m * 2 * r + 2 * LongStream.range(1, m).mapToDouble(d -> (double) (m - d) * (2 * r * d + r * Math.sqrt(2))).sum()) / ((double) m * m)) : "");
    }
}
