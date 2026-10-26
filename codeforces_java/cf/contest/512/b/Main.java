import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] l && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] c
            && new HashMap<Integer, Integer>(Map.of(0, 0)) instanceof HashMap<Integer, Integer> dp
            && IntStream.range(0, n).allMatch(i -> new ArrayList<>(dp.entrySet()) instanceof ArrayList<Map.Entry<Integer, Integer>> snap
                && snap.stream().allMatch(en -> dp.merge(BigInteger.valueOf(en.getKey()).gcd(BigInteger.valueOf(l[i])).intValue(), en.getValue() + c[i], Math::min) > 0 || true))
            ? "" + dp.getOrDefault(1, -1) : "");
    }
}
