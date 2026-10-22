import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).toArray() instanceof int[] a
            && Long.valueOf(Arrays.stream(a).asLongStream().sum() / n) instanceof Long avg && new long[1] instanceof long[] c
            ? IntStream.range(0, n).mapToLong(i -> Math.abs((c[0] += a[i]) - (i + 1) * avg)).sum() : "");
    }
}
