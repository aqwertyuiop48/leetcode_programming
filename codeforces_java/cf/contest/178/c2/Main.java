import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer h
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(BigInteger.valueOf(h).gcd(BigInteger.valueOf(m)).intValue()) instanceof Integer g
            && Integer.valueOf(h / g) instanceof Integer len
            && Long.valueOf(len == 1 ? 0 : BigInteger.valueOf(m / g).modInverse(BigInteger.valueOf(len)).longValue()) instanceof Long inv
            && IntStream.range(0, g).mapToObj(c -> new TreeSet<Integer>(IntStream.range(0, len).boxed().toList())) instanceof Stream<TreeSet<Integer>> fs
            && fs.toList() instanceof List<TreeSet<Integer>> free
            && new HashMap<Integer, int[]>() instanceof HashMap<Integer, int[]> placed
            && new long[]{0} instanceof long[] total
            ? IntStream.range(0, n).allMatch(i -> ((String) it.next()) instanceof String op && Integer.valueOf(rd.getAsInt()) instanceof Integer id
                    && (op.equals("+")
                        ? Integer.valueOf(rd.getAsInt()) instanceof Integer x && Integer.valueOf(x % g) instanceof Integer c && Integer.valueOf((int) ((x / g) * inv % len)) instanceof Integer t
                            && Integer.valueOf(free.get(c).ceiling(t) != null ? free.get(c).ceiling(t) : free.get(c).first()) instanceof Integer slot
                            && (total[0] += (slot - t + len) % len) >= 0 && free.get(c).remove(slot) && placed.put(id, new int[]{c, slot}) == null
                        : placed.remove(id) instanceof int[] pl && free.get(pl[0]).add(pl[1]))) ? total[0] : -1
            : -1);
    }
}
