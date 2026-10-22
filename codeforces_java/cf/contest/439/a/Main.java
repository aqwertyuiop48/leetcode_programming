import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer d
            && IntStream.generate(() -> Integer.parseInt(t.nextToken())).limit(n).sum() instanceof Integer s
            ? (d - s - 10 * (n - 1) < 0 ? -1 : (d - s) / 5) : "");
    }
}
