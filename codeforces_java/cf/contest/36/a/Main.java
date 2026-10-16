import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")[1] instanceof String s
            && IntStream.range(0, s.length()).filter(i -> s.charAt(i) == '1').toArray() instanceof int[] p
            ? (IntStream.range(1, p.length).map(i -> p[i] - p[i - 1]).distinct().count() <= 1 ? "YES" : "NO")
            : "");
    }
}



