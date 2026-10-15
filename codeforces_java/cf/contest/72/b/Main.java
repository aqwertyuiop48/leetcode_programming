import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new TreeMap<String, TreeMap<String, String>>() instanceof TreeMap<String, TreeMap<String, String>> m
                && m.computeIfAbsent("", k -> new TreeMap<>()) != null
                && new String[]{""} instanceof String[] cur
                && Integer.valueOf(Integer.parseInt(s.nextLine().trim())) instanceof Integer n
                && IntStream.range(0, n).allMatch(i ->
                    (s.hasNextLine() ? s.nextLine().strip() : "") instanceof String l
                    && (l.isEmpty() || l.charAt(0) == 59
                        ? true
                        : l.charAt(0) == '['
                            ? (cur[0] = l.substring(1, l.indexOf(']')).strip()) != null && m.computeIfAbsent(cur[0], k -> new TreeMap<>()) != null
                            : m.get(cur[0]).put(l.substring(0, l.indexOf('=')).strip(), l.substring(l.indexOf('=') + 1).strip()) != null || true))
                ? m.entrySet().stream()
                    .flatMap(e -> Stream.concat(
                        e.getKey().isEmpty() ? Stream.<String>empty() : Stream.of("[" + e.getKey() + "]"),
                        e.getValue().entrySet().stream().map(kv -> kv.getKey() + "=" + kv.getValue())))
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}


