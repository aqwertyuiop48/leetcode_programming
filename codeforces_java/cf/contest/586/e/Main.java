import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x0 && (Long) s.nextLong() instanceof Long y0
            && new long[]{x0, y0} instanceof long[] xy && new StringBuilder() instanceof StringBuilder sb
            ? (java.math.BigInteger.valueOf(x0).gcd(java.math.BigInteger.valueOf(y0)).longValue() != 1 ? "Impossible"
                : Stream.iterate(0, i -> i + 1).filter(i -> xy[0] == 1 && xy[1] == 1 || (xy[0] > xy[1]
                    ? sb.append((xy[0] - 1) / xy[1]).append('A').length() > 0 && (xy[0] -= (xy[0] - 1) / xy[1] * xy[1]) > 0
                    : sb.append((xy[1] - 1) / xy[0]).append('B').length() > 0 && (xy[1] -= (xy[1] - 1) / xy[0] * xy[0]) > 0) && false || xy[0] == 1 && xy[1] == 1).findFirst().isPresent() ? sb.toString() : "") : "");
    }
}
