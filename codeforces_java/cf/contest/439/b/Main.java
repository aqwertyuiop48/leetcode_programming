import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer x
            && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).sorted().toArray() instanceof int[] c
            ? IntStream.range(0, n).mapToLong(i -> (long) c[i] * Math.max(x - i, 1)).sum() : "");
    }
}
