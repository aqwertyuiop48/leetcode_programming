import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).toArray(String[]::new) instanceof String[] w
            && Integer.valueOf(w[0]) instanceof Integer n
            && Arrays.copyOfRange(w, 1, 1 + n) instanceof String[] g
            ? (Arrays.stream(g).allMatch(s -> s.indexOf('.') >= 0) ? IntStream.range(0, n).mapToObj(i -> (i + 1) + " " + (g[i].indexOf('.') + 1)).collect(Collectors.joining("\n"))
                : IntStream.range(0, n).allMatch(j -> Arrays.stream(g).anyMatch(s -> s.charAt(j) == '.')) ? IntStream.range(0, n).mapToObj(j -> (IntStream.range(0, n).filter(i -> g[i].charAt(j) == '.').findFirst().getAsInt() + 1) + " " + (j + 1)).collect(Collectors.joining("\n")) : "-1") : "");
    }
}
