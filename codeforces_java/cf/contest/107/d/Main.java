import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Long) s.nextLong() instanceof Long n && (Integer) s.nextInt() instanceof Integer m && IntStream.range(0, m).mapToObj(i -> new Object[] {s.next(), s.nextInt()}).collect(Collectors.groupingBy(o -> (String) o[0], Collectors.mapping(o -> (Integer) o[1], Collectors.toList()))).values().stream().collect(Collectors.toCollection(ArrayList<List<Integer>>::new)) instanceof ArrayList<List<Integer>> cs && (Integer) cs.size() instanceof Integer k && cs.stream().mapToInt(l -> l.stream().reduce(1, (x, y) -> x / BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue() * y)).toArray() instanceof int[] c && IntStream.range(0, k).map(i -> IntStream.range(0, i).map(j -> c[j]).reduce(1, (x, y) -> x * y)).toArray() instanceof int[] stride && (Integer) IntStream.of(c).reduce(1, (x, y) -> x * y) instanceof Integer sz && new long[sz][sz] instanceof long[][] t && IntStream.range(0, sz).allMatch(st -> IntStream.range(0, k).allMatch(j -> (Integer) (st / stride[j] % c[j]) instanceof Integer r && (t[st][st + ((r + 1) % c[j] - r) * stride[j]] += 1) > 0)) && new long[][][] {t} instanceof long[][][] bb && new long[][] {IntStream.range(0, sz).mapToLong(i -> i == 0 ? 1 : 0).toArray()} instanceof long[][] rr && IntStream.rangeClosed(0, 63 - Long.numberOfLeadingZeros(n)).allMatch(bit -> ((n >> bit & 1) == 0 || (rr[0] = IntStream.range(0, sz).mapToLong(j -> IntStream.range(0, sz).mapToLong(q -> rr[0][q] * bb[0][q][j]).sum() % 12345).toArray()) != null) && (bb[0] = IntStream.range(0, sz).mapToObj(i -> IntStream.range(0, sz).mapToLong(j -> IntStream.range(0, sz).mapToLong(q -> bb[0][i][q] * bb[0][q][j]).sum() % 12345).toArray()).toArray(long[][]::new)) != null) ? IntStream.range(0, sz).filter(st -> IntStream.range(0, k).allMatch(i -> cs.get(i).stream().anyMatch(ci -> st / stride[i] % c[i] % ci == 0))).mapToLong(st -> rr[0][st]).sum() % 12345 : -1).ifPresent(System.out::println);
    }
}

