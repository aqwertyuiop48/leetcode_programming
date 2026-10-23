import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            ? IntStream.range(0, m - 1).mapToLong(i -> Math.abs(a[i] - a[i + 1])).sum() - IntStream.range(0, m).boxed().flatMap(i -> IntStream.of(i - 1, i + 1).filter(j -> j >= 0 && j < m && a[j] != a[i]).mapToObj(j -> new int[]{a[i], a[j]}))
                .collect(Collectors.groupingBy(q -> q[0], Collectors.mapping(q -> q[1], Collectors.toList()))).entrySet().stream().mapToLong(e -> e.getValue().stream().sorted().toList() instanceof List<Integer> l
                    ? l.stream().mapToLong(v -> Math.abs(e.getKey() - v) - Math.abs(l.get(l.size() / 2) - v)).sum() : 0).max().orElse(0) : "");
    }
}
