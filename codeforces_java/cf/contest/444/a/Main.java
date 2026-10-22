import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer m && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).toArray() instanceof int[] x
            ? String.format("%.10f", IntStream.range(0, m).mapToDouble(i -> Integer.valueOf(Integer.parseInt(t.nextToken()) - 1) instanceof Integer u
                && Integer.valueOf(Integer.parseInt(t.nextToken()) - 1) instanceof Integer v && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer c
                ? (x[u] + x[v]) / (double) c : 0).max().orElse(0)) : "");
    }
}
