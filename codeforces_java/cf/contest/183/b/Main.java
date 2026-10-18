import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Long.valueOf(Long.parseLong((String) it.next())) instanceof Long n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new long[]{Long.parseLong((String) it.next()), Long.parseLong((String) it.next())}).toList() instanceof List<long[]> p
            && IntStream.range(0, m).boxed().flatMap(i -> IntStream.range(i + 1, m).filter(j -> p.get(i)[1] != p.get(j)[1]).mapToObj(j -> new int[]{i, j}))
                .map(ij -> Long.valueOf(p.get(ij[0])[0] * (p.get(ij[1])[1] - p.get(ij[0])[1]) - p.get(ij[0])[1] * (p.get(ij[1])[0] - p.get(ij[0])[0])) instanceof Long num
                    && Long.valueOf(p.get(ij[1])[1] - p.get(ij[0])[1]) instanceof Long dy && num % dy == 0 && num / dy >= 1 && num / dy <= n ? num / dy : 0L)
                .filter(x -> x > 0).collect(Collectors.toSet()) instanceof Set<Long> cand
            ? n + cand.stream().mapToLong(x0 -> p.stream().filter(q -> q[1] > 0).collect(Collectors.groupingBy(q -> (q[0] - x0) / BigInteger.valueOf(Math.abs(q[0] - x0)).gcd(BigInteger.valueOf(q[1])).longValue() * 2_000_000_011L + q[1] / BigInteger.valueOf(Math.abs(q[0] - x0)).gcd(BigInteger.valueOf(q[1])).longValue(), Collectors.counting()))
                .values().stream().mapToLong(c -> c).max().orElse(1) - 1).sum()
            : 0);
    }
}
