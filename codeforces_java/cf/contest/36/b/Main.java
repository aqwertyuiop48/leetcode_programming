import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer k
            && Integer.valueOf((int) Math.round(Math.pow(n, k))) instanceof Integer sz
            ? IntStream.range(0, sz).mapToObj(r -> IntStream.range(0, sz)
                .mapToObj(c -> IntStream.range(0, k).anyMatch(l -> t[2 + r / (int) Math.round(Math.pow(n, l)) % n].charAt(c / (int) Math.round(Math.pow(n, l)) % n) == '*') ? "*" : ".")
                .collect(Collectors.joining())).collect(Collectors.joining("\n"))
            : "");
    }
}

