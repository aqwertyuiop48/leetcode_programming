import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> ls
            ? ls.stream().skip(1).filter(l -> !l.isBlank()).map(l -> l.trim()).map(l -> l.contains("::")
                ? Arrays.stream(l.substring(0, l.indexOf("::")).split(":")).filter(x -> !x.isEmpty()).toList() instanceof List<String> left
                    && Arrays.stream(l.substring(l.indexOf("::") + 2).split(":")).filter(x -> !x.isEmpty()).toList() instanceof List<String> right
                    ? Stream.of(left.stream(), Collections.nCopies(8 - left.size() - right.size(), "0").stream(), right.stream()).flatMap(x -> x).toList() : null
                : Arrays.asList(l.split(":")))
                .map(g -> g.stream().map(x -> "0".repeat(4 - x.length()) + x).collect(Collectors.joining(":"))).collect(Collectors.joining("\n")) : "");
    }
}
