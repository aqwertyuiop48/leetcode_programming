import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && IntStream.range(0, k).mapToObj(j -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken()) - 1, Long.parseLong(tk.nextToken()), j + 1}).toList() instanceof List<long[]> up
            && up.stream().filter(u -> u[0] == 1).collect(Collectors.toMap(u -> u[1], u -> u, (x, y) -> x[2] >= y[2] ? x : y)) instanceof Map<Long, long[]> asg
            && up.stream().filter(u -> u[0] == 2).collect(Collectors.groupingBy(u -> u[1])) instanceof Map<Long, List<long[]>> adds
            && Stream.concat(
                IntStream.range(0, n).boxed().flatMap(i -> Stream.concat(adds.getOrDefault((long) i, List.of()).stream().map(u -> new long[]{u[2], 2, u[3]}),
                        asg.containsKey((long) i) && asg.get((long) i)[2] > a[i] ? Stream.of(new long[]{asg.get((long) i)[2] - a[i], 1, asg.get((long) i)[3]}) : Stream.<long[]>empty())
                    .sorted((x, y) -> Long.compare(y[0], x[0])).collect(Collectors.toList()) instanceof List<long[]> sorted && new long[]{a[i]} instanceof long[] cur
                    ? sorted.stream().map(u -> new long[]{u[0], cur[0], u[1], u[2], (cur[0] += u[0]) * 0}) : Stream.<long[]>empty()),
                up.stream().filter(u -> u[0] == 3 && u[2] > 1).map(u -> new long[]{u[2] - 1, 1, 3, u[3], 0})).sorted((x, y) -> Long.compare(y[0] * x[1], x[0] * y[1])).limit(m).sorted(Comparator.comparingLong((long[] x) -> x[2]).thenComparingLong(x -> x[3])).toList() instanceof List<long[]> pick
            ? pick.size() + "\n" + pick.stream().map(x -> String.valueOf(x[3])).collect(Collectors.joining(" ")) : "");
    }
}
