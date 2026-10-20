import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer r && Integer.valueOf(w[1]) instanceof Integer c
            && Arrays.copyOfRange(w, 2, 2 + r) instanceof String[] g
            ? IntStream.range(0, r).map(i -> (int) IntStream.range(0, c).filter(j -> g[i].indexOf('S') < 0 || IntStream.range(0, r).noneMatch(k -> g[k].charAt(j) == 'S')).count()).sum() : "");
    }
}
