import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer m && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && ((IntUnaryOperator) x -> IntStream.iterate(x, y -> par[y]).filter(y -> par[y] == y).findFirst().getAsInt()) instanceof IntUnaryOperator find
            ? 1L << IntStream.range(0, m).filter(i -> Integer.valueOf(find.applyAsInt(Integer.parseInt(t.nextToken()))) instanceof Integer u
                && Integer.valueOf(find.applyAsInt(Integer.parseInt(t.nextToken()))) instanceof Integer v && u != v && (par[u] = v) > 0).count() : "");
    }
}
