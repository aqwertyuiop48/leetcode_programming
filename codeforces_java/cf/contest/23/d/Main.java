import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt()} instanceof int[] tArr
            ? IntStream.range(0, tArr[0]).mapToObj(tc ->
                new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()} instanceof double[] p
                ? IntStream.range(0, 3).mapToObj(r ->
                    new double[]{p[2 * ((r + 1) % 3)], p[2 * ((r + 1) % 3) + 1], p[2 * r], p[2 * r + 1], p[2 * ((r + 2) % 3)], p[2 * ((r + 2) % 3) + 1]} instanceof double[] q
                    && new double[]{q[2] - q[0], q[3] - q[1], (q[2] * q[2] + q[3] * q[3] - q[0] * q[0] - q[1] * q[1]) / 2,
                        q[4] - q[2], q[5] - q[3], 2 * (q[2] * (q[4] - q[2]) + q[3] * (q[5] - q[3])) - (q[4] * q[4] + q[5] * q[5] - q[2] * q[2] - q[3] * q[3]) / 2} instanceof double[] e
                    && Math.abs(e[0] * e[4] - e[1] * e[3]) > 1e-9
                    && new double[8] instanceof double[] v
                    && !Double.isNaN(v[2] = (e[2] * e[4] - e[1] * e[5]) / (e[0] * e[4] - e[1] * e[3]))
                    && !Double.isNaN(v[3] = (e[0] * e[5] - e[2] * e[3]) / (e[0] * e[4] - e[1] * e[3]))
                    && !Double.isNaN(v[0] = 2 * q[0] - v[2])
                    && !Double.isNaN(v[1] = 2 * q[1] - v[3])
                    && !Double.isNaN(v[4] = 2 * q[2] - v[2])
                    && !Double.isNaN(v[5] = 2 * q[3] - v[3])
                    && !Double.isNaN(v[6] = 2 * q[4] - v[4])
                    && !Double.isNaN(v[7] = 2 * q[5] - v[5])
                    && IntStream.range(0, 4).mapToDouble(i ->
                        (v[2 * ((i + 1) % 4)] - v[2 * i]) * (v[2 * ((i + 2) % 4) + 1] - v[2 * ((i + 1) % 4) + 1])
                        - (v[2 * ((i + 1) % 4) + 1] - v[2 * i + 1]) * (v[2 * ((i + 2) % 4)] - v[2 * ((i + 1) % 4)])).toArray() instanceof double[] cr
                    && (Arrays.stream(cr).allMatch(x -> x > 1e-9) || Arrays.stream(cr).allMatch(x -> x < -1e-9))
                        ? String.format(Locale.US, "YES\n%.9f %.9f %.9f %.9f %.9f %.9f %.9f %.9f", v[0], v[1], v[2], v[3], v[4], v[5], v[6], v[7])
                        : null)
                    .filter(Objects::nonNull).findFirst().orElse("NO\n")
                : "NO\n").collect(Collectors.joining("\n"))
            : "");
    }
}
