import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().map(String::trim).toList() instanceof List<String> L
            && Arrays.stream(L.get(0).split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && new boolean[h[0] * h[1]] instanceof boolean[] occ
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> pos
            ? L.stream().skip(1).limit(h[2]).map(line -> line.split(" +") instanceof String[] t
                ? (t[0].equals("+1")
                    ? IntStream.range((Integer.parseInt(t[1]) - 1) * h[1] + Integer.parseInt(t[2]) - 1, h[0] * h[1]).filter(i -> !occ[i]).boxed().findFirst()
                        .map(f -> (occ[f] = true) && pos.put(t[3], f) == null ? "" : "").orElse("")
                    : (pos.remove(t[1]) instanceof Integer g && !(occ[g] = false) ? (g / h[1] + 1) + " " + (g % h[1] + 1) : "-1 -1"))
                : "").filter(z -> !z.isEmpty()).collect(Collectors.joining("\n"))
            : "");
    }
}




