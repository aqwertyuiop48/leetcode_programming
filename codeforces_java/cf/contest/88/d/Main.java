import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextLine().trim()) instanceof Integer n
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> m
            ? IntStream.range(0, n).mapToObj(i -> s.nextLine().trim().split(" ")).map(t ->
                t[1].replaceAll("[&*]", "") instanceof String base
                && (Integer) (base.equals("void") ? 0 : base.equals("errtype") ? -1 : m.getOrDefault(base, -1)) instanceof Integer v
                && (Integer) (v < 0 ? -1 : Math.max(-1, v + t[1].replaceAll("[^*]", "").length() - t[1].replaceAll("[^&]", "").length())) instanceof Integer r
                ? t[0].equals("typeof")
                    ? (r < 0 ? "errtype" : "void" + "*".repeat(r))
                    : m.put(t[2], r) == null ? "" : ""
                : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n"))
            : ""));
    }
}


