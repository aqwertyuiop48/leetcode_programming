import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && (Integer) (int) (raw.length - IntStream.iterate(raw.length - 1, i -> i >= 0 && raw[i] <= 32, i -> i - 1).count()) instanceof Integer n
            && new int[n] instanceof int[] d1
            && new int[n] instanceof int[] d2
            && new int[]{0, -1, 0, -1} instanceof int[] so
            && new int[]{0, -1, 0, -1} instanceof int[] se
            && IntStream.range(0, 2 * n + 2).allMatch(t ->
                so[0] >= n
                || ((so[1] >= 0 || (so[1] = so[0] > so[3] ? 1 : Math.min(d1[so[2] + so[3] - so[0]], so[3] - so[0] + 1)) >= 0)
                    && (so[0] - so[1] >= 0 && so[0] + so[1] < n && raw[so[0] - so[1]] == raw[so[0] + so[1]]
                        ? ++so[1] > 0
                        : (d1[so[0]] = so[1]) > 0
                            && (so[0] + so[1] - 1 > so[3] ? (so[2] = so[0] - so[1] + 1) >= 0 && (so[3] = so[0] + so[1] - 1) >= 0 : true)
                            && ++so[0] > 0 && (so[1] = -1) < 0)))
            && IntStream.range(0, 2 * n + 2).allMatch(t ->
                se[0] >= n
                || ((se[1] >= 0 || (se[1] = se[0] > se[3] ? 0 : Math.min(d2[se[2] + se[3] - se[0] + 1], se[3] - se[0] + 1)) >= 0)
                    && (se[0] - se[1] - 1 >= 0 && se[0] + se[1] < n && raw[se[0] - se[1] - 1] == raw[se[0] + se[1]]
                        ? ++se[1] > 0
                        : (d2[se[0]] = se[1]) >= 0
                            && (se[0] + se[1] - 1 > se[3] ? (se[2] = se[0] - se[1]) >= 0 && (se[3] = se[0] + se[1] - 1) >= 0 : true)
                            && ++se[0] > 0 && (se[1] = -1) < 0)))
            && new byte[n + 1] instanceof byte[] degree
            && new long[1] instanceof long[] sum
            && IntStream.rangeClosed(1, n).allMatch(len ->
                (len % 2 == 1 ? d1[len / 2] == len / 2 + 1 : d2[len / 2] == len / 2)
                    ? (degree[len] = (byte) (degree[len / 2] + 1)) > 0 && (sum[0] += degree[len]) > 0
                    : true)
            ? sum[0]
            : 0L);
    }
}
