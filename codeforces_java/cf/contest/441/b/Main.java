import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer v
            && IntStream.range(0, n).mapToObj(i -> new int[]{Integer.parseInt(t.nextToken()), Integer.parseInt(t.nextToken())}).toArray(int[][]::new) instanceof int[][] ab
            && Arrays.stream(ab).mapToInt(x -> x[1]).toArray() instanceof int[] rem && new int[1] instanceof int[] c
            ? IntStream.rangeClosed(1, 3001).mapToLong(d -> (c[0] = v) >= 0
                ? Stream.concat(IntStream.range(0, n).filter(i -> ab[i][0] == d - 1).boxed(), IntStream.range(0, n).filter(i -> ab[i][0] == d).boxed())
                    .mapToLong(i -> Integer.valueOf(Math.min(rem[i], c[0])) instanceof Integer tk && (rem[i] -= tk) >= 0 && (c[0] -= tk) >= 0 ? tk : 0).sum() : 0).sum() : "");
    }
}
