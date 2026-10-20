import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(it.next()), Long.parseLong(it.next())}).toArray(long[][]::new) instanceof long[][] p
            ? String.format(Locale.US, "%.6f", IntStream.range(0, n).mapToLong(i -> IntStream.range(i + 1, n).mapToLong(j -> IntStream.range(0, n).mapToLong(k -> (p[j][0] - p[i][0]) * (p[k][1] - p[i][1]) - (p[j][1] - p[i][1]) * (p[k][0] - p[i][0])).toArray() instanceof long[] cs
                && Arrays.stream(cs).max().getAsLong() > 0 && Arrays.stream(cs).min().getAsLong() < 0 ? Arrays.stream(cs).max().getAsLong() - Arrays.stream(cs).min().getAsLong() : 0L).max().orElse(0L)).max().getAsLong() / 2.0) : "");
    }
}
