import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer q
            && new LinkedHashMap<String, String>() instanceof LinkedHashMap<String, String> m
            && IntStream.range(0, q).allMatch(i -> s.next() instanceof String o && s.next() instanceof String w
                && (m.containsKey(o) ? m.put(w, m.remove(o)) == null : m.put(w, o) == null))
            ? m.size() + "\n" + m.entrySet().stream().map(e -> e.getValue() + " " + e.getKey()).collect(Collectors.joining("\n")) : "");
    }
}
