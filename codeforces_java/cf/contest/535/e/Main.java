import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken()), i + 1}).toList() instanceof List<long[]> sw
            && new long[]{0} instanceof long[] best
            && sw.stream().sorted((x, y) -> x[0] != y[0] ? Long.compare(y[0], x[0]) : Long.compare(y[1], x[1])).filter(x -> x[1] > best[0] && (best[0] = x[1]) > 0).toList() instanceof List<long[]> kept
            && new ArrayList<long[]>() instanceof ArrayList<long[]> h
            && kept.stream().allMatch(p -> Stream.generate(() -> 0).takeWhile(z -> h.size() >= 2 && h.get(h.size() - 2) instanceof long[] p1 && h.get(h.size() - 1) instanceof long[] p2
                    && BigInteger.valueOf(p1[0] - p2[0]).multiply(BigInteger.valueOf(p2[1] - p[1])).multiply(BigInteger.valueOf(p[0])).multiply(BigInteger.valueOf(p1[1]))
                        .subtract(BigInteger.valueOf(p1[1] - p2[1]).multiply(BigInteger.valueOf(p2[0] - p[0])).multiply(BigInteger.valueOf(p1[0])).multiply(BigInteger.valueOf(p[1]))).signum() < 0)
                .allMatch(z -> h.remove(h.size() - 1) != null) && h.add(p))
            && h.stream().map(p -> p[0] * 1000000007L + p[1]).collect(Collectors.toSet()) instanceof Set<Long> keys
            ? sw.stream().filter(x -> keys.contains(x[0] * 1000000007L + x[1])).map(x -> String.valueOf(x[2])).collect(Collectors.joining(" ")) : "");
    }
}
