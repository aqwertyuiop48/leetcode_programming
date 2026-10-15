import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToLong(Long::parseLong).toArray() instanceof long[] v
            ? IntStream.range(0, (int) v[0]).mapToObj(i -> Long.valueOf(Math.min(v[2 + 2 * i], v[3 + 2 * i])) instanceof Long a
                && Long.valueOf(Math.max(v[2 + 2 * i], v[3 + 2 * i])) instanceof Long b
                ? (v[1] == 1 ? (a % 2 == 0 || b % 2 == 0 ? "+" : "-")
                    : a % (v[1] + 1) == 0 ? "+" : ((b - a) % 2 == 0) != ((a / (v[1] + 1)) % 2 == 1) ? "-" : "+")
                : "").collect(Collectors.joining("\n"))
            : "");
    }
}

