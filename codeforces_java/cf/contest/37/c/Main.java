import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).skip(1).mapToInt(Integer::parseInt).toArray() instanceof int[] l
            && new BigInteger[l.length] instanceof BigInteger[] res
            && new BigInteger[]{BigInteger.valueOf(-1)} instanceof BigInteger[] c
            && new int[]{0} instanceof int[] pl
            && IntStream.range(0, l.length).boxed().sorted(Comparator.comparingInt(i -> l[i])).allMatch(i ->
                Objects.nonNull(res[i] = c[0] = c[0].add(BigInteger.ONE).shiftLeft(l[i] - pl[0])) && (pl[0] = l[i]) > 0)
            && IntStream.range(0, l.length).allMatch(i -> res[i].bitLength() <= l[i])
            ? "YES\n" + IntStream.range(0, l.length).mapToObj(i -> "0".repeat(l[i] - res[i].toString(2).length()) + res[i].toString(2)).collect(Collectors.joining("\n"))
            : "NO");
    }
}
