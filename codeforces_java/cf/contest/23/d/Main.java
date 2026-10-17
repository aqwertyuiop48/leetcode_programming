import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && new int[]{tk[0]} instanceof int[] tArr
            ? IntStream.range(0, tArr[0]).mapToObj(tc ->
                new double[]{tk[1 + 6 * tc], tk[2 + 6 * tc], tk[3 + 6 * tc], tk[4 + 6 * tc], tk[5 + 6 * tc], tk[6 + 6 * tc]} instanceof double[] p
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
                        ? "YES\n" + Arrays.stream(v).mapToObj(x -> (Long) Math.round(Math.abs(x) * 1e9) instanceof Long rr ? (x < -5e-10 ? "-" : "") + rr / 1000000000L + "." + ("000000000" + rr % 1000000000L).substring(String.valueOf(rr % 1000000000L).length()) : "").collect(Collectors.joining(" "))
                        : null)
                    .filter(Objects::nonNull).findFirst().orElse("NO\n")
                : "NO\n").collect(Collectors.joining("\n"))
            : "");
    }
}

