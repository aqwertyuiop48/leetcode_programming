import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToLong(Long::parseLong).toArray() instanceof long[] v
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Math.min(v[1 + 4 * i], v[3 + 4 * i])).toArray() instanceof long[] lx
            && IntStream.range(0, n).mapToLong(i -> Math.max(v[1 + 4 * i], v[3 + 4 * i])).toArray() instanceof long[] hx
            && IntStream.range(0, n).mapToLong(i -> Math.min(v[2 + 4 * i], v[4 + 4 * i])).toArray() instanceof long[] ly
            && IntStream.range(0, n).mapToLong(i -> Math.max(v[2 + 4 * i], v[4 + 4 * i])).toArray() instanceof long[] hy
            && IntStream.range(0, n).mapToLong(i -> (hx[i] - lx[i]) * (hx[i] - lx[i]) * (hx[i] - lx[i])).toArray() instanceof long[] m
            ? IntStream.rangeClosed(1, n).takeWhile(k -> IntStream.range(1, k).allMatch(j ->
                Long.valueOf(IntStream.range(j, k).mapToLong(i -> m[i]).sum()) instanceof Long S
                && Long.valueOf(IntStream.range(j, k).mapToLong(i -> m[i] * (lx[i] + hx[i])).sum()) instanceof Long SX
                && Long.valueOf(IntStream.range(j, k).mapToLong(i -> m[i] * (ly[i] + hy[i])).sum()) instanceof Long SY
                && SX >= 2 * S * Math.max(lx[j], lx[j - 1]) && SX <= 2 * S * Math.min(hx[j], hx[j - 1])
                && SY >= 2 * S * Math.max(ly[j], ly[j - 1]) && SY <= 2 * S * Math.min(hy[j], hy[j - 1]))).count()
            : 0);
    }
}




