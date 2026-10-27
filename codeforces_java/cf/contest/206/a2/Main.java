import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{it.next(), it.next(), it.next(), it.next(), it.next()}).toList() instanceof List<long[]> sc
            && new long[n] instanceof long[] cur && new long[n] instanceof long[] rem
            && IntStream.range(0, n).allMatch(i -> (cur[i] = sc.get(i)[1]) >= 0 && (rem[i] = sc.get(i)[0]) > 0)
            && new TreeSet<long[]>(Comparator.<long[]>comparingLong(e -> e[0]).thenComparingLong(e -> e[1])) instanceof TreeSet<long[]> set
            && IntStream.range(0, n).allMatch(i -> set.add(new long[]{cur[i], i}))
            && new long[]{Long.MIN_VALUE, 0} instanceof long[] last
            && Stream.generate(() -> set.isEmpty() ? null
                    : Optional.ofNullable(set.ceiling(new long[]{last[0], -1})).orElseGet(set::first) instanceof long[] e
                        && set.remove(e) && (last[1] += e[0] < last[0] ? 1 : 0) >= 0 && (last[0] = e[0]) > Long.MIN_VALUE
                        && Integer.valueOf((int) e[1]) instanceof Integer i
                        && ((rem[i] -= 1) > 0 ? (cur[i] = (cur[i] * sc.get(i)[2] + sc.get(i)[3]) % sc.get(i)[4]) >= 0 && set.add(new long[]{cur[i], i}) : true)
                        ? e[0] + " " + (i + 1) : null).takeWhile(Objects::nonNull).toList() instanceof List<String> lines
            ? last[1] + "\n" + String.join("\n", lines) : "");
    }
}

