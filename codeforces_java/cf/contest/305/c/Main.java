import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && new TreeMap<Long, Long>() instanceof TreeMap<Long, Long> map
            && IntStream.range(0, n).allMatch(i -> map.merge(it.next(), 1L, Long::sum) > 0)
            && Stream.generate(map::pollFirstEntry).takeWhile(Objects::nonNull)
                .filter(en -> (en.getValue() < 2 || map.merge(en.getKey() + 1, en.getValue() / 2, Long::sum) > 0) && en.getValue() % 2 == 1)
                .map(Map.Entry::getKey).toList() instanceof List<Long> bits
            ? bits.get(bits.size() - 1) + 1 - bits.size() : "");
    }
}
