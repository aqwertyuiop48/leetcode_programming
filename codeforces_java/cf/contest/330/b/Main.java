import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n && Integer.valueOf(w[1]) instanceof Integer m
            && new boolean[n + 1] instanceof boolean[] bad
            && IntStream.range(0, 2 * m).allMatch(i -> (bad[Integer.parseInt(w[2 + i])] = true))
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(i -> !bad[i]).findFirst().getAsInt()) instanceof Integer c
            ? (n - 1) + "\n" + IntStream.rangeClosed(1, n).filter(i -> i != c).mapToObj(i -> i + " " + c).collect(Collectors.joining("\n")) : "");
    }
}
