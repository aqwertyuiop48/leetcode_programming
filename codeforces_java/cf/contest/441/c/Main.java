import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer m && Integer.valueOf(t.nextToken()) instanceof Integer k
            ? IntStream.range(0, k).mapToObj(i -> (i < k - 1 ? 2 : n * m - 2 * (k - 1)) + " "
                + IntStream.range(2 * i, i < k - 1 ? 2 * i + 2 : n * m).mapToObj(tt -> Integer.valueOf(tt / m) instanceof Integer r
                    ? (r + 1) + " " + ((r % 2 == 0 ? tt % m : m - 1 - tt % m) + 1) : "").collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
