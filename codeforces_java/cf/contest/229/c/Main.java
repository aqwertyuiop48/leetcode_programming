import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next()) instanceof Long n && Integer.valueOf(it.next().intValue()) instanceof Integer m
            && new long[(int) (n + 1)] instanceof long[] deg
            && IntStream.range(0, m).allMatch(i -> ++deg[it.next().intValue()] > 0 && ++deg[it.next().intValue()] > 0)
            ? n * (n - 1) * (n - 2) / 6 - Arrays.stream(deg).map(d -> d * (n - 1 - d)).sum() / 2 : "");
    }
}

